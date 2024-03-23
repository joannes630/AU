# This program reads a file's contents into a list.

def main():
    # Open a file for reading.
    infile = open('cities.txt', 'r')

    # Read the contents of the file into a list.
    cities = infile.readlines()
    
    # Close the file.
    infile.close()

    # Strip the \n from each element.
    for index in range(len(cities)):
        cities[index] = cities[index].rstrip('\n')

    # Print the contents of the list.
    print(cities)

# Call the main function.
if __name__ == '__main__':
    main()