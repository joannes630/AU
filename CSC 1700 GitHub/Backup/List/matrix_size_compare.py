"""
Write a Python function named `is_same` that accepts two arguments, which
are two-dimensional lists. The function checks if two 2D lists
(matrices) have the same dimensions (i.e., the same number of rows and
columns in each row). The function should return True if they are the same
size, otherwise False.
"""

def is_same(m1, m2):
    same = True
    if len(m1) != len(m2):
        same = False
    else:
        for i in range(len(m1)):
            if len(m1[i]) != len(m2[i]):
                same = False
                break
    return same

def main():
    m1 = [[1, 2, 3],
          [4, 5, 6],
          [7, 8, 9]]
    m2 = [[11, 12, 13],
          [14, 15, 16],
          [17, 18, 19]]

    print(is_same(m1, m2))

main()
