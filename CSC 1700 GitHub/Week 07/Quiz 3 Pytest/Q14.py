"""
Input Validation

Use an input statement to prompt the user to enter a number
between 1 and 10 (inclusive). Use input validation to ensure
the number is within the valid range. If the number is
outside the range, continue prompting the user with a while
loop until a valid number is entered.

Once a valid number is entered, display the number.
"""

while True:
    num = int(input("Enter a number (1-10): "))
    if num >=0 and num <= 10:
        print(f"The valid number entered is {num}")
        break
    print("Invalid number...")

