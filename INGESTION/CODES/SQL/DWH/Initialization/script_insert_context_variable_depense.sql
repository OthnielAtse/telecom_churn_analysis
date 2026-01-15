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
('port','5433'),
('schema_param','PARAMS_LOG'),
('schema_dwh','CHURN_CUSTOMER_DWH'),
('user','postgres'),
('password','admin'),
('additionalParam',''),

-- Project Variables --------
('projectFolder','D:/Universite de Tours -Antenne de Blois/Data Analyst Learning/Power Bi Projects/Projects/BI Churn Project/Talend Project/'), 
('dataFolder','DATA/'),
('fieldSeparator',','),
('encodage','UTF-8'),

-- Config Churn File params  --------
('churnFileRepo','INPUT/'),
('churnFileName','telecom_customer_churn.csv'),
('populationFileName','telecom_zipcode_population.csv'),
('exportedFileName','clients_exportes.csv');