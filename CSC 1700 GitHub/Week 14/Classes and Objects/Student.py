class Student:
    name = None
    grade = None

    # constructor
    def __init__(self, name, grade):
        self.name = name
        self.grade = grade

    # getter
    def get_grade(self):
        return self.grade

    # setter
    def set_grade(self, new_grade):
        self.grade = new_grade

    # regular method
    def display(self):
        print(f"Name: {self.name} Grade: {self.grade}")


# create objects
s1 = Student("Alice", 95)
s2 = Student("Bob", 88)

# use methods
s1.display()
print(s1.get_grade())

s1.set_grade(98)
s1.display()

s2.display()

