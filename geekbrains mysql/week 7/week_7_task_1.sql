DROP USER shop_read;
DROP USER shop;

CREATE USER shop_read IDENTIFIED WITH sha256_password BY 'read';
CREATE USER shop IDENTIFIED WITH sha256_password BY 'write';

GRANT SELECT ON shop.* TO shop_read;

GRANT ALL ON shop.* TO shop;

