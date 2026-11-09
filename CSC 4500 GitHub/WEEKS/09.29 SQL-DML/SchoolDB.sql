-- FROM SLIDE EXAMPLE
DROP DATABASE IF EXISTS SchoolDB;
CREATE DATABASE SchoolDB;
USE SchoolDB;
-- Create the Department table
CREATE TABLE Department (
    DepartmentID INT PRIMARY KEY,
    Name VARCHAR(50)
);

-- Create the Student table
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID)
        REFERENCES Department(DepartmentID)
);

INSERT INTO Department VALUES
	(1, 'Computer Science'),
    (2, "Cybersecurity"),
    (3, "Math");

INSERT INTO Student VALUES
	(1, "John Doe", 1),
    (2, "Edgardo Guzman", 1),
    (3, "Bill George", NULL);

SHOW databases;
SHOW tables;
DESCRIBE Student;

SELECT Student.StudentID,
       Student.Name,
       Department.Name
FROM Student
JOIN Department
    ON Student.DepartmentID = Department.DepartmentID
WHERE Department.Name = "Computer Science";

-- SHOW VARIABLES LIKE 'datadir';