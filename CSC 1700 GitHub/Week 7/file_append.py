with open("example.txt", "w") as file:
    file.write("Hello, World!\n")

input("Press enter to continue ...")

with open("example.txt", "a") as file:
    file.write("This will not overwrite\n")

