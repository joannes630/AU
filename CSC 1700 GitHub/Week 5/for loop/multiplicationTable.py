# Write a Python program that asks the user to enter a number.
# Use a for loop to print its multiplication table from 1 through 10.

num = int(input("Enter a number: "))
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")
