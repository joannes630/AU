USE school_demo;

-- Create the trigger to record tuition amount change
DELIMITER //

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

DELIMITER ;

-- UPDATE courses
-- SET tuition = 999.00
-- WHERE course_id = 101;

-- UPDATE courses
-- SET tuition = 1100.00
-- WHERE course_id = 102;

-- UPDATE courses
-- SET course_name = 'Finance Mathematics'
-- WHERE course_id = 103;

-- SELECT * FROM tuition_history;
