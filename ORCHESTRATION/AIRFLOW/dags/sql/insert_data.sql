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
('serverName','postgres'),
('database','CHURN_DWH_DB'),
('port','5432'),
('schema_param','PARAMS_LOG'),
('schema_dwh','CHURN_DWH'),
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
