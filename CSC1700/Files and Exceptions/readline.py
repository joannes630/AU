def readFile():
    file = open("myFile.txt", "r")
    line = file.readline()
    line = line.strip()
    print(line)
    line = file.readline()
    line = line.strip()
    print(line)
    line = file.readline().strip()
    line = line.strip()
    print(line)
    file.close()

def readWholeFile():
    file = open("myFile.txt", "r")
    line = file.readline()
    while line != "":
        line = line.strip()
        print(line)
        line = file.readline()
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
    readWholeFile()

main()

