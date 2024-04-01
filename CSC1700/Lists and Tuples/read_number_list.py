def main():
    infile = open('numberlist.txt', 'r')

    numbers = infile.readlines()
    infile.close()

    for index in range(len(numbers)):
        numbers[index] = int(numbers[index])

    print(numbers)

if __name__ == '__main__':
    main()

"""
After, numbers = infile.readlines(), the numbers variable (which is a list) contains
numbers = ['1\n', '2\n', '3\n', '4\n', '5\n', '6\n', '7\n']
The file is closed since we now have its content in our list,
which is a list of strings.

Now we iterate through our list.
for index in range(len(numbers)):
for index in range(7):
for index in [0, 1, 2, 3, 4, 5, 6]:

For each iteration, we overwrite the content of our list
converting it from a string to an integer

Then we simply print the list, which is now a list of integers. 

"""
