"""
String Length Check
Write a program that asks the user for a string and prints:
    "Long string" if the length is greater than or equal to 10
    "Short string" otherwise
"""

text = input("Enter a string: ")
if len(text) >= 10:
    print("Long string")
else:
    print("Short string")
