"""
Use pokemon exception handling to protect the code below.
There are multiple exceptions that could occur
"""

try:
    with open("numbers.txt", "r") as file:
        total = 0
        count = 0
        for line in file:
            num = int(line)
            total += num
            count += 1
        print(f"Average is {total / count:.2f}")
except Exception as e:
    print(e)