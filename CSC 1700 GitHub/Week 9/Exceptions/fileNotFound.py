try:
    with open("missing.txt", "r") as file:
        for line in file:
            print(line)
except FileNotFoundError:
    print("File does not exist")

print("Program continues ...")
