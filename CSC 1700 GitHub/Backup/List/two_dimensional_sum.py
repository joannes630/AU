matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

sum = 0
for i in range(len(matrix)):
    for j in range(len(matrix[0])):
        sum += matrix[i][j]

print("The sum of all elements is", sum)