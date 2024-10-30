"""
Dictionary
Objective: In addition to adding, updating, and retrieving student grades, 
students will now also calculate the average grade of the class and find the 
student(s) with the highest grade.

Problem Statement:
Write a Python program that performs the following tasks:

1. Create an empty dictionary called `grades` to store student names (as keys) 
   and their grades (as values). Make it global.
2. Add new student grades to the dictionary.
3. Update existing student grades.
4. Retrieve a student's grade by their name.
5. Print all students and their grades.
6. Calculate and print the average grade.
7. Find and print the student(s) with the highest grade.

Instructions:
1. Create an empty dictionary (global) called grades.
2. Implement the following functions:
	a. add_grade(student, grade): Adds or updates a student’s grade.
	b. get_grade(student): Retrieves the grade for a specific student.
	c. print_grades(): Prints all students and their grades.
	d. calculate_average(): Calculates and prints the average grade.
	e. get_highest_grade(): Finds and prints the student(s) with the highest 
	   grade.

"""
# Step 1: Create the dictionary to store student grades

# Step 2, 3: Function to add or update a student's grade

# Step 4: Function to retrieve a student's grade

# Step 5: Function to print all student grades

# Step 6: Function to calculate the average grade

# Step 7: Function to find and print the student(s) with the highest grade

# Example usage
add_grade("Alice", 85)
add_grade("Bob", 92)
add_grade("Charlie", 78)
add_grade("Diana", 92)  # Another student with the highest grade
print(grades)

# Get individual student grade
grade = get_grade("Alice")
print("Alice's grade is", grade)

# Update a grade
add_grade("Alice", 90)

# Print all grades
print("All students and grades:")
print_grades()

# Calculate and print the average grade
calculate_average()

# Find and print the highest grade
get_highest_grade()
