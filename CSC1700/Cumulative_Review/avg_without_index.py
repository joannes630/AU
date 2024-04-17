# Calculating average without using an index
# One Dimensional List
my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
total = count = 0
for x in my_list:
    total += x
    count += 1
avg = total / count
print(avg)

# Calculating average without using an index
# Two Dimensional List
my_2dlist = [[1, 2, 3],
             [4, 5, 6],
             [7, 8, 9]]
total = count = 0
for row in my_2dlist:
    for col in row:
        total += col
        count += 1
avg = total / count
print(avg)

# Calculating average of each row without using an index
# Two Dimensional List
my_2dlist = [[1, 2, 3],
             [4, 5, 6],
             [7, 8, 9]]
for row in my_2dlist:
    total = count = 0
    for col in row:
        total += col
        count += 1
    avg = total / count
    print("\t", avg)

# Calculating average without using an index
# Dictionary
dict = {'Ross': [1, 2, 3],
        'Joey': [4, 5, 6],
        'Chandler': [7, 8, 9]}
total = count = 0
for key, value in dict.items():
    for x in value:
        total += x
        count += 1
avg = total / count
print(avg)
