-- Я мог не совсем верно понять условие. Опишу, как его понял я. Есть таблица, где записаны даты 
-- рождения пользователей. Необходимо выделить тех, кто родился в мае и августе, при этом сравнение про-
-- водить с заданным списком английских названий месяцев. В таком случае, решение: 

-- пример 

DROP TABLE IF EXISTS users; 

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) COMMENT 'Имя пользователя',
	birth_at DATE
) COMMENT = 'Табица пользователей';

INSERT INTO users VALUES
(NULL, 'ivan', '2010-01-01'),
(NULL,'dima','2019-01-01'),
(NULL,'katya','2017-10-01'),
(NULL,'liza','2018-12-11'),
(NULL,'sveta','2018-08-11'),
(NULL,'lescha','2018-05-11'),
(NULL,'andrew','2018-08-15')
;

-- решение

SELECT * FROM users WHERE DATE_FORMAT(birth_at, '%M') IN ('august', 'may');


