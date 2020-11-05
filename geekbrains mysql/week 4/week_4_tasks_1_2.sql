-- пример

DROP TABLE IF EXISTS users; 

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) COMMENT 'Имя пользователя',
	birth_at DATE
) COMMENT = 'Табица пользователей';

INSERT INTO users VALUES
(NULL, 'ivan', '1994-01-01'), -- среда, 26 полных лет
(NULL,'dima','1976-03-11'), -- среда, 44 полных года
(NULL,'katya','1999-10-19'), -- понедельник,20 полных лет
(NULL,'liza','2000-12-17'), -- четверг, 19 полных лет
(NULL,'sveta','2010-08-26'), -- среда, 9 полных лет
(NULL,'lescha','2001-05-28'), -- четверг, 18 полных лет
(NULL,'andrew','2018-04-14'), -- вторник, 1 полный год
(NULL, 'denis', '2000-12-19')-- суббота, 19 полных лет

-- среднее - 19.5

;

-- решение задачи номер 1


SELECT AVG(TIMESTAMPDIFF(YEAR, birth_at, NOW())) AS avg_age FROM users;


-- решение задачи номер 2 

SELECT 
	DAYNAME(birth_at + INTERVAL YEAR(NOW()) - YEAR(birth_at) YEAR) AS day_of_week,
	COUNT(id) AS number_of_users
FROM users
GROUP BY
	day_of_week
ORDER BY
	number_of_users DESC

; 
