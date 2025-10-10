# This program demonstrates how numbers
# must be converted to strings before they
# are written to a text file.

def main():
    # Open a file for writing.
    with open('numbers.txt', 'w') as outfile:
        # Get three numbers from the user.
        num1 = int(input('Enter a number: '))
        num2 = int(input('Enter another number: '))
        num3 = int(input('Enter another number: '))
        sum = num1 + num2 + num3

        print(f"The sum of the numbers entered is ", sum)

        # Write the numbers to the file.
        outfile.write(str(num1) + '\n')
        outfile.write(str(num2) + '\n')
        outfile.write(str(num3) + '\n')

    print('Data written to numbers.txt')

# Call the main function.
main()
