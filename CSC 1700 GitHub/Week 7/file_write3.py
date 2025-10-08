with open("example.txt", "w") as file:
    file.write("Hello, World!\n")

input("Press enter to continue ...")

with open("example.txt", "w") as file:
    file.write("This will overwrite\n")

