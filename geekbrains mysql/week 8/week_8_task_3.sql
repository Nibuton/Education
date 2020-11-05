-- решение

DROP FUNCTION IF EXISTS fib_func;

DELIMITER //

CREATE FUNCTION fib_func(n INT)
RETURNS BIGINT DETERMINISTIC

BEGIN
	DECLARE i,j, num INT DEFAULT 1;
	DECLARE k INT DEFAULT 2;
	IF (n <= 2) THEN RETURN (1);
	ELSE 
		WHILE (k < n) DO
			SET num = i + j;
			SET i = j;	
		    SET j = num;
			SET k = k+1;
		END WHILE;
		RETURN (num);
	END IF;
END // 

-- проверим первые 11 чисел

SELECT fib_func (1), fib_func (2), fib_func (3), fib_func (4), fib_func (5), fib_func (6), fib_func(7),
fib_func (8), fib_func (9), fib_func (10), fib_func (11)//

