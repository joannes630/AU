"""
Write a program that asks the user to enter a numeric exam score (0–100).
Based on the score, the program should print the corresponding letter grade:
    A for scores 90 and above
    B for scores 80–89
    C for scores 70–79
    D for scores 60–69
    F for scores below 60
"""

score = int(input("Enter your score: "))
if score >= 90:
    print("A")
elif score >= 80:
    print("B")
elif score >= 70:
    print("C")
elif score >= 60:
    print("D")
else:
    prrint("F")
