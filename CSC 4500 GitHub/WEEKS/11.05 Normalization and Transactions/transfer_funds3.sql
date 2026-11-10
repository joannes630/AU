DROP DATABASE IF EXISTS transfer_demo;
CREATE DATABASE transfer_demo;
USE transfer_demo;

CREATE TABLE accounts (
    account_id CHAR(1) PRIMARY KEY,
    balance DECIMAL(10, 2) NOT NULL
);

INSERT INTO accounts (account_id, balance)
VALUES ('A', 500.00),
       ('B', 200.00);

DELIMITER //
CREATE PROCEDURE transfer_100()
BEGIN   
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
        ROLLBACK;
        RESIGNAL;
    END;

    START TRANSACTION;
    UPDATE accounts
    SET balance = balance - 100  
    WHERE account_id = 'A' AND balance >= 100;  
    IF ROW_COUNT() <> 1 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Account A is missing or has insufficient funds';
    END IF;

    UPDATE accounts
    SET balance = balance + 100
    WHERE account_id = 'B';
        IF ROW_COUNT() <> 1 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Account B is missing';
    END IF;
    COMMIT;

END//
DELIMITER ;

CALL transfer_100();
SELECT * FROM accounts