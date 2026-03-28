"""
Use exception handling to protect the code below.
Choose the exception name from the following choices:
    FileNotFoundError
    ValueError
    ZeroDivisionError

Use the appropriate error print from below:
    File not found
    Invalid value
    Cannot divide by zero
"""

with open("numbers.txt", "r") as file:
    for line in file:
        print(line.strip())
