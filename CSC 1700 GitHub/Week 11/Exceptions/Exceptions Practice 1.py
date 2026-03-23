"""
Use exception handling to protect the code below.

Select the appropriate code below and copy/paste to their
appropriate positions and apply correct indentations.

attempt:
try:
trial:
except FileNotFoundError:
except ValueError:
except ZeroDivisionError:
print("File does not exist")
print("Cannot divide by zero")
print("Invalid value")
except Exception as e:
print(e)
"""

# File Not Found
with open("names.txt", "r") as file:
    for line in file:
        print(line.strip())

# ValueError
x = int(input("Enter a number: "))
print(x)

# Divide by Zero
x = int(input("Enter the number 0: "))
result = 10 / x
print(f"{result:.2f}")
