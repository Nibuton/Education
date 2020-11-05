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
(NULL, 'cat4'),
(NULL, 'cat5'),
(NULL, 'cat6');

INSERT INTO products VALUES 
(NULL,'pro1',1),
(NULL,'pro2',2),
(NULL,'pro3',1),
(NULL,'pro4',3),
(NULL,'pro5',6),
(NULL,'pro6',2),
(NULL,'pro7',1),
(NULL,'pro8',5),
(NULL,'pro9',6),
(NULL,'pro10',4),
(NULL,'pro11',NULL)
;

-- Решение. Испольуем LEFT JOIN, чтобы не потерять продукты с нулевым значением catalog_id, как pro11. В том случае, 
-- если нам требуются записи только с наличиствующей категорией, можно использовать INNER JOIN

SELECT 
pr.id, pr.name AS product_name, ca.name AS category 
FROM products pr 
LEFT JOIN catalogs ca ON pr.catalog_id = ca.id
;



