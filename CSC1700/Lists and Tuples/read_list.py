def main():
    infile = open('cities.txt', 'r')

    cities = infile.readlines()
    infile.close()

    for index in range(len(cities)):
        cities[index] = cities[index].strip()

    print(cities)

if __name__ == '__main__':
    main()
