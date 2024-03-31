def main():
    numbers = [1, 2, 3, 4, 5, 6, 7]
    outfile = open('numberlist.txt', 'w')

    for item in numbers:
        outfile.write(str(item) + '\n')

    outfile.close()

if __name__ == '__main__':
    main()

"""
The for loop is
for item in numbers:
for item in [1, 2, 3, 4, 5, 6, 7]:

outfile.write(str(1) + "\n")
File: "1\n"

outfile.write(str(2) + "\n")
File: "1\n2\n"

outfile.write(str(3) + "\n")
File: "1\n2\n3\n"

and so on, until finally

outfile.write(str(7) + "\n")
File: "1\n2\n3\n4\n5\n6\n7\n"

After the program runs, the file would contain
1
2
3
4
5
6
7
"""
