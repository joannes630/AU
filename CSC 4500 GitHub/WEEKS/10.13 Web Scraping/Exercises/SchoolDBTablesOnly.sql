DROP DATABASE IF EXISTS SchoolDB;
CREATE DATABASE SchoolDB;
USE SchoolDB;

CREATE TABLE Student (
  ID INT PRIMARY KEY,
  Name VARCHAR(100),
  Major VARCHAR(50),
  GPA DECIMAL(2,1)
);

CREATE TABLE Faculty (
  ID INT PRIMARY KEY,
  Name VARCHAR(100),
  Room CHAR(10)
  );

CREATE TABLE Course (
  ID CHAR(7) PRIMARY KEY,
  Name VARCHAR(100),
  Credits INT,
  Department VARCHAR(20),
  FacultyID INT,
  FOREIGN KEY(FacultyID) REFERENCES Faculty(ID)
);

CREATE TABLE Enrollment (
  StudentID INT,
  CourseID CHAR(7),
  Semester VARCHAR(50),
  PRIMARY KEY (StudentID, CourseID, Semester),
  Grade CHAR(1),
  FOREIGN KEY(StudentID) REFERENCES Student(ID),
  FOREIGN KEY(CourseID) REFERENCES Course(ID)
);

