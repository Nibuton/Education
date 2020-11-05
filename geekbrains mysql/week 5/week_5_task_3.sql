-- пример 

ALTER database shop DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

DROP TABLE IF EXISTS flights;
DROP TABLE IF EXISTS cities;

CREATE TABLE IF NOT EXISTS flights(
	id SERIAL PRIMARY KEY,
	`from` VARCHAR(255),
	`to` VARCHAR(255)
) ;

CREATE TABLE IF NOT EXISTS cities(
	id SERIAL PRIMARY KEY,
	label VARCHAR(255),
	name VARCHAR(255)
) ;

INSERT INTO flights VALUES
(DEFAULT,'moscow','paris'),
(DEFAULT,'london','paris'),
(DEFAULT,'moscow','amsterdam'),
(DEFAULT,'amsterdam','london'),
(DEFAULT,'prague','moscow');

INSERT INTO cities VALUES 
(DEFAULT,'moscow','Москва'),
(DEFAULT,'london','Лондон'),
(DEFAULT,'paris','Париж'),
(DEFAULT,'amsterdam','Амстердам'),
(DEFAULT,'prague','Прага');

-- решение

SELECT fl.id, ct1.name AS `from`, ct2.name AS `to`
FROM flights fl 
LEFT JOIN cities ct1 
ON fl.`from` = ct1.label
LEFT JOIN cities ct2
ON fl.`to` = ct2.label 
ORDER BY fl.id
;
