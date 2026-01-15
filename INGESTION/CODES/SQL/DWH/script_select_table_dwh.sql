----------------------------------------------------------------------------
------------ Script de sélection des données insérées dans l'DWH -----------
----------------------------------------------------------------------------
-- Définir le schéma à utiliser
SET SEARCH_PATH = "CHURN_CUSTOMER_DWH";

-- Suppression clients
SELECT * FROM DWH_DIM_CUSTOMER;

-- Suppression des localisations
SELECT * FROM DWH_DIM_LOCATION;

-- Liste des offres des contracts
SELECT * FROM DWH_DIM_CONTRACT;

-- Liste des type des modes de payement
SELECT * FROM DWH_DIM_PAYMENT;

-- Liste des offres
SELECT * FROM DWH_DIM_OFFER;

-- Liste des churns 
SELECT * FROM DWH_DIM_CHURN;

-- Liste des faits de la table des faits 
SELECT * FROM FACT_CUSTOMER_CHURN;

-- Liste des rejets
SELECT * FROM DWH_REJET;

