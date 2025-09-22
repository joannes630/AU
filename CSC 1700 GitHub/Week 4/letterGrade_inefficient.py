# Inefficient Letter Grade Program

# Write a Python program that asks the user to enter their test score (0–100). The program should determine the letter
# grade based on the following scale:
# A: 90–100
# B: 80–89
# C: 70–79
# D: 60–69
# F: below 60
# After determining the grade, display it to the user.

score = int(input("Enter your test score (0–100): "))

if score >= 90 and score <= 100:
    grade = "A"
elif score >= 80 and score <= 89:
    grade = "B"
elif score >= 70 and score <= 79:
    grade = "C"
elif score >= 60 and score <= 69:
    grade = "D"
else:
    grade = "F"

print(f"Your grade is: {grade}")
