-- пример

DROP TABLE IF EXISTS catalogs;
CREATE TABLE catalogs (
id SERIAL PRIMARY KEY,
name VARCHAR(255) DEFAULT 'empty'
)
;

INSERT INTO catalogs VALUES
(NULL, DEFAULT),
(NULL, 'ABC'),
(NULL,'DEF'),
(NULL,'GHI'),
(NULL, 'JKL')
;

-- решение. Функция FIELD сформирует список для сортировки в необходимой последовательности.

SELECT * FROM catalogs WHERE id IN (5,1,2) ORDER BY FIELD(id, 5,1,2) ;