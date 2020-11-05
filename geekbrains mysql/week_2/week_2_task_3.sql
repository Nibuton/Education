
-- Создадим пример для проверки 

USE sample;

DROP TABLE IF EXISTS cat;
CREATE TABLE cat (
	id SERIAL PRIMARY KEY,
	same VARCHAR(255)
	);
	
INSERT INTO cat VALUES
(DEFAULT, 'processor'),
(DEFAULT, 'keyboard'),
(DEFAULT, 'mouse'),
(DEFAULT, 'buttons')
;

USE shop;

DROP TABLE IF EXISTS catalogs;
CREATE TABLE catalogs (
	id SERIAL PRIMARY KEY,
	same VARCHAR(255)
	);

INSERT INTO catalogs VALUES
(DEFAULT, 'screen'),
(DEFAULT, 'mouse'),
(DEFAULT, 'keyboard')
;


-- решение

REPLACE INTO sample.cat 
SELECT *
FROM 
catalogs 
;

-- проверим

SELECT * FROM sample.cat

