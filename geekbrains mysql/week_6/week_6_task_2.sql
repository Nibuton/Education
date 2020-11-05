-- пример

DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS catalogs;

CREATE TABLE catalogs (
  id SERIAL PRIMARY KEY,
  name varchar(255) DEFAULT 'empty'
);

CREATE TABLE products (
  id SERIAL PRIMARY KEY,
  name varchar(255) DEFAULT 'empty',
  catalog_id BIGINT UNSIGNED DEFAULT NULL,
  CONSTRAINT catalog_id_key FOREIGN KEY(catalog_id) REFERENCES catalogs(id)
  	ON UPDATE CASCADE ON DELETE SET NULL
);

INSERT INTO catalogs VALUES
(NULL,'cat1'),
(NULL, 'cat2'),
(NULL, 'cat3'),
(NULL, 'cat4');

INSERT INTO products VALUES 
(NULL,'pro1',1),
(NULL,'pro2',2),
(NULL,'pro3',1),
(NULL,'pro4',3),
(NULL,'pro9',2),
(NULL,'pro10',4);

-- решение

CREATE OR REPLACE VIEW product_category AS 
SELECT 
	pr.name AS product, 
	ca.name AS category
FROM 
	products pr
INNER JOIN 
	catalogs ca
	ON pr.catalog_id = ca.id 
WITH CHECK OPTION
;

-- проверка

SELECT * FROM product_category;
