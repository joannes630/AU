DROP DATABASE IF EXISTS transfer_demo;
CREATE DATABASE transfer_demo;
USE transfer_demo;

CREATE TABLE accounts (
    account_id CHAR(1) PRIMARY KEY,
    balance DECIMAL(10, 2) NOT NULL
) ENGINE = InnoDB;

INSERT INTO accounts (account_id, balance)
VALUES ('A', 500.00),
       ('B', 200.00);

DELIMITER //
CREATE PROCEDURE transfer_100()
BEGIN   
    UPDATE accounts
    SET balance = balance - 100  
    WHERE account_id = 'A' AND balance >= 100; 

    UPDATE accounts
    SET balance = balance + 100
    WHERE account_id = 'B';
END//
DELIMITER ;

CALL transfer_100();
SELECT * FROM accounts