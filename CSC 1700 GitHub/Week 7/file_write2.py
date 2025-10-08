# Open a file for writing (creates file if it doesn’t exist)
with open("output.txt", "w") as file:

	# Write text to the file
	file.write("Hello, world!\n")
	file.write("This is Python file handling.\n")