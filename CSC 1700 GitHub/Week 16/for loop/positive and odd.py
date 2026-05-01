"""
Write a for loop that iterates 10x. Each time, use an input
statement to ask the user to enter a number. Include the
number in the running total only if:
    the number is odd and positive

Display the final running total.
"""

total = 0
for _ in range(10):
    num = int(input("Enter a number: "))
    if num % 2 == 1 and num > 0:
        total += num

print(f"The sum of positive odd numbers is {total}")
