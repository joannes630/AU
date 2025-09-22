# A factorial is the product of all positive integers from 1 up to a given number n.
# It is written as n! and defined as: n!=n×(n−1)×(n−2)×⋯×2×1
# By definition, 0! = 1.

# Compute the factorial of a given number using a while loop.

num = int(input("Enter a positive number: "))
result = 1
i = 1
while i <= num:
    result *= i
    i += 1
print(f"The factorial of {num} is {result}")