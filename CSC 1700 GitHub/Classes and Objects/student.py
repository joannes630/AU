class Student:
    def __init__(self, name, age, grades):
        self.name = name
        self.age = age
        self.grades = grades  # grades should be a list of numbers

    def calculate_average(self):
        if len(self.grades) == 0:
            return 0  # Return 0 if there are no grades to avoid division by zero
        total = 0
        for grade in self.grades:
            total += grade
        return total / len(self.grades)

    def get(self):
        return self.name, self.age, self.grades

    def add_grade(self, grade):
        self.grades.append(grade)

# Example usage
student1 = Student("Alice", 18, [85, 92, 78])
student2 = Student("Bob", 19, [95, 88])
student3 = Student("Charlie", 20, [])  # Empty grades list

print(f"{student1.name}'s average: {student1.calculate_average()}")  # Output 85.0
print(f"{student2.name}'s average: {student2.calculate_average()}")  # Output 91.5
print(f"{student3.name}'s average: {student3.calculate_average()}")  # Output: 0.0 (no grades)

print(f"Student 1 attributes are {student1.get()}")

# Add a grade to student 3
student3.add_grade(88)
print(f"Student 3 attributes are {student3.get()}")
