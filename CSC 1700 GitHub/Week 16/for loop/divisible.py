"""
Write a program that displays all numbers from 1 to 50 that
are perfectly divisible by both 3 and 5.
"""

for num in range(1, 51):
    if num % 3 == 0 and num % 5 == 0:
        print(num)
