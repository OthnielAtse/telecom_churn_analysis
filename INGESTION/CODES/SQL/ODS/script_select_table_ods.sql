----------------------------------------------------------------------------
------------ Script de sélection des données insérées dans l'ODS -----------
----------------------------------------------------------------------------
-- Définir le schéma à utiliser
SET SEARCH_PATH = "CHURN_CUSTOMER_ODS";

-- Suppression clients
SELECT * FROM ODS_DIM_CUSTOMER;

-- Suppression des localisations
SELECT * FROM ODS_DIM_LOCATION;

-- Liste des offres des contracts
SELECT * FROM ODS_DIM_CONTRACT;

-- Liste des type des modes de payement
SELECT * FROM ODS_DIM_PAYMENT;

-- Liste des offres
SELECT * FROM ODS_DIM_OFFER;

-- Liste des churns 
SELECT * FROM ODS_DIM_CHURN;

-- Liste des faits de la table des faits 
SELECT * FROM FACT_CUSTOMER_CHURN;

-- Liste des rejets
SELECT * FROM ODS_REJET;

