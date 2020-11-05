-- пример

DROP TABLE IF EXISTS users; 

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	created_at DATE
);

INSERT INTO users VALUES
(NULL, '2018-08-01'), 
(NULL, '2018-08-02'), 
(NULL, '2018-08-3'),
(NULL, '2018-08-4'),
(NULL, '2018-08-5'),
(NULL, '2018-08-6'),
(NULL, '2018-08-7'),
(NULL, '2018-08-8'),
(NULL, '2018-08-9'),
(NULL, '2018-08-10'),
(NULL, '2018-08-11'),
(NULL, '2018-08-12'),
(NULL, '2019-01-01')
;


-- Кажется, по тому, что я прочитал, MySQL не поддреживает LIMIT в подзапросах и не может исполь-
-- зовать переменные внутри самого LIMIT. Иначе можно было бы сделать так или использовать перменную: 
-- DELETE FROM users WHERE id NOT IN (SELECT id FROM users ORDER BY created_at DESC LIMIT 5);
-- Решение придумал такое:

DROP TABLE IF EXISTS users_top;

CREATE TEMPORARY TABLE users_top(
	id SERIAL PRIMARY KEY,
	created_at DATE
);

INSERT INTO users_top SELECT * FROM users ORDER BY created_at DESC limit 0,5;

DELETE us FROM users us LEFT JOIN users_top uc ON us.id = uc.id WHERE uc.id IS NULL;

SELECT * FROM users;

DROP TABLE users_top;