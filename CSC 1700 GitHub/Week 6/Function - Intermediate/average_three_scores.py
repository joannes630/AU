"""
A teacher wants a program to quickly determine student performance based on 
three test scores. The program should take each student’s name and three test 
grades, compute the average of the scores, and then assign a letter 
grade (A–F) according to standard grading rules. Finally, the program should 
display the student’s name, average score (formatted to two decimal places), 
and the corresponding letter grade. 
"""

# Function to compute average and print letter grade
def print_grade(name, s1, s2, s3):
    avg = (s1 + s2 + s3) / 3
    if avg >= 90:
        grade = "A"
    elif avg >= 80:
        grade = "B"
    elif avg >= 70:
        grade = "C"
    elif avg >= 60:
        grade = "D"
    else:
        grade = "F"
    print(f"{name}'s average: {avg:.2f} → Grade {grade}")

# Main program
def main():
    print_grade("Alice", 95, 88, 92)
    print_grade("Bob", 92, 85, 70)
    print_grade("Charlie", 85, 60, 78)

main()
