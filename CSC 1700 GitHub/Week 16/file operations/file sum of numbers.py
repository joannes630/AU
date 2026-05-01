"""
Write a function named sum_of_numbers that accepts a
filename as a parameter. The file will contain one integer
per line.

The function should:
1. Open the file for reading
2. Read each line, convert it to an integer, and accumulate
   the total
3. Return the sum of all the numbers in the file
"""

def sum_of_numbers(filename):
    total = 0
    with open(filename, "r") as file:
        for line in file:
            num = int(line)
            total += num

    return total

