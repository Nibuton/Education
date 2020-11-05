-- Пример

DROP TABLE IF EXISTS numbers; 

CREATE TABLE numbers(
	num INT
);

INSERT INTO numbers VALUES 
(1),
(2),
(3),
(4),
(5),
(7),
(24),
(-2)
;
 
-- Решение. Для случая, если все числа положительны и не равны нулю
-- используем тот факт, что логарифм произведения равен сумме логарифмов множителей, но учтем,
-- что нельзя взять логарифм от отрицательного значения, а в случае присутствия нуля в списке значений
-- логарифм от нуля выдаст NULL и результат не изменится, хотя должен получится ноль.

-- Создадим и заполним столбцы, чтобы хранить флаг на то, является ли это число положительным
-- или отрицательным

ALTER TABLE numbers ADD pos_sign INT, ADD neg_sign INT;

UPDATE numbers SET pos_sign = IF(num > 0, 1, 0), neg_sign = IF(num < 0, 1, 0) ;

-- Решение

SELECT 
CASE WHEN SUM(pos_sign + neg_sign) != COUNT(*) THEN 0
ELSE IF(SUM(neg_sign) % 2 = 1, -1, 1) * EXP(SUM(LOG(ABS(num))))
END AS multiplication
FROM numbers
;




