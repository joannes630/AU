-- Create and select the database.
DROP DATABASE IF EXISTS CustomerProductDB;
CREATE DATABASE IF NOT EXISTS CustomerProductDB;
USE CustomerProductDB;

-- Create the tables.
CREATE TABLE Customer (
    customer_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

CREATE TABLE Product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100) NOT NULL
);

-- Records which products each customer has purchased.
CREATE TABLE Purchase (
    customer_id INT NOT NULL,
    product_id INT NOT NULL,
    PRIMARY KEY (customer_id, product_id),
    FOREIGN KEY (customer_id)
        REFERENCES Customer(customer_id),
    FOREIGN KEY (product_id)
        REFERENCES Product(product_id)
);

-- Defines the required products for division queries.
CREATE TABLE RequiredProduct (
    product_id INT PRIMARY KEY,
    FOREIGN KEY (product_id)
        REFERENCES Product(product_id)
);

-- Insert customers.
INSERT INTO Customer
    (customer_id, first_name, last_name, email)
VALUES
    (1, 'Alex', 'Morgan', 'alex.morgan@example.com'),
    (2, 'Jamie', 'Rivera', 'jamie.rivera@example.com'),
    (3, 'Taylor', 'Chen', 'taylor.chen@example.com');

-- Insert products.
INSERT INTO Product (product_id, product_name)
VALUES
    (101, 'Product A'),
    (102, 'Product B'),
    (103, 'Product C'),
    (104, 'Product D');

-- Customers must purchase A, B, and C to qualify.
INSERT INTO RequiredProduct (product_id)
VALUES
    (101),
    (102),
    (103);

-- Insert purchases.
INSERT INTO Purchase (customer_id, product_id)
VALUES
    -- Alex purchased A, B, and C.
    (1, 101),
    (1, 102),
    (1, 103),

    -- Jamie purchased only A and B.
    (2, 101),
    (2, 102),

    -- Taylor purchased A, B, C, and D.
    (3, 101),
    (3, 102),
    (3, 103),
    (3, 104);

-- this query finds customers who have made at least one purchase
SELECT c.customer_id, c.first_name, c.last_name
FROM Customer c
WHERE EXISTS (
    SELECT 1
    FROM Purchase p
    WHERE p.customer_id = c.customer_id
);
