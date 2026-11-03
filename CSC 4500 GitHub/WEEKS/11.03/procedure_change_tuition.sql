USE school_demo;

DELIMITER //
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

-- CALL change_tuition(101, 999);
-- SELECT * FROM courses;
