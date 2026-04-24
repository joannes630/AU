"""
Write a Python program that uses the Student class shown below.

The class already includes:
    a constructor (__init__)
    a __str__() method to display the object
    a setter method for the student name
    a getter method for the student name

Your tasks are:
1. Write a setter method that updates the student's grade.
2. Write a getter method that returns the student's grade.
3. Create two Student objects with different names and grades.
4. Print both student objects using print().
5. Change the grade of one student using your setter method.
6. Print the updated student object again.
7. Demonstrate the getter method by printing the grade of one student.
"""

class Student:
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade

    def __str__(self):
        return f"Student: {self.name}, Grade: {self.grade:.2f}"

    def set_name(self, name):
        self.name = name

    def get_name(self):
        return self.name
