DROP DATABASE IF EXISTS University;
CREATE DATABASE IF NOT EXISTS University;
USE University;

CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    major VARCHAR(100)
);