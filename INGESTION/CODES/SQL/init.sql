-- Création du schéma CHURN_CUSTOMER_DWH
DROP SCHEMA IF EXISTS "CHURN_CUSTOMER_DWH";
CREATE SCHEMA "CHURN_CUSTOMER_DWH";

-- Création du schéma PARAMS_LOG
DROP SCHEMA IF EXISTS "PARAMS_LOG";
CREATE SCHEMA "PARAMS_LOG";


----------------------------------------------------------------------------
------------------ Script de création de la table CONTEXTE -----------------
----------------------------------------------------------------------------
-- Définir le schéma à utiliser
SET SEARCH_PATH = "PARAMS_LOG";


----------------------------------------------------------------------------
-------------------- Table N°1 : "PARAMS_LOG"."CONTEXTE" -------------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "CONTEXTE";
CREATE TABLE "CONTEXTE"
(
    key   VARCHAR(100) NOT NULL,
    value VARCHAR(255) ,
    CONSTRAINT "CONTEXTE_PKEY" PRIMARY KEY (key)
);


----------------------------------------------------------------------------
----------- Script d'insertion de données dans la table CONTEXTE -----------
----------------------------------------------------------------------------
-- Définir le schéma à utiliser
SET SEARCH_PATH = "PARAMS_LOG";


----------------------------------------------------------------------------
-------- Requête N°1 : Insertion initiale des paramètres de contexte -------
----------------------------------------------------------------------------
INSERT INTO "CONTEXTE"
VALUES 

-- Database connexion params --------
('serverName','localhost'),
('database','CHURN_CUSTOMER_DWH'),
('port','5435'),
('schema_param','PARAMS_LOG'),
('schema_dwh','CHURN_CUSTOMER_DWH'),
('user','postgres'),
('password','admin'),
('additionalParam',''),

-- Project Variables --------
('dataFolder','./INGESTION/ALL DATA/DATA/'),
('fieldSeparator',','),
('encodage','UTF-8'),

-- Config Churn File params  --------
('churnFileRepo','./INGESTION/ALL DATA/INPUT/'),
('churnFileName','telecom_customer_churn.csv'),
('populationFileName','telecom_zipcode_population.csv'),
('exportedFileName','clients_exportes.csv');




----------------------------------------------------------------------------
----------------- Script de création des différentes tables ----------------
----------------------------------------------------------------------------

-- Définir le schéma à utiliser
SET SEARCH_PATH = "CHURN_CUSTOMER_DWH";


----------------------------------------------------------------------------
--------------- Table N°2 : "CHURN_CUSTOMER_DWH"."DWH_DIM_LOCATION" -------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_LOCATION" ;
CREATE TABLE "DWH_DIM_LOCATION" (
  "LOCATION_ID"     INT          NOT NULL,
  "CITY"            VARCHAR(50)  NOT NULL,
  "ZIP_CODE"        VARCHAR(10)  NOT NULL,
  "LATITUDE"        FLOAT        NOT NULL,
  "LONGITUDE"       FLOAT        NOT NULL,
  "LB_NOM_FICHIER"  VARCHAR(100) NOT NULL,	
  "DT_INSERTION"    TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	    VARCHAR(100) NOT NULL,
  CONSTRAINT "DWH_DIM_LOCATION_PKEY" PRIMARY KEY ("LOCATION_ID")
);

----------------------------------------------------------------------------
----------------- Table N°1 : "CHURN_CUSTOMER_DWH"."DWH_DIM_CUSTOMER" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_CUSTOMER" ;
CREATE TABLE "DWH_DIM_CUSTOMER" (
  "CUSTOMER_ID"       VARCHAR(20)  NOT NULL,
  "LOCATION_ID"       INT          NOT NULL,
  "GENDER"            VARCHAR(10)  NOT NULL,
  "AGE"               INT          NOT NULL,
  "MARRIED"           VARCHAR(10)  NOT NULL,
  "NUMBER_DEPENDENTS" INT          NOT NULL,
  "NUMBER_REFERRALS"  INT          NOT NULL,
  "LB_NOM_FICHIER"    VARCHAR(100) NOT NULL,	
  "DT_INSERTION"      TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	      VARCHAR(100) NOT NULL,
  FOREIGN KEY ("LOCATION_ID") REFERENCES "DWH_DIM_LOCATION"("LOCATION_ID"),
  CONSTRAINT "DWH_DIM_CUSTOMER_PKEY" PRIMARY KEY ("CUSTOMER_ID")
);

