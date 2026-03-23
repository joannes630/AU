"""
A list is mutable, meaning the elements in a list
can be changed. We change the 2nd element (index 1)
in the list from 233 to 342.
"""
list = [545, 233, 67, 23]
print(list)
list[1] = 342
print(list)

"""
You can iterate through a list and process it so we can
compute algorithms like a running total.
"""
list = [342, 65, 33, 12, 364, 87]
total = 0
for num in list:
    total += num
print(total)

"""
You can iterate through a list and process it so we can
compute algorithms like an average of the values.
"""
list = [342, 65, 33, 12, 364, 87]
total = 0
count = 0
for num in list:
    total += num
    count += 1
print(f"{total/count:.2f}")

