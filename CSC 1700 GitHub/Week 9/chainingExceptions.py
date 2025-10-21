total, count = 0, 0
try:
    with open("missing.txt", "r") as file:
        for line in file:
            num = int(line)
            total += num
            count += 1
    print(f"The average of the numbers in the file is {total / count:.2f}")
except FileNotFoundError:
    print("File not found")
except ValueError:
    print("Invalid value")
except ZeroDivisionError:
    print("Divide by zero")

print("Program continues ...")
