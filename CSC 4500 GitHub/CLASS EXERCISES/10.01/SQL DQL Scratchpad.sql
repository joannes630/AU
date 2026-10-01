DROP DATABASE IF EXISTS SchoolDB;
CREATE DATABASE SchoolDB;
USE SchoolDB;

CREATE TABLE Student (
  ID INT PRIMARY KEY,
  Name VARCHAR(100),
  Major VARCHAR(50),
  GPA DECIMAL(2,1)
);

CREATE TABLE Course (
  ID CHAR(7) PRIMARY KEY,
  Name VARCHAR(100),
  Credits INT,
  Department VARCHAR(20),
  FacultyID INT
);

CREATE TABLE Faculty (
  ID INT PRIMARY KEY,
  Name VARCHAR(100),
  Room CHAR(10),
  CourseID CHAR(7),
  FOREIGN KEY(CourseID) REFERENCES Course(ID)
);

CREATE TABLE Enrollment (
  StudentID INT,
  CourseID CHAR(7),
  PRIMARY KEY (StudentID, CourseID),
  Semester VARCHAR(50),
  Grade CHAR(1),
  FOREIGN KEY(StudentID) REFERENCES Student(ID),
  FOREIGN KEY(CourseID) REFERENCES Course(ID)
);

INSERT INTO Student (ID, Name, Major, GPA) VALUES
    (1001, 'Jun Smith', 'Biology', 3.8),
    (1002, 'Alice Johnson', 'Computer Science', 3.5),
    (1003, 'Isabella Taylor', 'Mathematics', 2.0),
    (1004, 'Daniel Lee', 'Computer Science', 3.3),
    (1005, 'Emily Garcia', 'Mathematics', 3.9),
    (1006, 'Frank Wilson', 'Business', 4.0),
    (1007, 'Henry Brown', 'Biology', 2.9),
    (1008, 'James Anderson', 'Computer Science', 2.1),
    (1009, 'Grace Martinez', 'Computer Science', 2.8),
    (1010, 'Jan Thomas', 'Business', 4.0),
    (1011, 'Carla Davis', 'Business', 2.5),
    (1012, 'Leo Hernandez', 'Biology', 3.6);

INSERT INTO Course (ID, Name, Credits, Department, FacultyID) VALUES
    ('CSC1700', 'Introduction to Programming', 3, 'Computer Science', 201),
    ('CSC4500', 'Database Systems', 3, 'Computer Science', 201),
    ('BIO1100', 'General Biology', 4, 'Biology', 202),
    ('MAT1500', 'College Algebra', 3, 'Mathematics', 203),
    ('BUS2000', 'Principles of Management', 3, 'Business', 203);

INSERT INTO Faculty (ID, Name, Room, CourseID) VALUES
    (201, 'Dr. Robert Miller', 'ROOM 201', 'CSC1700'),
    (202, 'Dr. Susan Clark', 'ROOM 305', 'BIO1100'),
    (203, 'Mr. Michael Chen', 'ROOM 410', 'MAT1500');
    
INSERT INTO Enrollment (StudentID, CourseID, Semester, Grade) VALUES
    (1001, 'CSC1700', 'Fall 2026', 'A'),
    (1002, 'BIO1100', 'Fall 2026', 'B'),
    (1003, 'MAT1500', 'Fall 2026', 'B'),
    (1004, 'CSC4500', 'Fall 2026', 'A'),
    (1005, 'MAT1500', 'Fall 2026', 'A'),
    (1006, 'CSC1700', 'Fall 2026', 'C'),
    (1007, 'CSC4500', 'Fall 2026', 'B'),
    (1008, 'BIO1100', 'Fall 2026', 'A'),
    (1009, 'MAT1500', 'Fall 2026', 'B'),
    (1010, 'CSC1700', 'Fall 2026', 'A'),
    (1011, 'CSC4500', 'Fall 2026', 'C'),
    (1012, 'BIO1100', 'Fall 2026', 'B');

-- -------------------------------------------