def main():
    values = [[1,   2,   3],
              [10,  20,  30],
              [100, 200, 300]]

    total = 0
    count = 0
    for i in range(len(values)):
        for j in range(len(values[i])):
            total += values[i][j]
            count += 1
    avg = total / count
    print(f"The average value is {avg}")

if __name__ == '__main__':
    main()
