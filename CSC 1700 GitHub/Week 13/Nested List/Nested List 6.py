"""
AVERAGE OF ROWS OF NESTED LIST
Write a function named avg_of_rows(nested_list) that takes a two-dimensional
list of numbers as input. The function should calculate the average of each row
and store these averages in a new list. 

It should iterate through each row, compute the row’s average by summing its
elements and dividing by the number of elements, and then append each row's
average to a result list. Finally, the function should return the list of row
averages.

avg = total / count
list = []
list.append(avg)
for row in nested_list:
total = 0
for elem in row:
total += elem
count = 0
return list
count += 1
def avg_of_rows(nested_list):
"""

def avg_of_rows(nested_list):
    list = []
    for row in nested_list:
        total = 0
        count = 0
        for elem in row:
            total += elem
            count += 1
        avg = total / count
        list.append(avg)
    return list

def main():
    nested_list = [[10, 23, 36],
                   [54, 85],
                   [67, 8, 78, 89]]
    result = avg_of_rows(nested_list)
    print(result)

main()
