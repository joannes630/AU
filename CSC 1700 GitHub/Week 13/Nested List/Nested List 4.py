"""
AVERAGE OF THE NESTED LIST
Write a function named compute_average(nested_list) that accepts a
two-dimensional list of numbers as input. The function should iterate through
each row and each element, calculating both the total sum and the count of all
elements. 

After processing, the function should return the average of all elements. If the
nested list is empty, the function should return None.

total = 0
for elem in row:
count = 0
for row in nested_list:
count += 1
def compute_average(nested_list):
return None
return total/count
total += elem
else:
if (len(nested_list) != 0):
"""

def compute_average(nested_list):
    total = 0
    count = 0
    for row in nested_list:
        for elem in row:
            total += elem
            count += 1
    if (len(nested_list) != 0):
        return total/count
    else:
        return None

def main():
    nested_list = [[10, 23, 36],
                   [54, 85, 126],
                   [67, 8, 78]]
    result = compute_average(nested_list)
    print(result)

main()
