def readFile():
    file = open("myFile.txt", "r")
    content = file.read()
    print(content)

def appendFile():
    file = open("myFile.txt", "a")
    file.write("Peter\n")
    file.write("Sanchez\n")
    file.write("CYB\n")
    file.close()

def writeFile():
    file = open("myFile.txt", "w")
    file.write("Johann\n")
    file.write("Cruz\n")
    file.write("CSC\n")
    file.close()

def main():
    writeFile()
    readFile()
    appendFile()
    readFile()

main()

