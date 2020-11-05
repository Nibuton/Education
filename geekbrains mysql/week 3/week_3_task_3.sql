-- пример 

DROP TABLE IF EXISTS storehouses_products;

CREATE TABLE storehouses_products(
id SERIAL PRIMARY KEY,
name VARCHAR(255),
value INT UNSIGNED
)
;

INSERT INTO storehouses_products VALUES
(NULL, 'paper', 8),
(NULL, 'towels', 0),
(NULL, 'water', 2),
(NULL, 'tomatoes', 3),
(NULL, 'tea',0),
(NULL, 'oranges',5),
(NULL, 'rice',0)
;

-- РЕШЕНИЕ
-- Можно прибегнуть к такой хитрости, чтобы отсортировать все одним запросом. 
-- В момент сортировки, в том случае, если попадается значение 0 для оператора сортировки присовить
-- ему заведомо очень больше значение, чтобы оно точно превышало все другие значения в данном поле, соответсвенно,
-- нули будут выведены в последнюю очередь :) 

SELECT * FROM storehouses_products ORDER BY CASE WHEN value = 0 THEN 1000000000000000 ELSE value END;
