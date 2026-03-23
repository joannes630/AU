"""
In addition to a running total, we can do other operations
on a list, like searching for the maximum value
"""
list = [123, 645, 75, 902, 433, 22]
max = list[0]
for num in list:
    if num > max:
        max = num
print(max)

"""
We can also search for the minimum value.
"""
list = [123, 645, 75, 902, 433, 22]
min = list[0]
for num in list:
    if num < min:
        min = num
print(min)

"""
We can search for a particular value in a list
"""
list = [123, 645, 75, 902, 433, 22]
search = int(input("Enter a number to search: "))
for num in list:
    if search == num:
        print(f"Found {search}")
        break
print("All done")

"""
Now, what if the requirement is to print if a number
is in the list. And if the number is not in the list
print the number is not found?
"""
list = [123, 645, 75, 902, 433, 22]
search = int(input("Enter a number to search: "))
found = False
for num in list:
    if search == num:
        found = True
        break
if found:
    print(f"The number {search} is in the list")
else:
    print(f"The number {search} is not in the list")

"""
We can also have a problem like, print the sum of all the
even numbers in the list.
"""
list = [123, 645, 75, 902, 433, 22]
total = 0
for num in list:
    if num % 2 == 0:
        total += num
print(total)

"""
Or, we can have a problem like, replace all the odd numbers
in the list with that number plus 1
"""
list = [324, 232, 885, 23, 65]
for i, num in enumerate(list):
    if num % 2 == 1:
        list[i] = num + 1
print(list)

"""
Another similar problem:
Replace all numbers divisible by three in the list with
zero. 
"""
list = [324, 300, 366, 400]
for i, num in enumerate(list):
    if num % 3 == 0:
        list[i] = 0
print(list)