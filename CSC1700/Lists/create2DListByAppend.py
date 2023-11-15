# Create a 2D list by using append method

def main():
    list_2D = []
    name = "John Doe"
    rate = 12.50
    hours = 40.0
    list = [name, rate, hours]
    list_2D.append(list)

    name = "Jane Doe"
    rate = 22.50
    hours = 60.0
    list = [name, rate, hours]
    list_2D.append(list)

    # Print the 2D list one row at a time
    for row in range(len(list_2D)):
        for col in range(len(list_2D[0])):
            print(list_2D[row][col], end=" ")
        print()

main()