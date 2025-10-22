with open("example.txt") as file:
    lines = file.readlines()

for line in lines:
    print(line.strip())
