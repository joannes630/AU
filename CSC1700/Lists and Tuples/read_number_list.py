# This program reads numbers from a file into a list.

def main():
    # Open a file for reading.
    infile = open('numberlist.txt', 'r')

    # Read the contents of the file into a list.
    numbers = infile.readlines()
    
    # Close the file.
    infile.close()

    # Convert each element to an int.
    for index in range(len(numbers)):
        numbers[index] = int(numbers[index])

    # Print the contents of the list.
    print(numbers)

# Call the main function.
if __name__ == '__main__':
    main()