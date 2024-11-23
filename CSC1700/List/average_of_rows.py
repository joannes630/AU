"""
Write a Python function `average_of_rows` that takes a 2D list
as argument and returns a list containing the average of each row.

"""

def average_of_rows(matrix):
    result = []
    for i in range(len(matrix)):
        sum, count = 0, 0
        for j in range(len(matrix[i])):
            sum += matrix[i][j]
            count += 1
        avg = sum / count
        result.append(avg)
    return result

def main():
    matrix = [
        [10, 20, 30],
        [15, 25, 35],
        [40, 50, 60, 70]
    ]

    avg = average_of_rows(matrix)
    print(avg)

main()



