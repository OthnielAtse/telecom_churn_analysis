# Churn Customer Data Analysis

**ETL automatisé & Data Warehouse avec Apache Airflow, Talend et PostgreSQL**

---

## 1. Présentation du projet

Ce projet met en œuvre une **chaîne de traitement de données de bout en bout** permettant de collecter, transformer, stocker et analyser des données clients liées au churn.

L’objectif principal est de concevoir une **architecture data industrialisée**, automatisée et reproductible, proche des standards utilisés en entreprise, depuis l’ingestion des données jusqu’à leur exploitation en Business Intelligence.

---

## 2. Architecture globale

```
Sources CSV
   ↓
Talend (ETL)
   ↓
PostgreSQL – Data Warehouse
   ↓
Apache Airflow (Orchestration)
   ↓
Power BI (Reporting)
```

### Technologies utilisées

* **Docker & Docker Compose** : conteneurisation de la stack
* **Apache Airflow** : orchestration, planification et monitoring des pipelines
* **Talend Open Studio** : extraction, transformation et chargement des données
* **PostgreSQL** :

  * Base Airflow (métadonnées)
  * Base Data Warehouse (`CHURN_DWH_DB`)
* **Power BI** : visualisation et analyse des données

---

## 3. Organisation du projet

```
.
├── ORCHESTRATION/
│   └── AIRFLOW/
│       ├── dags/
│       │   └── churn_pipeline.py
│       ├── logs/
│       └── plugins/
│
├── INGESTION/
│   ├── TALEND/
│   │   └── JOBS/
│   │       ├── jExtractData/
│   │       ├── jLoadDimensions/
│   │       └── jLoadFact/
│   └── ALL DATA/
│       ├── INPUT/
│       └── DATA/
│
├── sql/
│   
│
├── docker-compose.yml
└── README.md
```

---

## 4. Prérequis

Avant de lancer le projet, s’assurer que les éléments suivants sont installés :

* Docker ≥ 20.x
* Docker Compose ≥ v2
* Power BI Desktop
* Git (optionnel)

---

## 5. Paramétrage et configuration

### Connexions Airflow

Les connexions sont injectées automatiquement via des variables d’environnement :

```
AIRFLOW_CONN_POSTGRES_CHURN=postgresql://postgres:admin@postgres:5432/CHURN_DWH_DB
```

Elles sont ensuite utilisées dynamiquement dans les DAGs via :

* `conn.POSTGRES_CHURN.host`
* `conn.POSTGRES_CHURN.port`
* `conn.POSTGRES_CHURN.login`
* `conn.POSTGRES_CHURN.password`
* `conn.POSTGRES_CHURN.schema`

### Variables Airflow

```
AIRFLOW_VAR_TALEND_BASE_PATH=/opt/airflow/talend_jobs
```

Utilisation dans les DAGs :

```
{{ var.value.TALEND_BASE_PATH }}
```

---

## 6. Lancement du projet

### 6.1 Démarrage de l’infrastructure

```bash
docker compose up --build
```

Ce lancement déclenche automatiquement :

* l’initialisation d’Airflow
* la création de l’utilisateur administrateur
* le démarrage du scheduler et du webserver
* l’exécution automatique du pipeline principal

---

## 7. Orchestration Airflow

Le DAG principal est configuré avec :

* `schedule_interval = "@once"`
* `catchup = False`

Le pipeline s’exécute **automatiquement au démarrage**, sans intervention manuelle via l’UI Airflow.

### Étapes du pipeline

1. **Initialisation du Data Warehouse**

   * Création des schémas `CHURN_DWH` et `PARAMS_LOG`
   * Création des tables de dimensions et de faits

2. **Extraction**

   * Lecture des fichiers CSV depuis le dossier `INPUT`
   * Paramétrage dynamique via Airflow

3. **Transformation**

   * Nettoyage et normalisation des données
   * Gestion des règles métiers
   * Gestion des rejets

4. **Chargement**

   * Alimentation des tables dimensionnelles
   * Chargement de la table de faits

5. **Contrôles de qualité**

   * Vérification du volume de données
   * Validation de la cohérence du chargement

---

## 8. Vérification des données dans PostgreSQL

Connexion au conteneur PostgreSQL :

```bash
docker exec -it postgres_dwh psql -U postgres -d CHURN_DWH_DB
```

Lister les tables du Data Warehouse :

```sql
\dt "CHURN_DWH".*;
```

Vérifier le volume de données :

```sql
SELECT COUNT(*) FROM "CHURN_DWH"."FACT_CUSTOMER_CHURN";
```

---

## 9. Exploitation avec Power BI

### Paramètres de connexion

* Serveur : `localhost`
* Port : `5432`
* Base de données : `CHURN_DWH_DB`
* Schéma : `CHURN_DWH`

<!-- ### Analyses réalisées

* Analyse du churn client
* Indicateurs de rétention
* Segmentation clients
* Analyses temporelles et géographiques -->

---

## 10. Qualité et robustesse

* Orchestration fiable avec Airflow
* Logs centralisés
* Reprises automatiques en cas d’échec (2 retry)
* Paramétrage dynamique (aucune valeur en dur)
* Séparation claire entre orchestration, traitement et stockage

---

## 11. Compétences mises en œuvre

* Data Engineering
* ETL / ELT (avec Talend Open Studio)
* Orchestration de pipelines 
* Modélisation Data Warehouse
* SQL avancé
* Docker & Docker Compose
<!-- * Business Intelligence -->

---

## 12. Améliorations possibles

* Tests de qualité avancés 
<!-- * Gestion des erreurs métiers avancée -->
* CI/CD
* Déploiement Cloud (AWS / GCP / Azure)
* Data Catalog et documentation automatique

---

## Conclusion

Ce projet démontre la mise en œuvre complète d’une plateforme data industrialisée, de l’ingestion des données jusqu’à leur exploitation analytique, en s’appuyant sur des technologies largement utilisées en environnement professionnel.
