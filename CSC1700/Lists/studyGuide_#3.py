# Total of each row of a two-dimensional list.
#    Write a function that accepts one argument which is a two-dimensional
#    list of integers. The function will calculate the total of each row of
#    a two-dimensional list. The total of each row will be stored in a
#    list and returned from the function.

def total(list):
    list2 = []
    for row in range(len(list)):
        total = 0
        for col in range(len(list[row])):
            total += list[row][col]
        list2.append(total)
    return list2

list = [[1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]]

print(f"The 2D list is {list}")
list2 = total(list)
print(f"The total of each row is {list2}")


