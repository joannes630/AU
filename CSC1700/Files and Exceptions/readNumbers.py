def readNumbers():
    file = open("numbers.txt", "r")
    num1 = int(file.readline())
    num2 = int(file.readline())
    num3 = int(file.readline())
    total = num1 + num2 + num3
    print(f"The total of the numbers in the file is {total}")

def main():
    readNumbers()

main()