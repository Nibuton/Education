-- при моих настройках сервера (я не менял базовые) работает за 27 секунд. Также был вариант использовать метод
-- LOAD DATA, но и так вышло не слишком долго.  

DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS new_users;
DROP PROCEDURE IF EXISTS mil_rows;


CREATE TABLE IF NOT EXISTS users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS new_users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255)
);

DELIMITER //

CREATE PROCEDURE mil_rows()
BEGIN 
	DECLARE i INT;
	SET i = 0;
	WHILE i < 10 DO
		INSERT INTO new_users VALUE(NULL,'');
		SET i = i + 1;
	END WHILE;
END //

DELIMITER ;

CALL mil_rows();

INSERT INTO users SELECT NULL, NULL
FROM new_users u1 
INNER JOIN new_users u2 ON u1.name = u2.name 
INNER JOIN new_users u3 ON u2.name = u3.name
INNER JOIN new_users u4 ON u3.name = u4.name
INNER JOIN new_users u5 ON u4.name = u5.name
INNER JOIN new_users u6 ON u5.name = u6.name;

SELECT COUNT(*) FROM users;

SELECT * FROM users limit 100;

