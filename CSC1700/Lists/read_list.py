# This program reads a file's contents into a list.
cities_data = []

def main():
    file = open("cities_data.txt", "r")
    lines = file.readlines()
    file.close()

    for line in lines:
        line = line.split(",")
        city = line[0]
        championships = line[1:]
        total = 0
        for c in championships:
            total += int(c)
        # print(city, total)
        cities_data.append([city, total])

    print(cities_data)

# Call the main function.
main()

# infile = open('cities_data.txt', 'r')
# cities = infile.readlines()
# infile.close()
#
# for line in cities:
#     line = line.split(",")
#     city = line[0]
#     someData = line[1:]
#     total = 0
#     for data in someData:
#         total += int(data)
#
#     cities_data.append([city, total])
# print(cities_data)