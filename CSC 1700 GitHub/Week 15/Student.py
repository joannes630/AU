"""
Write a Python program that defines a class named Student to
store information about a student.

The class must include the following:
1. An __init__() constructor that accepts two parameters:
      name – the student's name
      grade – the student's numeric grade
2. A __str__() method that returns the student information in
   the following format:
      Student: Alice, Grade: 95.50
      The grade should always display with two decimal places.

3. Setter methods:
    set_name(name) – updates the student's name
    set_grade(grade) – updates the student's grade
4. Getter methods:
    get_name() – returns the student's name
    get_grade() – returns the student's grade

After creating the class, write code that:
1. Creates a Student object with any sample name and grade.
2. Prints the object.
3. Changes the student's name and grade using the setter methods.
4. Prints the updated object.
5. Displays the name and grade separately using the getter methods.
"""
class Student:
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade

    def __str__(self):
        return f"Student: {self.name}, Grade: {self.grade:.2f}"

    def set_name(self, name):
        self.name = name

    def set_grade(self, grade):
        self.grade = grade

    def get_name(self):
        return self.name

    def get_grade(self):
        return self.grade

student1 = Student("Joannes", 85.00)
student2 = Student("Alice", 92.00)
print(student1)
print(student2)

