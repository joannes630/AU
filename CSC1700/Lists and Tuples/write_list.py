def main():
    cities = ['New York', 'Boston', 'Atlanta', 'Dallas']
    outfile = open('cities.txt', 'w')

    for item in cities:
        outfile.write(item + '\n')

    outfile.close()

if __name__ == '__main__':
    main()

"""
item = "New York"
file:
"New York\n"

item = "Boston"
file:
"New York\nBoston\n"

item = "Atlanta"
file:
"New York\nBoston\nAtlanta\n"

item = "Dallas"
file:
"New York\nBoston\nAtlanta\nDallas\n"

"""
