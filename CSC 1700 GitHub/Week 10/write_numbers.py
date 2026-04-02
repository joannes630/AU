"""
Write a Python program that stores three numbers in a file.
Your program should:
Create three variables named x, y, and z and assign them the values 11,
29, and 34, respectively
Open a file named numbers.txt in write mode
Write each number to the file on a separate line
Make sure to include a newline character (\n) after each number

file.write(str(x) + "\n")
file.write(str(x))
x = 11
y = 29
file.write(str(y) + "\n")
file.write(str(y))
file.write(str(z) + "\n")
file.write(str(z))
z = 34
with open("numbers.txt", "w") as file:
file = open("numbers.txt", "r") as file:
file = open("numbers.txt") as file:
file.close()
file.write(x)
file.write(y)
file.write(z)
"""

