total, count = 0, 0
try:
    with open("missing.txt", "r") as file:
        for line in file:
            num = int(line)
            total += num
            count += 1
    print(f"The average of the numbers in the file is {total / count:.2f}")
except Exception as err:
    print(err)

print("Program continues ...")
