-- пример

DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) COMMENT 'Имя пользователя'
) COMMENT = 'Табица пользователей';

CREATE TABLE orders(
	id SERIAL PRIMARY KEY,
	user_id BIGINT UNSIGNED DEFAULT NULL,
	CONSTRAINT user_id_key FOREIGN KEY (user_id) REFERENCES users(id) ON UPDATE CASCADE ON DELETE SET NULL
);

INSERT INTO users VALUES
(NULL,'us1'),
(NULL, 'us2'),
(NULL, 'us3'),
(NULL, 'us4'),
(NULL, 'us5'),
(NULL, 'us6');

INSERT INTO orders VALUES 
(NULL,1),
(NULL,2),
(NULL,1),
(NULL,3),
(NULL,3),
(NULL,2),
(NULL,1),
(NULL,5);

-- Ниже два варианта решения данной задачи

-- 1 variant

SELECT distinct us.name FROM 
users us INNER JOIN orders orde ON us.id = orde.user_id;

-- 2 variant

SELECT users.name FROM users WHERE EXISTS (SELECT 1 FROM orders WHERE orders.user_id = users.id);




