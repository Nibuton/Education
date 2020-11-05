-- Не уверен, что абсолютно верно понял условия. Понять можно двояко:
-- 1. Переместить строку с заменой
-- 2. Переместить строку и добавить в конец таблицы. 
-- Решение привел для обоих вариантов.
USE shop;

DROP TABLE IF EXISTS orders; 
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255)
);

INSERT INTO users VALUES
(NULL,'us111'),
(NULL, 'us2'),
(NULL, 'us3'),
(NULL, 'us4'),
(NULL, 'us7'),
(NULL, 'us8');

USE sample;

DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255)
);

INSERT INTO users VALUES
(NULL,'us1'),
(NULL, 'us2'),
(NULL, 'us3'),
(NULL, 'us4'),
(NULL, 'us5'),
(NULL, 'us6');

-- ПЕРВЫЙ ВАРИАНТ

START TRANSACTION;
INSERT INTO sample.users SELECT * FROM shop.users 
WHERE shop.users.id = 1 ON DUPLICATE KEY UPDATE name = VALUES(name);
COMMIT;

--  ВТОРОЙ ВАРИАНТ

/* START TRANSACTION;
INSERT INTO sample.users SELECT NULL, name FROM shop.users 
WHERE shop.users.id = 1;
COMMIT; */

SELECT * FROM sample.users;
