class Student:
    def __init__(self, name, scores, student_id, major, year):
        self.name = name
        self.scores = scores
        self.student_id = student_id
        self.major = major
        self.year = year

    def get_average(self):
        return sum(self.scores) / len(self.scores)

    def get_letter_grade(self):
        return "FDCBA"[min(4, round(self.get_average()) // 10 - 5)] if self.get_average() > 60 else "F"

    def __str__(self):
        return f"{self.name} ({self.student_id}) - {self.major}, {self.year}, " \
               f"Avg: {self.get_average():.2f}, Grade: {self.get_letter_grade()}"


def load_students(filename):
    students = {}

    with open(filename, "r") as file:
        for line in file:
            line = line.strip()

            if line == "":
                continue

            data = line.split(",")

            name = data[0].strip()
            scores = [int(data[i].strip()) for i in range(1, 6)]
            student_id = int(data[6].strip())
            major = data[7].strip()
            year = data[8].strip()

            students[student_id] = Student(name, scores, student_id, major, year)

    return students

def main():
    students = load_students("students.txt")

    while True:
        print("\nMENU (Choose an operation):")
        print("1. Display all student data")
        print("2. Search for student using ID")
        print("3. Search for student using name")
        print("4. Match letter grade")
        print("5. Match class standing")
        print("6. Exit")

        choice = input("Enter your choice (1-6): ")
        if choice == "1":
            for student in students.values():
                print(student)
        elif choice == "2":
            id = int(input("Enter student ID to search: "))
            if id in students:
                print(students[id])
            else:
                print(f"{id} not found")
        elif choice == "3":
            name = int(input("Enter student name to search: "))
            pass
        elif choice == "4":
            grade = input("Enter letter grade: ")
            pass
        elif choice == "5":
            class_standing = input("Enter class standing to search: ")
            pass
        elif choice == "6":
            print("Exiting program... Goodbye!")
            break
        else:
            print("Invalid choice. Please enter a number between 1 and 6.")

main()
