CREATE DATABASE IF NOT EXISTS media_files;

USE media_files;

DROP TABLE IF EXISTS types;
CREATE TABLE IF NOT EXISTS types(
	id SERIAL PRIMARY KEY,
	file_type VARCHAR(255) NOT NULL DEFAULT 'Unknown' COMMENT 'Тип файла: Аудио, Видео, Фото, Др.',
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	UNIQUE unique_file_type(file_type(10)) 
	) COMMENT = 'Таблица, созданная для того, чтобы хранить возможные типы файлов в БД';

DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255) COMMENT 'Имя пользователя',
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) COMMENT = 'Табица пользователей'; 

DROP TABLE IF EXISTS files;
CREATE TABLE IF NOT EXISTS files(
	id SERIAL PRIMARY KEY,
	file_name VARCHAR(255) NOT NULL COMMENT 'Имя файла',
	file_path VARCHAR(255) NOT NULL COMMENT 'Расположение файла',
	description TEXT COMMENT 'Описание файла',
	key_words VARCHAR(255) COMMENT -- Ключевые слова. Возможно, стоило бы использовать JSON, но не до конца понятно,
	-- как будет устроена структура.Так можно искать с помощью LIKE'
	,
	file_size DECIMAL(7,1) COMMENT 'Размер файла в МБ (ограничен 1000Гб с точностью до первого знака)',
	file_extension CHAR(20) COMMENT 'Расшиерние файла',
	user_id BIGINT NOT NULL,
	type_id BIGINT NOT NULL,
	created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	KEY index_of_user_id (user_id),
	KEY index_of_type_id (type_id)
	);
	