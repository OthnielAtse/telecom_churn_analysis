----------------------------------------------------------------------------
----------------- Script de création des différentes tables ----------------
----------------------------------------------------------------------------

-- Définir le schéma à utiliser
SET SEARCH_PATH = "CHURN_CUSTOMER_ODS";


----------------------------------------------------------------------------
----------------- Table N°1 : "CHURN_CUSTOMER_ODS"."ODS_DIM_CUSTOMER" ----------------
----------------------------------------------------------------------------
CREATE TABLE "ODS_DIM_CUSTOMER" 
CREATE TABLE "ODS_DIM_CUSTOMER" (
  "CUSTOMER_ID"       VARCHAR(20)  NOT NULL,
  "GENDER"            VARCHAR(10)  NOT NULL,
  "AGE"               INT          NOT NULL,
  "MARRIED"           BOOLEAN      NOT NULL,
  "NUMBER_DEPENDENTS" INT          NOT NULL,
  "NUMBER_REFERRALS"  INT          NOT NULL,
  "LB_NOM_FICHIER"    VARCHAR(100) NOT NULL,	
  "DT_INSERTION"      TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	      VARCHAR(100) NOT NULL,
  CONSTRAINT "ODS_DIM_CUSTOMER_PKEY" PRIMARY KEY ("CUSTOMER_ID")
);


----------------------------------------------------------------------------
--------------- Table N°2 : "CHURN_CUSTOMER_ODS"."ODS_DIM_LOCATION" -------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_DIM_LOCATION" ;
CREATE TABLE "ODS_DIM_LOCATION" (
  "LOCATION_ID"     INT          NOT NULL,
  "CITY"            VARCHAR(50)  NOT NULL,
  "ZIP_CODE"        VARCHAR(10)  NOT NULL,
  "LATITUDE"        FLOAT        NOT NULL,
  "LONGITUDE"       FLOAT        NOT NULL,
  "LB_NOM_FICHIER"  VARCHAR(100) NOT NULL,	
  "DT_INSERTION"    TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	    VARCHAR(100) NOT NULL,
  CONSTRAINT "ODS_DIM_LOCATION_PKEY" PRIMARY KEY ("LOCATION_ID")
);


----------------------------------------------------------------------------
--------------- Table N°3 : "CHURN_CUSTOMER_ODS"."ODS_DIM_CONTRACT" -------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_DIM_CONTRACT" ;
CREATE TABLE "ODS_DIM_CONTRACT" (
  "CONTRACT_ID"       INT          NOT NULL,
  "CONTRACT_TYPE"     VARCHAR(20)  NOT NULL,
  "PAPERLESS_BILLING" BOOLEAN      NOT NULL,
  "LB_NOM_FICHIER"    VARCHAR(100) NOT NULL,	
  "DT_INSERTION"      TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	      VARCHAR(100) NOT NULL,
  CONSTRAINT "ODS_DIM_CONTRACT_PKEY" PRIMARY KEY ("CONTRACT_ID")

);


----------------------------------------------------------------------------
------------------- Table N°4 : "CHURN_CUSTOMER_ODS"."ODS_DIM_PAYMENT" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_DIM_PAYMENT" ;
CREATE TABLE "ODS_DIM_PAYMENT" (
  "PAYMENT_ID"      INT           NOT NULL,
  "PAYMENT_METHOD"  VARCHAR(50)   NOT NULL,
  "LB_NOM_FICHIER"  VARCHAR(100)  NOT NULL,	
  "DT_INSERTION"    TIMESTAMP     NOT NULL,
  "LB_JOB_NAME"	  	VARCHAR(100)  NOT NULL,
  CONSTRAINT "ODS_DIM_PAYMENT_PKEY" PRIMARY KEY ("PAYMENT_ID")
); 



----------------------------------------------------------------------------
------------------- Table N°5 : "CHURN_CUSTOMER_ODS"."ODS_DIM_OFFER" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_DIM_OFFER" ;
CREATE TABLE "ODS_DIM_OFFER" (
  "OFFER_ID"        INT          NOT NULL,
  "OFFER_NAME"      VARCHAR(50)  NOT NULL,
  "LB_NOM_FICHIER"  VARCHAR(100) NOT NULL,	
  "DT_INSERTION"    TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	    VARCHAR(100) NOT NULL,
  CONSTRAINT "ODS_DIM_OFFER_PKEY" PRIMARY KEY ("OFFER_ID")
);

----------------------------------------------------------------------------
------------------- Table N°6 : "CHURN_CUSTOMER_ODS"."ODS_DIM_CHURN" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_DIM_CHURN" ;
CREATE TABLE "ODS_DIM_CHURN" (
  "CHURN_ID"         INT          NOT NULL,
  "CUSTOMER_STATUS"  VARCHAR(20)  NOT NULL,
  "CHURN_CATEGORY"   VARCHAR(50)  NOT NULL,
  "CHURN_REASON"     TEXT         NOT NULL,
  "LB_NOM_FICHIER"   VARCHAR(100) NOT NULL,	
  "DT_INSERTION"     TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	     VARCHAR(100) NOT NULL,
  CONSTRAINT "ODS_DIM_CHURN_PKEY" PRIMARY KEY ("CHURN_ID")
);


