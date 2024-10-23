m1 = [[1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]]
m2 = [[11, 12, 13],
      [14, 15, 16],
      [17, 18, 19]]

# Check if m1 and m2 are the same size matrices
same = True
if len(m1) != len(m2):
    same = False
else:
    for i in range(len(m1)):
        if len(m1[i]) != len(m2[i]):
            same = False
            break

print(same)



