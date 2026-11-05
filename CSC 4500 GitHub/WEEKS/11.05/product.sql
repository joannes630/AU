DROP DATABASE IF EXISTS product_demo;
CREATE DATABASE product_demo;
USE product_demo;

CREATE TABLE Product (
    product_id INT AUTO_INCREMENT PRIMARY KEY,
    pname VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
) ENGINE = InnoDB;

CREATE TABLE DollarProducts (
    dollar_product_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
) ENGINE = InnoDB;

INSERT INTO Product (pname, price) VALUES
    ('Pencil',   0.49),
    ('Eraser',   0.99),
    ('Ruler',    1.00),
    ('Notebook', 2.49);

SELECT * FROM DollarProducts;
SELECT * FROM Product;

START TRANSACTION;
INSERT INTO DollarProducts (name, price)
SELECT pname, price
FROM Product
WHERE price <= 0.99;

DELETE FROM Product
WHERE price <= 0.99;    
COMMIT;

SELECT * FROM DollarProducts;
SELECT * FROM Product;