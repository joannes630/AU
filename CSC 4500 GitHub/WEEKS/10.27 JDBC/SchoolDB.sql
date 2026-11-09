DROP DATABASE IF EXISTS SchoolDB;
CREATE DATABASE SchoolDB;
USE SchoolDB;

CREATE TABLE Department (
  ID INT PRIMARY KEY,
  Name VARCHAR(50),
  Chair VARCHAR(100)
);

CREATE TABLE Student (
  ID INT PRIMARY KEY,
  Name VARCHAR(100),
  GPA DECIMAL(2,1),
  DeptID INT,
  FOREIGN KEY (DeptID) REFERENCES Department(ID)
);

INSERT INTO Department (ID, Name, Chair)
VALUES
  (1, 'Computer Science', 'Dr. Maria Chen'),
  (2, 'Mathematics', 'Dr. James Wilson'),
  (3, 'Business', 'Dr. Angela Davis'),
  (4, 'Biology', 'Dr. Robert Garcia');

INSERT INTO Student (ID, Name, GPA, DeptID)
VALUES
  (1001, 'Emma Johnson', 3.8, 1),
  (1002, 'Liam Smith', 3.2, 2),
  (1003, 'Olivia Brown', 3.9, 1),
  (1004, 'Noah Davis', 2.7, 3),
  (1005, 'Ava Martinez', 3.5, 4),
  (1006, 'Elijah Wilson', 3.1, 2),
  (1007, 'Sophia Anderson', 3.7, 3),
  (1008, 'James Thomas', 2.9, 4),
  (1009, 'Isabella Lee', 4.0, 1),
  (1010, 'Lucas Harris', 3.4, NULL);
  
  