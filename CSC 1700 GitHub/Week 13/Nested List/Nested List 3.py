"""
TOTAL OF THE NESTED LIST
Write a function named compute_total(nested_list) that takes a two-dimensional
list (a list of lists) as input. The function should iterate through each row
and then through each element within that row, summing all the elements.

Finally, the function should return the total sum of all elements in the nested
list.

total += elem
total = 0
for row in nested_list:
def compute_total(nested_list):
return total
for elem in row:
"""


def compute_total(nested_list):
    total = 0
    for row in nested_list:
        for elem in row:
            total += elem
    return total

def main():
    nested_list = [[1, 2, 3],
                   [4, 5, 6],
                   [7, 8, 9]]
    result = compute_total(nested_list)
    print(result)

main()
