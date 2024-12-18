"""
Dictionary
Objective: In addition to adding, updating, and retrieving student grades, 
students will now also calculate the average grade of the class and find the 
student(s) with the highest grade.

Problem Statement:
Write a Python program that performs the following tasks:

1. Create an empty dictionary called `grades` to store student names (as keys) 
   and their grades (as values).
2. Add new student grades to the dictionary.
3. Update existing student grades.
4. Retrieve a student's grade by their name.
5. Print all students and their grades.
6. Calculate and print the average grade.
7. Find and print the student(s) with the highest grade.

Instructions:
1. Create an empty dictionary called grades.
2. Implement the following functions:
	a. add_grade(student, grade): Adds or updates a student’s grade.
	b. get_grade(student): Retrieves the grade for a specific student.
	c. print_grades(): Prints all students and their grades.
	d. calculate_average(): Calculates and prints the average grade.
	e. get_highest_grade(): Finds and prints the student(s) with the highest 
	   grade.
    f. get_A_students(): Find and return a list of all A students.

"""

"""
    Dictionary methods:
        dict[key] = value   --> add/update a key/value pair
        dict[key]           --> to retrieve a value in a dictionary
        dict.get(key)       --> to retrieve a value in a dictionary (returns None if key not found)
        dict.pop(key)       --> to retrieve and delete an item in a dictionary
        dict.popitem()      --> to retrieve and delete the last item in a dictionary
        dict.keys()         --> retrieves a list of keys
        dict.value()        --> retrieves a list of values
        dict.items()        --> retrieves a list of key/value pairs

    del dict[key]       --> deletes an item in a dictionary
"""

# 1: Create the dictionary to store student grades
grades = {}

# 2a: Function to add or update a student's grade
def add_grade(student, grade):
    grades[student] = grade

# 2b: Function to retrieve a student's grade
def get_grade(student):
    if student in grades:
        return grades[student]
    else:
        return None

# 2c: Function to print all student grades
def print_grades():
	for student, grade in grades.items():
		print(f"{student}: {grade}")

# 2d: Function to calculate the average grade
def calculate_average():
	sum = 0
	count = 0
	for student in grades:
		sum += grades[student]
		count += 1
		
	average = sum / count
	print(f"Average grade: {average:.2f}")

# 2e: Function to find and print the student(s) with the highest grade
def get_highest_grade():
    highest_grade = 0
    for name in grades:
        if grades[name] > highest_grade:
            highest_grade = grades[name]
            highest_student = name

    print("The student with the highest grade is", highest_student, highest_grade )

# 2f: Find and return a list of all A students.
def get_A_students():
    list = []
    for name in grades:
        if grades[name] >= 90:
            list.append(name)
    return list

#
# Example usage
add_grade("Alice", 85)
add_grade("Bob", 92)
add_grade("Charlie", 78)
add_grade("Diana", 93)
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

# Find all A students
print("The A students are:", get_A_students())
