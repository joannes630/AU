"""
Change the 2nd element in the list (index 1)
from a value of 233 to 342.

numbers[2] = 342
numbers[1] = 342
numbers(2) = 342
numbers(1) = 342
"""
numbers = [545, 233, 67, 23]
numbers[1] = 342


"""
Compute and print the total value of all the elements in the list
below. Do not use the function sum().

total = 0
count = 0
for num in numbers:
total += num
total += numbers
count += 1
print(total)
print(count)
"""
numbers = [342, 65, 33, 12, 364, 87]
total = 0
for num in numbers:
    total += numbers
print(total)


"""
Compute and print the average value (round to two decimal places) 
of all the elements in the list below. Do not use the function sum().

total = 0
for num in numbers:
total += num
total += numbers
count += 1
print(total)
count = 0
print(count)
print(f"{total/count:.2f}")
print(f"{total/count:2f}")
print("{total/count:.2f}")
print(f"{total/len(numbers):.2f}")
"""
list = [342, 65, 33, 12, 364, 87]
total = 0
count = 0
for num in numbers:
    total += num
    count += 1
print(f"{total/count:.2f}")

