DROP DATABASE IF EXISTS CompanyDB;
CREATE DATABASE CompanyDB;
USE CompanyDB;

-- 1. Using this ERD, create the appropriate SQL DDL implementation, 
--    including all tables, relationships, cardinalities, and ordinalities.
CREATE TABLE Employee (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department VARCHAR(50),
    Salary DECIMAL(10,2)
);

CREATE TABLE Manager (
    ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Office CHAR(10)
);

CREATE TABLE Project (
    ID CHAR(7) PRIMARY KEY,
    Name VARCHAR(100),
    Budget DECIMAL(10,2),
    Department VARCHAR(50),
    ManagerID INT,
    FOREIGN KEY (ManagerID) REFERENCES Manager(ID)
);

CREATE TABLE Assignment (
    EmployeeID INT,
    ProjectID CHAR(7),
    WorkYear INT,
    Role VARCHAR(50),
    PRIMARY KEY (EmployeeID, ProjectID, WorkYear),
    FOREIGN KEY (EmployeeID) REFERENCES Employee(ID),
    FOREIGN KEY (ProjectID) REFERENCES Project(ID)
);

-- 2. Insert the values (SQL DML) into the tables as shown below. 
--    Remember that some columns may need to be modified so they can 
--    be used as the appropriate foreign keys.
INSERT INTO Employee (ID, Name, Department, Salary) VALUES
    (1001, 'Daniel Smith', 'Accounting', 62000.00),
    (1002, 'Maria Johnson', 'Information Technology', 78000.00),
    (1003, 'Kevin Taylor', 'Human Resources', 58000.00),
    (1004, 'Sophia Lee', 'Information Technology', 85000.00),
    (1005, 'Emma Garcia', 'Marketing', 67000.00),
    (1006, 'Michael Wilson', 'Accounting', 72000.00),
    (1007, 'Henry Brown', 'Human Resources', 61000.00),
    (1008, 'James Anderson', 'Information Technology', 74000.00),
    (1009, 'Grace Martinez', 'Marketing', 69000.00),
    (1010, 'John Thomas', 'Information Technology', 92000.00),
    (1011, 'Anna Davis', 'Accounting', 55000.00),
    (1012, 'Leo Hernandez', NULL, 60000.00);

INSERT INTO Manager (ID, Name, Office) VALUES
    (201, 'Robert Miller', 'ROOM 201'),
    (202, 'Susan Clark', 'ROOM 305'),
    (203, 'Michael Chen', 'ROOM 410');

INSERT INTO Project (ID, Name, Budget, Department, ManagerID) VALUES
    ('PRJ1001', 'Payroll System Upgrade', 85000.00, 'Information Technology', 201),
    ('PRJ1002', 'Network Security Upgrade', 120000.00, 'Information Technology', 201),
    ('PRJ2001', 'Employee Wellness Program', 45000.00, 'Human Resources', 202),
    ('PRJ3001', 'Marketing Campaign', 70000.00, 'Marketing', 203),
    ('PRJ4001', 'Financial Audit', 50000.00, 'Accounting', 203);

INSERT INTO Assignment (EmployeeID, ProjectID, WorkYear, Role) VALUES
    (1001, 'PRJ4001', 2026, 'Analyst'),
    (1002, 'PRJ1001', 2026, 'Developer'),
    (1003, 'PRJ2001', 2026, 'Coordinator'),
    (1004, 'PRJ1002', 2026, 'Developer'),
    (1005, 'PRJ4001', 2026, 'Designer'),
    (1006, 'PRJ4001', 2026, 'Analyst'),
    (1007, 'PRJ2001', 2026, 'Coordinator'),
    (1008, 'PRJ1001', 2026, 'Developer'),
    (1009, 'PRJ4001', 2026, 'Designer'),
    (1010, 'PRJ1002', 2026, 'Developer'),
    (1011, 'PRJ4001', 2026, 'Analyst'),
    (1012, 'PRJ1001', 2026, 'Support');
    
-- 3. Show all projects that have no employees assigned to them. 
--    Use 'NoEmployeeProject' as the column alias for the project name.
SELECT Project.Name AS NoEmployeeProject
FROM Project
LEFT JOIN Assignment
ON Project.ID = Assignment.ProjectID
WHERE Assignment.EmployeeID IS NULL;

-- 4. Using JOIN, show the employee ID, name, and department for all employees 
--    assigned to a project in the Information Technology department.
SELECT ID, Name, Department
FROM Employee
WHERE ID IN (
SELECT EmployeeID
FROM Assignment
WHERE ProjectID IN (
SELECT ID
FROM Project
WHERE Department = 'Information Technology'
)
);

-- 5. Show the project ID and project name for the project(s) with the most 
--    employees assigned — using a subquery.
SELECT Project.ID, Project.Name
FROM Project
JOIN Assignment
ON Project.ID = Assignment.ProjectID
GROUP BY Project.ID, Project.Name
HAVING COUNT(*) = (
SELECT MAX(EmployeeCount)
FROM (
SELECT COUNT(*) AS EmployeeCount
FROM Assignment
GROUP BY ProjectID
) AS ProjectCounts
);

-- 6. Show the project ID and project name for the project(s) with the most 
--    employees assigned — using a CTE.
WITH ProjectCounts AS (
    SELECT ProjectID,
           COUNT(*) AS EmployeeCount
    FROM Assignment
    GROUP BY ProjectID
)

SELECT Project.ID, Project.Name
FROM Project
JOIN ProjectCounts
ON Project.ID = ProjectCounts.ProjectID
WHERE EmployeeCount = (
SELECT MAX(EmployeeCount)
FROM ProjectCounts
);

-- 7. Show the manager's ID, Manager's Name, total project budget managed by that manager, 
--    and the average total project budget managed by all managers.
WITH ManagerBudgets AS (
SELECT ManagerID,
SUM(Budget) AS TotalBudget
FROM Project
GROUP BY ManagerID
)

SELECT ManagerID, Manager.Name, TotalBudget,
(SELECT ROUND(AVG(TotalBudget), 2)
FROM ManagerBudgets) AS AverageManagerBudget
FROM ManagerBudgets
JOIN Manager
ON Manager.ID = ManagerBudgets.ManagerID;

