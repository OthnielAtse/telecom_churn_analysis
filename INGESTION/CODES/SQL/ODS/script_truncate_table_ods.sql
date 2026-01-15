----------------------------------------------------------------------------
----------- Script de suppression des données insérées dans l'ODS ----------
----------------------------------------------------------------------------                                                   s                  
-- Définir le schéma à utiliser
SET SEARCH_PATH = "CHURN_CUSTOMER_ODS";

-- Suppression clients
TRUNCATE "ODS_DIM_CUSTOMER";

-- Suppression des localisations
TRUNCATE "ODS_DIM_LOCATION";

-- Liste des offres des contracts
TRUNCATE "ODS_DIM_CONTRACT";

-- Liste des type des modes de payement
TRUNCATE "ODS_DIM_PAYMENT";

-- Liste des offres
TRUNCATE "ODS_DIM_OFFER";

-- Liste des churns 
TRUNCATE "ODS_DIM_CHURN";

-- Liste des faits de la table des faits 
TRUNCATE "FACT_CUSTOMER_CHURN";

-- Liste des rejets 
TRUNCATE "ODS_REJET";

-- Liste des rejets
SELECT * FROM "ODS_REJET";