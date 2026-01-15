----------------------------------------------------------------------------
----------- Script de suppression des données insérées dans l'DWH ----------
----------------------------------------------------------------------------                                                   s                  
-- Définir le schéma à utiliser
SET SEARCH_PATH = "CHURN_CUSTOMER_DWH";

-- Suppression clients
TRUNCATE "DWH_DIM_CUSTOMER" CASCADE;

-- Suppression des localisations
TRUNCATE "DWH_DIM_LOCATION" CASCADE;

-- Suppression des offres des contracts
TRUNCATE "DWH_DIM_CONTRACT" CASCADE;

-- Suppression des type des modes de payement
TRUNCATE "DWH_DIM_PAYMENT" CASCADE;

-- Suppression des offres
TRUNCATE "DWH_DIM_OFFER" CASCADE;

-- Suppression des offres
TRUNCATE "DWH_DIM_SERVICE" CASCADE;

-- Suppression des churns 
TRUNCATE "DWH_DIM_CHURN" CASCADE;

-- Suppression des faits de la table des faits 
TRUNCATE "FACT_CUSTOMER_CHURN" CASCADE;

-- Suppression des rejets 
TRUNCATE "DWH_REJET" CASCADE;

-- Suppression des rejets
SELECT * FROM "DWH_DIM_CHURN";