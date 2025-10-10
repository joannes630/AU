"""
This program demonstrates how numbers that are
read from a file must be converted from strings
before they are used in a math operation.
"""

def main():
    # Open a file for reading.
    with open('numbers.txt', 'r') as infile:

        # Read three numbers from the file.
        num1 = int(infile.readline())
        num2 = int(infile.readline())
        num3 = int(infile.readline())

    # Add the three numbers.
    total = num1 + num2 + num3

    # Display the numbers and their total.
    print('The numbers are:', num1, num2, num3)
    print('Their total is:', total)

# Call the main function.
main()
