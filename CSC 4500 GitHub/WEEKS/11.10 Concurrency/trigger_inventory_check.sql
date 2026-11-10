DROP DATABASE IF EXISTS Warehouse;
CREATE DATABASE Warehouse;
USE Warehouse;

CREATE TABLE Inventory (
    item_id INTEGER PRIMARY KEY,
    stock INTEGER
);

INSERT INTO Inventory (item_id, stock) VALUES (1, 5);

DELIMITER //
CREATE TRIGGER prevent_negative_stock
BEFORE UPDATE ON Inventory
FOR EACH ROW
BEGIN
    IF NEW.stock < 0 THEN
        SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Insufficient stock';
    END IF;
END//
DELIMITER ;

UPDATE Inventory 
SET stock = stock - 6 
WHERE item_id = 1;

SELECT * FROM Inventory;
