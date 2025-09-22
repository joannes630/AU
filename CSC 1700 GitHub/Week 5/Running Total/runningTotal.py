# Keep asking for numbers and add them to a running total.
# Stop when the user enters 0.

total = 0
num = int(input("Enter a number (0 to stop): "))
while num != 0:
    total += num
    num = int(input("Enter a number (0 to stop): "))
print("The total is:", total)