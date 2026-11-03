USE school_demo;

  -- Create the trigger to update student's balance
DELIMITER //
CREATE TRIGGER apply_student_payment
AFTER INSERT ON payments
FOR EACH ROW
BEGIN
    UPDATE student_accounts
    SET balance = balance - NEW.amount
    WHERE student_id = NEW.student_id;
END//
DELIMITER ;

-- INSERT INTO payments (student_id, amount)
-- VALUES
--     (1, 600.00),
--     (2, 500.00);

-- SELECT * FROM student_accounts;