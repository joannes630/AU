
with open("data.txt", "r") as file:
    for line in file:
        name = line.strip()
        address = file.readline().strip()
        phone = file.readline().strip()
        file.readline()
        print(f"Name: {name}")
        print(f"Address: {address}")
        print(f"Phone: {phone}")
        print()
