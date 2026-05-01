"""
Write a program that prompts the user to enter an integer.
Determine whether the number is positive, negative, or zero.

If the number is greater than 0, display Positive. If the
number is less than 0, display Negative. Otherwise, display
Zero.
"""

num = int(input("Enter a number: "))
if num > 0:
    print("Positive")
elif num < 0:
    print("Negative")
else:
    print("Zero")


