"""
Use exception handling to protect the code below.
Possible exceptions are File not Found, Value Error, and
Divide by Zero

Select the appropriate code below and copy/paste to their
appropriate positions and apply correct indentations.

attempt:
trial:
except FileNotFoundError:
except ValueError:
except ZeroDivisionError:
print("File does not exist")
print("Cannot divide by zero")
print("Invalid value")
try:
except Exception as e:
print(e)
"""

with open("numbers.txt", "r") as file:
    total = 0
    count = 0
    for line in file:
        num = int(line)
        total += num
        count += 1
print(f"Average is {total / count:.2f}")

