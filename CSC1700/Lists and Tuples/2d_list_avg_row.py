def main():
    values = [[1,   2,   3],
              [10,  20,  30],
              [100, 200, 300]]

    for i in range(len(values)):
        total = 0
        for j in range(len(values[i])):
            total += values[i][j]
        avg = total / len(values[i])
        print(f"The average of row {i+1} is {avg}")

if __name__ == '__main__':
    main()
