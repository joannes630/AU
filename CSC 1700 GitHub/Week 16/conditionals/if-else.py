"""
Write a program that prompts the user to enter an integer.
Determine whether the number is even or odd.  If the number
is divisible by 2, display Even.

Otherwise, display Odd.
"""

num = int(input("Enter a number: "))
if num % 2 == 0:
    print("Even")
else:
    print("Odd")

