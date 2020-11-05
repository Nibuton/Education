DROP FUNCTION IF EXISTS hello;

DELIMITER //

CREATE FUNCTION hello()
RETURNS VARCHAR(255) DETERMINISTIC
BEGIN
	DECLARE hr INT;
	SET hr = TIME_FORMAT(CURRENT_TIMESTAMP(),'%H');
	IF (hr >= 6 AND hr < 12) THEN RETURN ('Доброе утро');
	ELSEIF (hr >= 12 AND hr < 18) THEN RETURN ('Добрый день');
	ELSEIF (hr >= 18 AND hr < 24) THEN RETURN ('Добрый вечер');
	ELSEIF (hr >= 0 AND hr < 6) THEN RETURN ('Доброй ночи');
    END IF;
END
//

SELECT hello()//


