def writeFile():
    num1 = float(input("Enter number 1: "))
    num2 = float(input("Enter number 2: "))
    num3 = float(input("Enter number 3: "))
    total = num1 + num2 + num3
    print(f"The total of the three numbers entered is {total:.2f}")

    file = open("numbers.txt", "w")
    file.write(str(format(num1, ".2f")) + "\n")
    file.write(str(format(num2, ".2f")) + "\n")
    file.write(str(format(num3, ".2f")) + "\n")
    file.close()

def main():
    writeFile()

main()

