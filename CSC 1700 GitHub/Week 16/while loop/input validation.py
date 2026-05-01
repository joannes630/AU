"""
Write a Python program that asks the user to enter their age
and uses input validation to ensure the value is between 0
and 120 inclusive. Once a valid age is entered, display it.
"""

while True:
    age = int(input("Enter your age (0-120): "))
    if 0 <= age <= 120:
        print(age)
        break

