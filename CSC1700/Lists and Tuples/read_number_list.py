def main():
    infile = open('numberlist.txt', 'r')

    numbers = infile.readlines()
    infile.close()

    for index in range(len(numbers)):
        numbers[index] = int(numbers[index])

    print(numbers)

if __name__ == '__main__':
    main()
