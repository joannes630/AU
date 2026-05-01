"""
Use an input statement to ask the user for a number.  Use
a for loop to calculate the sum of the numbers from 1 to
that number (inclusive).
Display the final total.
"""

total = 0
n = int(input("Enter a number: "))
for i in range(1, n+1):
    total += i
print(total)


