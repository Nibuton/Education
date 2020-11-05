DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS catalogs;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS logs;
DROP TRIGGER IF EXISTS insert_catalogs_logs;
DROP TRIGGER IF EXISTS update_catalogs_logs;
DROP TRIGGER IF EXISTS insert_users_logs;
DROP TRIGGER IF EXISTS update_users_logs;
DROP TRIGGER IF EXISTS insert_products_logs;
DROP TRIGGER IF EXISTS update_products_logs;

-- В документации написано, что в типе таблиц Archive, может быть лишь один ключ, остальное индексирвоание запрещено
-- т.е. и внешние ключи тоже. Ключевое слово SERIAL также нам не подойдет, поскольку содержит UNIQUE.

CREATE TABLE logs(
id BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
foreign_id BIGINT UNSIGNED NOT NULL,
table_name VARCHAR(255) NOT NULL,
name VARCHAR(255),
created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL
) ENGINE = Archive;

CREATE TABLE catalogs (
  id SERIAL PRIMARY KEY,
  name varchar(255) DEFAULT 'empty'
);

CREATE TABLE products (
  id SERIAL PRIMARY KEY,
  name varchar(255) DEFAULT 'empty',
  catalog_id BIGINT UNSIGNED DEFAULT NULL,
  CONSTRAINT catalog_id_key FOREIGN KEY(catalog_id) REFERENCES catalogs(id)
  	ON UPDATE CASCADE ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255)
);

-- Не стал создавать таблицу orders, т.к. на выполнение задания не влияет.
-- По логике построения хранилища, она, кончено, нужна.

DELIMITER //

-- Триггеры для таблицы catalogs' 

CREATE TRIGGER insert_catalogs_logs AFTER INSERT ON catalogs
FOR EACH ROW 
BEGIN
	INSERT INTO logs VALUE (NULL, new.id, 'catalogs', new.name, DEFAULT);
END // 

CREATE TRIGGER update_catalogs_logs AFTER UPDATE ON catalogs
FOR EACH ROW 
BEGIN
	INSERT INTO logs VALUE (NULL, new.id, 'catalogs', new.name, DEFAULT);
END //

-- Триггеры для таблицы users

CREATE TRIGGER insert_users_logs AFTER INSERT ON users
FOR EACH ROW 
BEGIN
	INSERT INTO logs VALUE (NULL, new.id, 'users', new.name, DEFAULT);
END // 

CREATE TRIGGER update_users_logs AFTER UPDATE ON users
FOR EACH ROW 
BEGIN
	INSERT INTO logs VALUE (NULL, new.id, 'users', new.name, DEFAULT);
END //

-- Триггеры для таблицы products


CREATE TRIGGER insert_products_logs AFTER INSERT ON products
FOR EACH ROW 
BEGIN
	INSERT INTO logs VALUE (NULL, new.id, 'products', new.name, DEFAULT);
END // 

CREATE TRIGGER update_products_logs AFTER UPDATE ON products
FOR EACH ROW 
BEGIN
	INSERT INTO logs VALUE (NULL, new.id, 'products', new.name, DEFAULT);
END //

DELIMITER ;

-- проверка для catalogs

INSERT INTO catalogs VALUES
(NULL,'cat1'),
(NULL, 'cat2'),
(NULL, 'cat3');

DO SLEEP(2); -- Отложим выполнение программы, чтобы посмотреть, что время-дата создания ставится корректно

UPDATE catalogs SET name = 'cat500' WHERE id = 3;
UPDATE catalogs SET name = 'cat700' WHERE id = 1;

SELECT * FROM catalogs;

-- проверка для users

INSERT INTO users VALUES
(NULL,'us1'),
(NULL, 'us2'),
(NULL, 'us3');

DO SLEEP(2);

UPDATE users SET name = 'us789' WHERE id = 3;
UPDATE users SET name = 'us489' WHERE id = 1;

SELECT * FROM users;

-- проверка для products

INSERT INTO products VALUES 
(NULL,'pro1',1),
(NULL,'pro2',2),
(NULL,'pro3',1);

DO SLEEP(2);

UPDATE products SET name = 'pro234' WHERE id = 2;
UPDATE products SET name = 'pro567' WHERE id = 1;

-- посмотрим финальную таблицу

SELECT * FROM logs ORDER BY table_name, created_at;
