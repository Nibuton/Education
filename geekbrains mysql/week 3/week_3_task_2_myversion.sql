USE shop;

DROP TABLE IF EXISTS users; 

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) COMMENT 'Имя пользователя',
	created_at VARCHAR(255),
	updated_at VARCHAR(255)
) COMMENT = 'Табица пользователей';

INSERT INTO users VALUES
(NULL, 'nikita','2018.01.01 23:13', '2018.01.01 1:01'),
(NULL, 'ivan', '2010.01.01 10:10', '2011.01.01 11:02'),
(NULL,'dima','2019.01.01 10:45','2018.02.01 11:50'),
(NULL,'katya','2017.10.01 8:15','2018.03.01 10:45'),
(NULL,'liza','2018.12.11 7:00','2016.10.11 10:10')
;

SELECT STR_TO_DATE('2018.01.01 23:13', '%Y.%m.%d %H:%i:%s');


