
def main():
    #1
    # numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    # print(numbers)
    # i = 0
    # while i < 10:
    #     print(numbers[i])
    #     i += 1
    # for i in range(10):
    #     print(numbers[i])
    # for num in numbers:
    #     print(num)

    #2
    # numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    # i = 0
    # while i < len(numbers):
    #     print(numbers[i])
    #     i += 1
    # for i in range(len(numbers)):
    #     print(numbers[i])

    #3
    # numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    # numbers[0] = 101
    # numbers[1] = 102
    # numbers[2] = 103
    # print(numbers)

    #4
    # numbers = [0] * 100
    # for i in range(len(numbers)):
    #     numbers[i] = i+1
    # print(numbers)

    #5
    # names = ["Tony", "Steve", "Bruce"]
    # for i in range(len(names)):
    #     print(names[i])
    # names[1] = "Clint"
    # print(names)

    #6
    # days = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"]
    # weekdays = days[1:6]
    # print(weekdays)
    # weekend = days[:1] + days[6:]
    # print(weekend)

    #7
    # numbers = []
    # for i in range(100):
    #     numbers.append(i+1)
    # print(numbers)

    #8
    # names = ["Tony", "Steve", "Bruce"]
    # if "Steve" in names:
    #     index = names.index("Steve")
    #     names[index] = "Natasha"
    # print(names)

    #9
    # names = ["Tony", "Steve", "Bruce"]
    # if "Steve" in names:
    #     names.remove("Steve")
    # print(names)
    #
    # names = ["Tony", "Steve", "Bruce"]
    # if "Steve" in names:
    #     index = names.index("Steve")
    #     del names[index]
    # print(names)

    #10
    # numbers = []
    # for i in range(100):
    #     numbers.append(i+1)
    #
    # file = open("numbers.txt", "w")
    # for i in range(len(numbers)):
    #     file.write(str(numbers[i]) + "\n")
    # file.close()

    #11
    # file = open("ex.txt", "r")
    # numbers = file.readlines()
    # file.close()
    # total = 0
    # for i in range(len(numbers)):
    #     total += int(numbers[i])
    # avg = total / len(numbers)
    # print(avg)

    #12
    list_2D = [[1, 2, 3],
               [4, 5, 6],
               [7, 8, 9]]
    total = 0
    for row in range(len(list_2D)):
        for col in range(len(list_2D[0])):
            total += list_2D[row][col]
    print(total)

    numCols = len(list_2D[0])
    for row in range(len(list_2D)):
        total = 0
        for col in range(numCols):
            total += list_2D[row][col]
        avg = total / numCols
        print(avg)

main()

