USE school_demo;

DELIMITER //

CREATE TRIGGER cap_course_tuition
BEFORE UPDATE ON courses
FOR EACH ROW
BEGIN
    IF NEW.tuition > 2000.00 THEN
        SET NEW.tuition = 2000.00;
    END IF;
END//

DELIMITER ;

-- CALL change_tuition(101, 3000);
-- SELECT * FROM courses;