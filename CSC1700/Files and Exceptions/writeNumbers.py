def writeFile():
    num1 = int(input("Enter number 1: "))
    num2 = int(input("Enter number 2: "))
    num3 = int(input("Enter number 3: "))
    total = num1 + num2 + num3
    print(f"The total of the three numbers entered is {total}")

    file = open("numbers.txt", "w")
    file.write(str(num1) + "\n")
    file.write(str(num2) + "\n")
    file.write(str(num3) + "\n")
    file.close()

def main():
    writeFile()

main()

