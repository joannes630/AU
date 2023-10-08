
for student in range(4):
    total = 0
    for grades in range(3):
        grade = int(input("Enter grade: "))
        total += grade
    avg = total / 3
    print(f"The average grade for Student {student+1} is {avg:.2f}")

