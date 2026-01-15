from airflow import DAG
from airflow.operators.bash import BashOperator
from airflow.providers.postgres.operators.postgres import PostgresOperator
from airflow.operators.empty import EmptyOperator
from airflow.utils.dates import days_ago
from datetime import timedelta

# -----------------------
# Default arguments
# -----------------------
default_args = {
    "owner": "airflow",
    "retries": 2,
    "retry_delay": timedelta(minutes=5),
}

# -----------------------
# DAG definition
# -----------------------
with DAG(
    dag_id="churn_pipeline",
    default_args=default_args,
    start_date=days_ago(1),
    schedule_interval="@once",
    catchup=False,
    tags=["churn", "talend", "postgres", "etl"],
) as dag:

    # -----------------------
    # Start
    # -----------------------
    start = EmptyOperator(task_id="start")

    # -----------------------
    # Database init
    # -----------------------
    create_schema = PostgresOperator(
        task_id="create_schema",
        postgres_conn_id="POSTGRES_CHURN",
        sql="sql/create_schema.sql",
    )

    create_tables = PostgresOperator(
        task_id="create_tables",
        postgres_conn_id="POSTGRES_CHURN",
        sql="sql/create_tables.sql",
    )

    insert_data = PostgresOperator(
        task_id="insert_data",
        postgres_conn_id="POSTGRES_CHURN",
        sql="sql/insert_data.sql",
    )

    # -----------------------
    # Talend - Extract & Transform
    # -----------------------
    extract_data = BashOperator(
        task_id="extract_data",
        bash_command="""
        set -e
        cd {{ var.value.TALEND_BASE_PATH }}/EXTRACT_TRANSFORM/jExtractData && \
        ./jExtractData_run.sh \
          --context_param serverName={{ conn.POSTGRES_CHURN.host }} \
          --context_param port={{ conn.POSTGRES_CHURN.port }} \
          --context_param database={{ conn.POSTGRES_CHURN.schema }} \
          --context_param user={{ conn.POSTGRES_CHURN.login }} \
          --context_param password={{ conn.POSTGRES_CHURN.password }} \
          --context_param dataFolder=/opt/airflow/data/ \
          --context_param churnFileRepo=/opt/airflow/input/
        """,
    )

    # -----------------------
    # Talend - Load
    # -----------------------
    load_data = BashOperator(
        task_id="load_data",
        bash_command="""
        set -e
        cd {{ var.value.TALEND_BASE_PATH }}/LOAD/jLoadDataDwh && \
        ./jLoadDataDwh_run.sh \
          --context_param serverName={{ conn.POSTGRES_CHURN.host }} \
          --context_param port={{ conn.POSTGRES_CHURN.port }} \
          --context_param database={{ conn.POSTGRES_CHURN.schema }} \
          --context_param user={{ conn.POSTGRES_CHURN.login }} \
          --context_param password={{ conn.POSTGRES_CHURN.password }} \
          --context_param dataFolder=/opt/airflow/data/ \
          --context_param churnFileRepo=/opt/airflow/input/
        """,
    )

    # -----------------------
    # Data Quality Check
    # -----------------------
    data_quality = PostgresOperator(
        task_id="data_quality_checks",
        postgres_conn_id="POSTGRES_CHURN",
        sql="""
        DO $$
        DECLARE
            row_count INT;
        BEGIN
            SELECT COUNT(*) INTO row_count
            FROM "CHURN_DWH"."FACT_CUSTOMER_CHURN";

            IF row_count = 0 THEN
                RAISE EXCEPTION 
                'Data quality failed: FACT_CUSTOMER_CHURN is empty';
            END IF;
        END $$;
        """,
    )


    # -----------------------
    # End
    # -----------------------
    end = EmptyOperator(task_id="end")

    # -----------------------
    # Dependencies
    # -----------------------
    

    start >> create_schema >> create_tables >> insert_data >> extract_data >> load_data >> data_quality >> end
