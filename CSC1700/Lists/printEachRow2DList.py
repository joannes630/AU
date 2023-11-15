# Print the sum of each row in a 2-D List

def main():
    list = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    for row in range(len(list)):
        total = 0
        for col in range(len(list[0])):
            total += list[row][col]
        print(total)

main()