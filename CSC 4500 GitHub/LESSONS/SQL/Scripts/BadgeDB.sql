DROP DATABASE IF EXISTS BadgeDB;
CREATE DATABASE BadgeDB;
USE BadgeDB;

CREATE TABLE Badge (
    BadgeID INT PRIMARY KEY
);

CREATE TABLE Employee (
	EmployeeID INT PRIMARY KEY,
    Name VARCHAR(50),
    BadgeID INT UNIQUE NOT NULL,
    FOREIGN KEY (BadgeID) REFERENCES Badge(BadgeID)
);

INSERT INTO Badge VALUES
	(001),
    (002),
    (003);

INSERT INTO Employee VALUES
	(001, "John Doe", 001),
    (002, "Edgardo Guzman", 003),
    (003, "Bill George", 002);

SELECT *
FROM Badge;

SELECT Employee.EmployeeID,
       Employee.Name,
       Employee.BadgeID
FROM Employee
JOIN Badge
    ON Employee.BadgeID = Badge.BadgeID
WHERE Badge.BadgeID = 2;
