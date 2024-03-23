# This program demonstrates a two-dimensional list.

def main():
    # Create a two-dimensional list.
    values = [[1,   2,   3],
              [10,  20,  30],
              [100, 200, 300]]

    # Display the list elements.
    for row in values:
        for element in row:
            print(element)

# Call the main function.
if __name__ == '__main__':
    main()