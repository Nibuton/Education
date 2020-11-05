DROP USER user_read;

DROP TABLE IF EXISTS accounts; 

USE shop;

CREATE TABLE accounts(

id SERIAL PRIMARY KEY,
name VARCHAR(255),
`password` VARCHAR(255)
);

INSERT INTO accounts VALUES
(NULL, 'user_1', 'pass1'),
(NULL, 'user_2', 'pass2'),
(NULL, 'user_3', 'pass3')
;

CREATE OR REPLACE VIEW username AS SELECT id, name FROM accounts WITH CHECK OPTION;

CREATE USER user_read IDENTIFIED WITH sha256_password BY 'read';
GRANT SELECT ON shop.username TO user_read;
