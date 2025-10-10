# Problem with not closing the file

file = open("myfile.txt", "w")
file.write("Hello\n")
# The file was not flushed via the close() method

file2 = open("myfile.txt", "r")
line = file2.readline()   
print(line)
# This would not print anything

