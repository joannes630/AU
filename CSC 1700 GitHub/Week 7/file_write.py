# Open a file for writing (creates file if it doesn’t exist)
file = open("output.txt", "w")

# Write text to the file
file.write("Hello, world!\n")
file.write("This is Python file handling.\n")

# Always close the file after writing
file.close()
