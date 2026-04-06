"""
TOTAL OF THE NESTED LIST
Write a program that takes a 2D list called nested_list and calculates the sum
of all its elements. For each row in the list, iterate through each element, add
them to a running total, and finally print the total sum.

print(total)
for row in nested_list:
total = 0
total += elem
for elem in row:
"""

nested_list = [[1, 2, 3],
               [4, 5, 6],
               [7, 8, 9]]

total = 0
for row in nested_list:
    for elem in row:
        total += elem
print(total)

# Or, another way of doing it

total = 0
for i in range(len(nested_list)):
    for j in range(len(nested_list[i])):
        total += nested_list[i][j]
print(total)
