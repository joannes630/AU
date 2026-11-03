USE school_demo;

DELIMITER //

-- Create the trigger to update student's balance
CREATE TRIGGER apply_student_payment
AFTER INSERT ON payments
FOR EACH ROW
BEGIN
    UPDATE student_accounts
    SET balance = balance - NEW.amount
    WHERE student_id = NEW.student_id;
END//

-- Create the trigger to record tuition amount change
CREATE TRIGGER record_tuition_change
AFTER UPDATE ON courses
FOR EACH ROW
BEGIN
    IF NOT (OLD.tuition <=> NEW.tuition) THEN
        INSERT INTO tuition_history (
            course_id,
            old_tuition,
            new_tuition
        )
        VALUES (
            NEW.course_id,
            OLD.tuition,
            NEW.tuition
        );
    END IF;
END //

CREATE PROCEDURE record_payment (
    IN p_student_id INT,
    IN p_amount DECIMAL(10, 2)
)
BEGIN
    INSERT INTO payments (student_id, amount)
    VALUES (p_student_id, p_amount);
END//

CREATE PROCEDURE change_tuition (
    IN p_course_id INT,
    IN p_new_tuition DECIMAL(10, 2)
)
BEGIN
    UPDATE courses
    SET tuition = p_new_tuition
    WHERE course_id = p_course_id;
END//

DELIMITER ;

-- Update payments.
CALL record_payment(1, 200.00);
CALL record_payment(2, 250.00);
SELECT * FROM student_accounts;

CALL change_tuition(101, 999);
SELECT * FROM courses;

UPDATE courses
SET tuition = 999.00
WHERE course_id = 101;
SELECT * FROM tuition_history;