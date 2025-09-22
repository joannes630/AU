# Write a Python program that repeatedly asks the user to enter a string.
# The program should stop running only when the user enters "quit".

str = input("Enter string: ")
while str != "quit":
    str = input("Enter string: ")
print("User entered 'quit' ")