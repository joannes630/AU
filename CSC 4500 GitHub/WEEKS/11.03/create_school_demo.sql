DROP DATABASE IF EXISTS school_demo;
CREATE DATABASE school_demo;
USE school_demo;

/*
student_accounts(student_id [PK], student_name, balance)
courses(course_id [PK], course_name, tuition)
enrollments(enrollment_id [PK], student_id [FK], course_id [FK], semester, grade)
payments(payment_id [PK], student_id [FK], amount, paid_at)
tuition_history(history_id [PK], course_id, old_tuition, new_tuition, changed_at)
*/

CREATE TABLE student_accounts (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100),
    balance DECIMAL(10, 2)
);

CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100),
    tuition DECIMAL(10, 2)
);

CREATE TABLE enrollments (
    enrollment_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    course_id INT,
    semester VARCHAR(20),
    grade VARCHAR(5),
    FOREIGN KEY (student_id) REFERENCES student_accounts(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);

CREATE TABLE payments (
    payment_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    amount DECIMAL(10, 2) CHECK (amount > 0),
    paid_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (student_id) REFERENCES student_accounts (student_id)
);

CREATE TABLE tuition_history (
    history_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT,
    old_tuition DECIMAL(10, 2),
    new_tuition DECIMAL(10, 2),
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert values
-- Insert some values
INSERT INTO student_accounts (student_id, student_name, balance)
VALUES
    (1, 'Alice Johnson', 700.00),
    (2, 'Brian Smith', 500.00),
    (3, 'Carla Davis', 100.00),
    (4, 'David Wilson', 600.00);

INSERT INTO courses (course_id, course_name, tuition)
VALUES
    (101, 'Introduction to Databases', 800.00),
    (102, 'Computer Programming', 1000.00),
    (103, 'Business Mathematics', 600.00);

INSERT INTO enrollments (student_id, course_id, semester, grade)
VALUES
    (1, 101, 'Fall 2026', 'A'),
    (1, 102, 'Fall 2026', 'B+'),
    (2, 102, 'Fall 2026', 'B'),
    (3, 101, 'Spring 2026', 'A-'),
    (3, 103, 'Fall 2025', 'B+'),
    (4, 103, 'Summer 2026', NULL);

INSERT INTO payments (student_id, amount)
VALUES
    (1, 600.00),
    (1, 500.00),
    (2, 500.00),
    (3, 1300.00);