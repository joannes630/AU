USE school_demo;

DELIMITER //
CREATE PROCEDURE record_payment (
    IN p_student_id INT,
    IN p_amount DECIMAL(10, 2)
)
BEGIN
    INSERT INTO payments (student_id, amount)
    VALUES (p_student_id, p_amount);
END//
DELIMITER ;

-- CALL record_payment(1, 100.00);
-- SELECT * FROM payments;



