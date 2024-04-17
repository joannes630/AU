# Calculating average using an index
# One Dimensional List
my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9]
total = count = 0
for i in range(len(my_list)):
    total += my_list[i]
    count += 1
avg = total / count
print(avg)

# Average of all the elements of a 2-D list
# Two Dimensional List
my_2dlist = [[1, 2, 3],
             [4, 5, 6],
             [7, 8, 9]]
total = count = 0
for i in range(len(my_2dlist)):
    for j in range(len(my_2dlist[i])):
        total += my_2dlist[i][j]
        count += 1
avg = total / count
print(avg)

# Average of each row of a 2-D list
# Two Dimensional List
my_2dlist = [[1, 2, 3],
             [4, 5, 6],
             [7, 8, 9]]
for i in range(len(my_2dlist)):
    total = count = 0
    for j in range(len(my_2dlist[i])):
        total += my_2dlist[i][j]
        count += 1
    avg = total / count
    print("\t", avg)

    
