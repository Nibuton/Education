DROP TABLE IF EXISTS products; 
DROP TRIGGER IF EXISTS insert_check_nulls;
DROP TRIGGER IF EXISTS update_check_nulls;

CREATE TABLE products(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255),
	description VARCHAR(255)
);

-- создаем триггеры

DELIMITER // 

CREATE TRIGGER insert_check_nulls BEFORE INSERT ON products
FOR EACH ROW
BEGIN 
	IF COALESCE(new.name, new.description) IS NULL THEN 
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Insert canceled';
	END IF;
END //

CREATE TRIGGER update_check_nulls BEFORE UPDATE ON products
FOR EACH ROW
BEGIN 
	IF COALESCE(new.name, new.description) IS NULL THEN 
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Update canceled';
	END IF;
END //

DELIMITER ;

INSERT INTO products VALUES
(NULL, 'mouse', 'aaaaa'),
(NULL,'keybord',NULL),
(NULL,NULL,'bbbbbbb'),
(NULL,'screen','ccccc'),
(NULL,NULL,'dddddddd');


-- проверка срабатывания триггера на инсерт --

INSERT INTO products VALUES (NULL, NULL, NULL);

-- проверка срабатывания триггера на апдейт -- 

UPDATE products SET name = NULL, description = NULL WHERE id = 2;
