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
('serverName','localhost'),
('database','CHURN_CUSTOMER_DB'),
('port','5432'),
('schema_param','PARAMS_LOG'),
('utilisateur','postgres'),
('password','admin'),
('additionalParam',''),
('projectFolder','D:/Universite de Tours -Antenne de Blois/Data Analyst Learning/Power Bi Projects/BI Churn Project/Talend Project'), 
('dataFolder','DATA/'),
('fieldSeparator',','),
('encodage','UTF-8'),
('ChurnFileRepo','INPUT/'),
('CustumerChurnFileName','telecom_customer_churn.csv'),
('PopulationFileName','telecom_zipcode_population.csv'),
('ExportedClientsFileName','clients_exportes.csv');