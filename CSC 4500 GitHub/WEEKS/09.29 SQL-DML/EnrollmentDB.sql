DROP DATABASE IF EXISTS EnrollmentDB;
CREATE DATABASE EnrollmentDB;
USE EnrollmentDB;

-- Create Student table
CREATE TABLE Student (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50) NOT NULL
);

-- Create Course table
CREATE TABLE Course (
    CourseID VARCHAR(50) PRIMARY KEY,
    CourseName VARCHAR(100) NOT NULL
);

-- Create Enrollment table
CREATE TABLE Enrollment (
    EnrollmentID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT NOT NULL,
    CourseID VARCHAR(50) NOT NULL,
    Semester VARCHAR(50),
    Grade INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)
);

-- Insert Students
INSERT INTO Student VALUES
    (1, 'Alice Johnson'),
    (2, 'Brian Smith'),
    (3, 'Carla Davis'),
    (4, 'David Lee'),
    (5, 'Emily Brown');

-- Insert Courses
INSERT INTO Course VALUES
    ('CSC101', 'Introduction to Programming'),
    ('CSC220', 'Database Systems'),
    ('CSC330', 'Computer Networks'),
    ('ART101', 'Introduction to Art'),
    ('ART205', 'Painting'),
    ('MAT110', 'College Algebra'),
    ('BIO120', 'General Biology');

-- Insert Enrollments
INSERT INTO Enrollment
    (StudentID, CourseID, Semester, Grade)
VALUES
    (1, 'CSC101', 'Fall 2026', 88),
    (1, 'CSC220', 'Spring 2026', 92),
    (2, 'CSC101', 'Spring 2026', 85),
    (2, 'MAT110', 'Fall 2026', 90),
    (3, 'BIO120', 'Fall 2026', 94),
    (3, 'CSC220', 'Spring 2026', 87),
    (4, 'ART101', 'Fall 2026', 91),
    (4, 'ART205', 'Fall 2025', 89),
    (5, 'CSC330', 'Fall 2026', 93),
    (5, 'MAT110', 'Summer 2026', 86);
    
-- Query a student's enrollment
SELECT Student.Name,
       Course.CourseID,
       Course.CourseName,
       Enrollment.Semester,
       Enrollment.Grade
FROM Student
JOIN Enrollment
    ON Student.StudentID = Enrollment.StudentID
JOIN Course
    ON Enrollment.CourseID = Course.CourseID
-- WHERE Student.StudentID = 1;
WHERE Course.CourseID = 'CSC101';


