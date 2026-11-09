DROP DATABASE IF EXISTS CourseEnrollmentDB;
-- Create the Database
CREATE DATABASE CourseEnrollmentDB;
USE CourseEnrollmentDB;

-- Create the Tables
CREATE TABLE Student (
    StudentID  INT PRIMARY KEY,
    FirstName  VARCHAR(50),
    LastName   VARCHAR(50),
    ClassLevel VARCHAR(30),
    Email      VARCHAR(255)
);

CREATE TABLE StudentPhone (
    StudentID INT,
    Phone     VARCHAR(25),
    PRIMARY KEY (StudentID, Phone),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID)
);

CREATE TABLE Course (
    CourseCode  VARCHAR(20) PRIMARY KEY,
    CourseTitle VARCHAR(150),
    Description VARCHAR(255),
    CreditHours INT,
    Department  VARCHAR(100)
);

CREATE TABLE Enrollment (
    StudentID      INT,
    CourseCode     VARCHAR(20),
    Semester       VARCHAR(30),
    EnrollmentDate DATE,
    Grade          VARCHAR(5),
    PRIMARY KEY (StudentID, CourseCode, Semester),
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseCode) REFERENCES Course(CourseCode)
);

-- Insert Values from .csv files
SET GLOBAL local_infile = 1;

DELETE FROM Enrollment;
DELETE FROM Course;
DELETE FROM StudentPhone;
DELETE FROM Student;

LOAD DATA LOCAL INFILE 'C:/GitHub/Private/CSC 4500 Private/ASSIGNMENT/HW 3/CSV/Student.csv'
INTO TABLE Student
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/GitHub/Private/CSC 4500 Private/ASSIGNMENT/HW 3/CSV/StudentPhone.csv'
INTO TABLE StudentPhone
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/GitHub/Private/CSC 4500 Private/ASSIGNMENT/HW 3/CSV/Course.csv'
INTO TABLE Course
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;

LOAD DATA LOCAL INFILE 'C:/GitHub/Private/CSC 4500 Private/ASSIGNMENT/HW 3/CSV/Enrollment.csv'
INTO TABLE Enrollment
FIELDS TERMINATED BY ','
OPTIONALLY ENCLOSED BY '"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS;