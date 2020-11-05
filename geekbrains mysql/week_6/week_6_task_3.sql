-- пример

DROP TABLE IF EXISTS users; 

CREATE TABLE users(
	id SERIAL PRIMARY KEY,
	created_at DATE
);

INSERT INTO users VALUES
(NULL, '2018-08-01'), 
(NULL, '2018-08-04'), 
(NULL, '2018-08-16'),
(NULL, '2018-08-17')
;

-- решение. Возможно можно решить лаконичнее, но я не придумал ))

DROP TABLE IF EXISTS users_copy;
CREATE TEMPORARY TABLE users_copy(
	id SERIAL PRIMARY KEY,
	created_at DATE
);

INSERT INTO users_copy SELECT * FROM users;

DROP PROCEDURE IF EXISTS proc_1;

DELIMITER $$

CREATE PROCEDURE proc_1(first_day DATE, second_date DATE)

BEGIN

	DECLARE cur_date DATE;
	
    WHILE dateStart <= dateEnd DO
    
        SET cur_date = (SELECT created_at FROM users WHERE created_at = first_day);

        IF cur_date IS NULL THEN BEGIN

            INSERT INTO users VALUES (NULL, first_day);

        	END; 
        END IF;

        SET first_day = first_day + INTERVAL 1 DAY;

    END WHILE;

END;

DELIMITER ;

CALL filldates('2018-08-01','2018-08-31');

SELECT 
	us.created_at, 
	CASE WHEN usc.created_at IS NOT NULL THEN 1 ELSE 0 END AS flg
FROM 
	users  us
LEFT JOIN 
	users_copy usc 
		ON us.created_at = usc.created_at
ORDER BY us.created_at;
