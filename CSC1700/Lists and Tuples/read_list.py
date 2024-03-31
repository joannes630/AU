def main():
    infile = open('cities.txt', 'r')

    cities = infile.readlines()
    infile.close()

    for index in range(len(cities)):
        cities[index] = cities[index].strip()

    print(cities)

if __name__ == '__main__':
    main()

"""
cities.txt contains
New York
Boston
Atlanta
Dallas

after, cities = infile.readlines()
cities = ["New York\n", "Boston\n", "Atlanta\n", "Dallas\n"]

Now we overwrite each element in the list, removing the "\n"

The for loop statement goes from:
for index in range(len(cities)):
for index in range(4):
for index in [0, 1, 2, 3]:

So,
cities[0] = "New York\n".strip() = "New York"
cities[1] = "Boston\n".strip() = "Boston"
cities[2] = "Atlanta\n".strip() = "Atlanta"
cities[3] = "Dallas\n".strip() = "Dallas"

After the loop, the list cities will be:
cities = ["New York", "Boston", "Atlanta", "Dallas"]

"""