----------------------------------------------------------------------------
------------------- Table N°6 : "CHURN_CUSTOMER_ODS"."ODS_DIM_SERVICE" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_DIM_SERVICE";
CREATE TABLE "ODS_DIM_SERVICE" (
  "SERVICE_ID"           INT          NOT NULL,
  "SERVICE_HASH"         VARCHAR(50)  NOT NULL,
  "PHONE_SERVICE"        BOOLEAN      NOT NULL,
  "MULTIPLE_LINES"       BOOLEAN      NOT NULL,
  "INTERNET_SERVICE"     BOOLEAN      NOT NULL,
  "INTERNET_TYPE"        VARCHAR(50)  NOT NULL,        -- NULL SI PAS D'INTERNET
  "ONLINE_SECURITY"      BOOLEAN      NOT NULL,
  "ONLINE_BACKUP"        BOOLEAN      NOT NULL,
  "DEVICE_PROTECTION"    BOOLEAN      NOT NULL,
  "PREMIUM_TECH_SUPPORT" BOOLEAN      NOT NULL,
  "STREAMING_TV"         BOOLEAN      NOT NULL,
  "STREAMING_MOVIES"     BOOLEAN      NOT NULL,
  "STREAMING_MUSIC"      BOOLEAN      NOT NULL,
  "UNLIMITED_DATA"       BOOLEAN      NOT NULL,
  "LB_NOM_FICHIER"       VARCHAR(100) NOT NULL,	
  "DT_INSERTION"         TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	         VARCHAR(100) NOT NULL,
  CONSTRAINT "ODS_DIM_SERVICE_PKEY" PRIMARY KEY ("SERVICE_ID")
);


----------------------------------------------------------------------------
--------------- Table N°6 : "CHURN_CUSTOMER_ODS"."FACT_CUSTOMER_CHURN" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "FACT_CUSTOMER_CHURN" ;

CREATE TABLE "FACT_CUSTOMER_CHURN"(
  "CUSTOMER_ID"                 VARCHAR(20)   NOT NULL,
  "OFFER_ID"                    INT           NOT NULL,
  "CONTRACT_ID"                 INT           NOT NULL,
  "PAYMENT_ID"                  INT           NOT NULL,
  "SERVICE_ID"                  INT           NOT NULL,
  "LOCATION_ID"                 INT           NOT NULL,
  "CHURN_ID"                    INT           NOT NULL,
  
  "MONTHLY_CHARGE"              NUMERIC(10,2) NOT NULL,
  "TOTAL_REVENUE"               NUMERIC(12,2) NOT NULL,
  "TOTAL_CHARGES"               NUMERIC(12,2) NOT NULL,
  "TOTAL_REFUNDS"               NUMERIC(12,2) NOT NULL,
  "TOTAL_EXTRA_DATA_CHARGES"    NUMERIC(12,2) NOT NULL,
  "TOTAL_LONG_DISTANCE_CHARGES" NUMERIC(12,2) NOT NULL,
  "TENURE_IN_MONTHS"            INT           NOT NULL,
  "LB_NOM_FICHIER"              VARCHAR(100)  NOT NULL,	
  "DT_INSERTION"                TIMESTAMP     NOT NULL,
  "LB_JOB_NAME"	                VARCHAR(100)  NOT NULL,
    
  FOREIGN KEY (CUSTOMER_ID) REFERENCES ODS_DIM_CUSTOMER("CUSTOMER_ID"),
  FOREIGN KEY (OFFER_ID) REFERENCES ODS_DIM_OFFER("OFFER_ID"),
  FOREIGN KEY (CONTRACT_ID) REFERENCES ODS_DIM_CONTRACT("CONTRACT_ID"),
  FOREIGN KEY (PAYMENT_ID) REFERENCES ODS_DIM_PAYMENT("PAYMENT_ID"),
  FOREIGN KEY (SERVICE_ID) REFERENCES ODS_DIM_SERVICE("SERVICE_ID"),
  FOREIGN KEY (LOCATION_ID) REFERENCES ODS_DIM_LOCATION("LOCATION_ID"),
  FOREIGN KEY (CHURN_ID) REFERENCES ODS_DIM_CHURN("CHURN_ID"),
  CONSTRAINT "FACT_CUSTOMER_CHURN_PKEY" PRIMARY KEY ("CUSTOMER_ID", "OFFER_ID", "CONTRACT_ID", "PAYMENT_ID", "SERVICE_ID", "LOCATION_ID", "CHURN_ID")

);


----------------------------------------------------------------------------
--------------------- Table N°7 : "CHURN_CUSTOMER_ODS"."ODS_REJET" ------------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "ODS_REJET" ;
CREATE TABLE "ODS_REJET" 
(
"LB_CHEMIN_FICHIER" VARCHAR(255) NOT NULL,
"LB_NOM_FICHIER" 	VARCHAR(100) NOT NULL,	
"NUM_LIGNE_REJET" 	INTEGER      NOT NULL,
"LB_LIGNE_REJET" 	VARCHAR(500) NOT NULL,
"LB_MESSAGE_REJET" 	VARCHAR(100) NOT NULL,
"LB_NOM_FLUX"		VARCHAR(100) NOT NULL,
"DT_REJET"    		TIMESTAMP    NOT NULL,
"LB_JOB_NAME"	  	VARCHAR(100) NOT NULL, 
CONSTRAINT "ODS_REJET_PKEY" PRIMARY KEY ("LB_CHEMIN_FICHIER", "LB_NOM_FICHIER", "NUM_LIGNE_REJET", "LB_LIGNE_REJET")
);