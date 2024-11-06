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

# Example usage
student1 = Student("Alice", 20, [88, 92, 79, 85])
average = student1.calculate_average()
print(f"{student1.name}'s average grade is {average}")
