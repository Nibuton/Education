USE shop;

DROP TABLE IF EXISTS users; 

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) COMMENT 'Имя пользователя',
	created_at TIMESTAMP NULL DEFAULT NULL,
	updated_at TIMESTAMP NULL DEFAULT NULL
) COMMENT = 'Табица пользователей';

INSERT INTO users VALUES
(NULL, 'nikita', NOW(), NOW()),
(NULL, 'ivan', '2018-01-01 10:00:00', NOW()),
(NULL,'dima',NULL,NULL),
(NULL,'katya','2017-10-01 10:00:00',NULL),
(NULL,'liza',NULL,'2016-10-11 10:00:00')
;

UPDATE users SET created_at = COALESCE (created_at , NOW()) , 
updated_at = COALESCE (updated_at , NOW());

SELECT * FROM users;