----------------------------------------------------------------------------
--------------- Table N°3 : "CHURN_CUSTOMER_DWH"."DWH_DIM_CONTRACT" -------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_CONTRACT" ;
CREATE TABLE "DWH_DIM_CONTRACT" (
  "CONTRACT_ID"       INT          NOT NULL,
  "CONTRACT_TYPE"     VARCHAR(20)  NOT NULL,
  "PAPERLESS_BILLING" VARCHAR(30)  NOT NULL,
  "LB_NOM_FICHIER"    VARCHAR(50)  NOT NULL,	
  "DT_INSERTION"      TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	      VARCHAR(50)  NOT NULL,
  CONSTRAINT "DWH_DIM_CONTRACT_PKEY" PRIMARY KEY ("CONTRACT_ID")
);


----------------------------------------------------------------------------
------------------- Table N°4 : "CHURN_CUSTOMER_DWH"."DWH_DIM_PAYMENT" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_PAYMENT" ;
CREATE TABLE "DWH_DIM_PAYMENT" (
  "PAYMENT_ID"      INT           NOT NULL,
  "PAYMENT_METHOD"  VARCHAR(20)   NOT NULL,
  "LB_NOM_FICHIER"  VARCHAR(50)  NOT NULL,	
  "DT_INSERTION"    TIMESTAMP     NOT NULL,
  "LB_JOB_NAME"	  	VARCHAR(50)  NOT NULL,
  CONSTRAINT "DWH_DIM_PAYMENT_PKEY" PRIMARY KEY ("PAYMENT_ID")
); 



----------------------------------------------------------------------------
------------------- Table N°5 : "CHURN_CUSTOMER_DWH"."DWH_DIM_OFFER" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_OFFER" ;
CREATE TABLE "DWH_DIM_OFFER" (
  "OFFER_ID"        INT          NOT NULL,
  "OFFER"           VARCHAR(20)  NOT NULL,
  "LB_NOM_FICHIER"  VARCHAR(50) NOT NULL,	
  "DT_INSERTION"    TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	    VARCHAR(50) NOT NULL,
  CONSTRAINT "DWH_DIM_OFFER_PKEY" PRIMARY KEY ("OFFER_ID")
);

----------------------------------------------------------------------------
------------------- Table N°6 : "CHURN_CUSTOMER_DWH"."DWH_DIM_CHURN" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_CHURN" ;
CREATE TABLE "DWH_DIM_CHURN" (
  "CHURN_ID"         INT          NOT NULL,
  "CUSTOMER_STATUS"  VARCHAR(10)  NOT NULL,
  "CHURN_CATEGORY"   VARCHAR(30)          ,
  "CHURN_REASON"     TEXT                 ,
  "LB_NOM_FICHIER"   VARCHAR(50) NOT NULL,	
  "DT_INSERTION"     TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	     VARCHAR(50) NOT NULL,
  CONSTRAINT "DWH_DIM_CHURN_PKEY" PRIMARY KEY ("CHURN_ID")
);


----------------------------------------------------------------------------
------------------- Table N°6 : "CHURN_CUSTOMER_DWH"."DWH_DIM_SERVICE" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_DIM_SERVICE";
CREATE TABLE "DWH_DIM_SERVICE" (
  "SERVICE_ID"           INT          NOT NULL,
  "PHONE_SERVICE"        VARCHAR(5)   NOT NULL,
  "MULTIPLE_LINES"       VARCHAR(5)               ,
  "INTERNET_SERVICE"     VARCHAR(5)   NOT NULL,
  "INTERNET_TYPE"        VARCHAR(50)          ,   -- NULL SI PAS D'INTERNET
  "ONLINE_SECURITY"      VARCHAR(5)               ,
  "ONLINE_BACKUP"        VARCHAR(5)               ,
  "DEVICE_PROTECTION"    VARCHAR(5)               ,
  "PREMIUM_TECH_SUPPORT" VARCHAR(5)               ,
  "STREAMING_TV"         VARCHAR(5)               ,
  "STREAMING_MOVIES"     VARCHAR(5)               ,
  "STREAMING_MUSIC"      VARCHAR(5)               ,
  "UNLIMITED_DATA"       VARCHAR(5)               ,
  "LB_NOM_FICHIER"       VARCHAR(100) NOT NULL,	
  "DT_INSERTION"         TIMESTAMP    NOT NULL,
  "LB_JOB_NAME"	         VARCHAR(100) NOT NULL,
  CONSTRAINT "DWH_DIM_SERVICE_PKEY" PRIMARY KEY ("SERVICE_ID")
);


