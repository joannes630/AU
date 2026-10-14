-- 1. Display the names of all students whose major is Computer Science
SELECT Name
FROM Student
WHERE Major = 'Computer Science';

-- 2. Display the names of all students with GPA of 3.5 and above
SELECT Name
FROM Student
WHERE GPA >= 3.5;

-- 3. Display the names of all courses, along with the instructors teaching them
SELECT Course.Name, Faculty.Name
FROM Course
JOIN Faculty
ON Faculty.ID = Course.FacultyID;

-- 4. Display the names of all students enrolled in College Algebra, along with their student IDs and GPA
SELECT Student.Name, Student.ID, Student.GPA
FROM Student
JOIN Enrollment
ON Student.ID = Enrollment.StudentID
JOIN Course
ON Course.ID = Enrollment.CourseID
WHERE Course.Name = 'College Algebra';

-- 5. Display the names of instructors that are not assigned any course to teach
SELECT Faculty.Name
FROM Faculty
LEFT JOIN Course
ON Faculty.ID = Course.FacultyID
WHERE Course.FacultyID IS NULL;

