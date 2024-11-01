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
3. Retrieve a student's grade by their name.
4. Print all students and their grades.
5. Calculate and print the average grade.
6. Find and print the student(s) with the highest grade.

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

# 2a: Function to add or update a student's grade
def add_grade(student, grade):
    pass

# 2b: Function to retrieve a student's grade
def get_grade(student):
    pass
    
# 2c: Function to print all student grades
def print_grades(): 
    pass
    
# 2d: Function to calculate and print the average grade
def calculate_average(): 
    pass
    
# 2e: Function to find and print the student(s) with the highest grade
def get_highest_grade(): 
    pass
    
# Driver
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
