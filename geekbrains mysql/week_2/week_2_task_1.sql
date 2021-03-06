-- Я не до конца понял, есть ли изначально по условиям задачи в таблице catalogs уникальный индекс на поле name
-- Решим два варината. Представим, что нет. В таком случае сделаем таблицу и выполним запрос

USE shop;

DROP TABLE IF EXISTS catalogs;
CREATE TABLE IF NOT EXISTS catalogs(
id SERIAL PRIMARY KEY,
name VARCHAR(255)
);

INSERT INTO catalogs VALUES
(1, ''),
(2, NULL),
(3,'ABC')
;

UPDATE catalogs SET name = 'empty' WHERE name IS NULL OR name = '' ;

SELECT * FROM catalogs;

-- В таком виде не выйдет добавить условие на уникальность поля name, поскольку пустых строк\строк cо 
-- значением NULL может быть больше одной, а по условию задачи мы меняем все эти строки на одинаковое значение.

-- В случае, если условие на уникальность стоит в таблице изначально, его также не выйдет сохранить, поскольку,
-- могут быть две строки, одна из которых пустая, а вторая NULL и изначальное условие на уникальность для 
-- этой таблицы будет выполнено, в то время, как нам требуется заменить значение двух этих полей на 
-- одинаковые.

