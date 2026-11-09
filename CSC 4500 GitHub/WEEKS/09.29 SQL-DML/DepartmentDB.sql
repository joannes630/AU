DROP DATABASE IF EXISTS DepartmentDB;
CREATE DATABASE DepartmentDB;
USE DepartmentDB;

CREATE TABLE Department (
	DeptID INT PRIMARY KEY,
    DeptName VARCHAR(50) NOT NULL
);

CREATE TABLE Employee (
	EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    DeptID INT NOT NULL,
    FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);

INSERT INTO Department VALUES
    (1, 'Information Technology'),
    (2, 'Human Resources'),
    (3, 'Engineering'),
    (4, 'Finance'),
    (5, 'Marketing');

INSERT INTO Employee VALUES
    (1, 'John Doe', 1),
    (2, 'Edgardo Guzman', 1),
    (3, 'Bill George', 3),
    (4, 'Maria Santos', 2),
    (5, 'Jennifer Lee', 4),
    (6, 'Michael Brown', 3),
    (7, 'David Smith', 5),
    (8, 'Angela Davis', 2),
    (9, 'Robert Wilson', 4),
    (10, 'Sarah Johnson', 1);

SELECT Employee.Name,
	Department.DeptName
FROM Employee
JOIN Department
	ON Employee.DeptID = Department.DeptID
WHERE Department.DeptName = 'Information Technology';

