# Function to compute average score
def compute_average(score1, score2, score3):
    return (score1 + score2 + score3) / 3

# Function that calls compute_average
def print_grade(name, s1, s2, s3):
    avg = compute_average(s1, s2, s3)  # function calling a function
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
