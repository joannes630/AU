def add(matrix1, matrix2):
    matrix = []
    for i in range(len(matrix1)):
        row = []
        for j in range(len(matrix1[0])):
            sum = matrix1[i][j] + matrix2[i][j]
            row.append(sum)
        matrix.append(row)

    return matrix

def main():
    matrix1 = [
        [1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]
    ]
    matrix2 = [
        [9, 8, 7],
        [6, 5, 4],
        [3, 2, 1]
    ]
    matrix = add(matrix1, matrix2)
    for row in matrix:
        print(row)

main()
