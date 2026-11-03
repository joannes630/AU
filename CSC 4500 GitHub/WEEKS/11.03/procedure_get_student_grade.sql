USE school_demo;

DROP PROCEDURE IF EXISTS get_student_grade;
DELIMITER //
CREATE PROCEDURE get_student_grade (
    IN p_student_id INT,
    IN p_course_id INT,
    IN p_semester VARCHAR(20),
    OUT p_grade VARCHAR(5)
)
BEGIN
    SET p_grade = (
        SELECT e.grade
        FROM enrollments e
        WHERE e.student_id = p_student_id
          AND e.course_id = p_course_id
          AND e.semester = p_semester
    );
END//

DELIMITER ;

-- CALL get_student_grade(1, 101, 'Fall 2026', @student_grade);
-- SELECT @student_grade AS grade;

/*
student_accounts(student_id [PK], student_name, balance)
courses(course_id [PK], course_name, tuition)
enrollments(enrollment_id [PK], student_id [FK], course_id [FK], semester, grade)
payments(payment_id [PK], student_id [FK], amount, paid_at)
tuition_history(history_id [PK], course_id, old_tuition, new_tuition, changed_at)
*/

-- SET @student_id = 1;
-- SET @course_id = 101;
-- SET @semester = 'Fall 2026';
-- CALL get_student_grade(@student_id, @course_id, @semester, @student_grade);
-- SELECT
--     s.student_id,
--     s.student_name,
--     c.course_name,
--     e.semester,
--     @student_grade AS grade
-- FROM enrollments AS e, student_accounts AS s, courses AS c
-- WHERE e.student_id = s.student_id
--   AND e.course_id = c.course_id
--   AND e.student_id = @student_id
--   AND e.course_id = @course_id
--   AND e.semester = @semester;