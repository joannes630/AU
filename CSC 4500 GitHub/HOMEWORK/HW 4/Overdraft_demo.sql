DROP DATABASE IF EXISTS overdraft_demo;
CREATE DATABASE overdraft_demo;
USE overdraft_demo;

CREATE TABLE Accounts (
    account_id INT PRIMARY KEY,
    balance DECIMAL(12, 2) NOT NULL
);

CREATE TABLE AccountBalanceAudit (
    audit_id INT AUTO_INCREMENT PRIMARY KEY,
    account_id INT NOT NULL,
    old_balance DECIMAL(12, 2) NOT NULL,
    new_balance DECIMAL(12, 2) NOT NULL,
    changed_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO Accounts (account_id, balance) VALUES
    (1, 100.00),
    (2, 250.00),
    (3,   0.00);

DELIMITER //

CREATE TRIGGER prevent_overdraft
BEFORE UPDATE ON Accounts
FOR EACH ROW
BEGIN
    IF NEW.balance < 0 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Insufficient funds';
    END IF;
END//

CREATE TRIGGER audit_balance_change
AFTER UPDATE ON Accounts
FOR EACH ROW
BEGIN
    IF OLD.balance <> NEW.balance THEN
        INSERT INTO AccountBalanceAudit (account_id, old_balance, new_balance)
        VALUES (NEW.account_id, OLD.balance, NEW.balance);
    END IF;
END//

CREATE PROCEDURE withdraw(
    IN  p_account_id INT,
    IN  p_amount DECIMAL(12, 2),
    OUT p_new_balance DECIMAL(12, 2)
)
BEGIN
    IF p_amount IS NULL OR p_amount <= 0 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Withdrawal amount must be positive';
    END IF;

    UPDATE Accounts
    SET balance = balance - p_amount
    WHERE account_id = p_account_id;

    IF ROW_COUNT() = 0 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Account not found';
    END IF;

    SELECT balance INTO p_new_balance
    FROM Accounts
    WHERE account_id = p_account_id;
END//

DELIMITER ;

SELECT account_id, balance FROM Accounts ORDER BY account_id;

START TRANSACTION;
CALL withdraw(1, 40.00, @new_balance);
COMMIT;

START TRANSACTION;
CALL withdraw(1, 45.00, @new_balance);
COMMIT;

SELECT account_id, balance FROM Accounts ORDER BY account_id;
SELECT @new_balance AS new_balance;
SELECT * FROM AccountBalanceAudit ORDER BY audit_id;
