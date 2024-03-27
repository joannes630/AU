def main():
    values = [[1,   2,   3],
              [10,  20,  30],
              [100, 200, 300]]

    for i in range(len(values)):
        for j in range(len(values[i])):
            print(values[i][j])

if __name__ == '__main__':
    main()
