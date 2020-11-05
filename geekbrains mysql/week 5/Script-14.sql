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

START TRANSACTION;
INSERT INTO sample.users SELECT * FROM shop.users WHERE shop.users.id = 1 ON DUPLICATE KEY UPDATE name = VALUES(name);
COMMIT;

SELECT * FROM sample.users;
