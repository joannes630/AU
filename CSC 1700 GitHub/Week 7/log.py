
with open("log.txt", "a") as file:
	entry = input("Log entry: ")
	file.write("Log entry: " + entry + "\n")

print("Entry added to log.txt")