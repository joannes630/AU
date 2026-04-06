"""
MAX OF THE NESTED LIST
Write a function named find_max(nested_list) that takes a two-dimensional list
of numbers as input. The function should iterate through all rows and elements
to find and return the maximum value. 

If the input list is empty, the function should return None.
You are not allowed to use the max function.

for elem in row:
max = nested_list[0][0]
return None
for row in nested_list:
if len(nested_list) != 0:
return max
if elem > max:
def find_max(nested_list):
max = elem
else:
"""

def find_max(nested_list):
    if len(nested_list) != 0:
        max = nested_list[0][0]
        for row in nested_list:
            for elem in row:
                if elem > max:
                    max = elem
        return max
    else:
        return None

def main():
    nested_list = [[10, 23, 36, 43],
                   [54, 85],
                   [67, 8, 78]]
    result = find_max(nested_list)
    print(result)

main()