----------------------------------------------------------------------------
--------------- Table N°6 : "CHURN_CUSTOMER_DWH"."FACT_CUSTOMER_CHURN" ----------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "FACT_CUSTOMER_CHURN" ;

CREATE TABLE "FACT_CUSTOMER_CHURN"(
  "CUSTOMER_ID"                 VARCHAR(20)   NOT NULL,
  "OFFER_ID"                    INT           NOT NULL,
  "CONTRACT_ID"                 INT           NOT NULL,
  "PAYMENT_ID"                  INT           NOT NULL,
  "SERVICE_ID"                  INT           NOT NULL,
  "CHURN_ID"                    INT           NOT NULL,

  "AVG_MONTHLY_LONG_DISTANCE_CHARGES" FLOAT,
  "AVG_MONTHLY_GB_DOWNLOAD"           FLOAT ,
  "MONTHLY_CHARGE"                    FLOAT NOT NULL,
  "TOTAL_REVENUE"                     FLOAT NOT NULL,
  "TOTAL_CHARGES"                     FLOAT NOT NULL,
  "TOTAL_REFUNDS"                     FLOAT NOT NULL,
  "TOTAL_EXTRA_DATA_CHARGES"          FLOAT NOT NULL,
  "TOTAL_LONG_DISTANCE_CHARGES"       FLOAT NOT NULL,
  "TENURE_IN_MONTHS"                  INT NOT NULL,
  "LB_NOM_FICHIER"                    VARCHAR(100) NOT NULL,	
  "DT_INSERTION"                      TIMESTAMP NOT NULL,
  "LB_JOB_NAME"	                      VARCHAR(100) NOT NULL,
    
  FOREIGN KEY ("CUSTOMER_ID") REFERENCES "DWH_DIM_CUSTOMER"("CUSTOMER_ID"),
  FOREIGN KEY ("OFFER_ID") REFERENCES "DWH_DIM_OFFER"("OFFER_ID"),
  FOREIGN KEY ("CONTRACT_ID") REFERENCES "DWH_DIM_CONTRACT"("CONTRACT_ID"),
  FOREIGN KEY ("PAYMENT_ID") REFERENCES "DWH_DIM_PAYMENT"("PAYMENT_ID"),
  FOREIGN KEY ("SERVICE_ID") REFERENCES "DWH_DIM_SERVICE"("SERVICE_ID"),
  FOREIGN KEY ("CHURN_ID") REFERENCES "DWH_DIM_CHURN"("CHURN_ID"),
  CONSTRAINT "FACT_CUSTOMER_CHURN_PKEY" PRIMARY KEY ("CUSTOMER_ID", "OFFER_ID", "CONTRACT_ID", "PAYMENT_ID", "SERVICE_ID", "CHURN_ID")

);


----------------------------------------------------------------------------
--------------------- Table N°7 : "CHURN_CUSTOMER_DWH"."DWH_REJET" ------------------
----------------------------------------------------------------------------
DROP TABLE IF EXISTS "DWH_REJET" ;
CREATE TABLE "DWH_REJET" 
(
"LB_CHEMIN_FICHIER" VARCHAR(255)   NOT NULL,
"LB_NOM_FICHIER" 	  VARCHAR(100)   NOT NULL,	
"NUM_LIGNE_REJET" 	INTEGER        NOT NULL,
"LB_LIGNE_REJET" 	  VARCHAR(500)   NOT NULL,
"LB_MESSAGE_REJET" 	VARCHAR(100)   NOT NULL,
"LB_NOM_FLUX"		    VARCHAR(100)   NOT NULL,
"DT_REJET"    	  	TIMESTAMP      NOT NULL,
"LB_JOB_NAME"	  	  VARCHAR(100)   NOT NULL, 
CONSTRAINT "DWH_REJET_PKEY" PRIMARY KEY ("LB_CHEMIN_FICHIER", "LB_NOM_FICHIER", "NUM_LIGNE_REJET", "LB_LIGNE_REJET")
);

