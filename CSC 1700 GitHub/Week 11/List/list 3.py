"""
Search and print the maximum value of the list below.
Do not use the function max().

max = 0
for num in numbers:
max = num
max = numbers[0]
print(max)
if num > max:
if num < max:
"""
numbers = [123, 645, 75]
max = numbers[0]
for num in numbers:
    if num > max:
        max = num
print(max)


"""
Search and print the minimum value of the list below.
Do not use the function min().

min = 0
for num in numbers:
min = num
min = numbers[0]
print(min)
if num > min:
if num < min:
"""
numbers = [123, 645, 75]
min = numbers[0]
for num in numbers:
    if num < min:
        min = num
print(min)


"""
Ask the user for a number. Search if that number is in the list. 
If that number is in the list, print "Found", otherwise, print "Not Found". 
Do not use the in operator (except in the for loop).  
Make sure your search is efficient.

found = False
for num in numbers: 
print("Found")
if search == num:
found = True
print("Not Found")
search = int(input("Enter a number: "))
break
if found:
else:
"""
numbers = [123, 645, 75, 902, 433, 22]
found = False
search = int(input("Enter a number: "))
for num in numbers: 
    if search == num:
        found = True
        break
if found:
    print("Found")
else:
    print("Not Found")


"""
Compute and print the sum of all the even numbers
in the list.

total = 0
for num in numbers:
if num % 2 == 0:
total += num
print(total)
if num % 2 == 1:
"""
numbers = [123, 645, 75, 902, 433, 22]
total = 0
for num in numbers:
    if num % 2 == 0:
        total += num
print(total)


"""
Replace each odd number in the list with its value plus one.
Print the list after replacing.

if num % 2 == 1:
for i, num in enumerate(numbers):
numbers[i] = num + 1
for num in numbers:
if num % 2 == 0:
print(numbers)
"""
numbers = [324, 232, 885, 23, 65]
for i, num in enumerate(numbers):
    if num % 2 == 1:
        numbers[i] = num + 1
print(numbers)



"""
Replace each number that is perfectly divisible by three in the list with zero.
Print the list after replacing.

print(numbers)
for i, num in enumerate(numbers):
if num % 3 == 0:
for num in numbers:
num[i] = 0
numbers[i] = 0
"""
numbers = [324, 300, 400, 366]
for i, num in enumerate(numbers):
    if num % 3 == 0:
        numbers[i] = 0
print(numbers)

