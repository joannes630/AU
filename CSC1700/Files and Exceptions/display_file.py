def main():
    filename = input('Enter a filename: ')
    infile = open(filename, 'r')
    contents = infile.read()
    print(contents)
    infile.close()

main()