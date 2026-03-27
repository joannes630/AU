"""
1. Create a list composed of three intengers.

numbers = (1, 2, 3)
numbers = [1, 2, 3]
numbers = 1, 2, 3
numbers = {1, 2, 3}
"""
numbers = [1, 2, 3]


"""
2. A list is provided to you below.
Print the second element of the list using its index.

print(numbers[2])
print(numbers[1])
print numbers[2]
print(list.2)
"""
numbers = [4, 191, 7, 2]
print(numbers[1])


"""
3. A list of integers is provided to you below.
Use a for loop print to print the values of each element
using "iterate by value"

for i in len(range(numbers)):
for i in range(len(numbers)):
for num in numbers:
print(num)
print(i)
"""
numbers = [34, 65, 67, 33]
for num in numbers:
    print(num)


"""
A list of integers is provided to you below.
Use a for loop to print the values of each element
using "Iterate by index"

for i in len(range(numbers)):
for i in range(len(numbers)):
for num in numbers:
print(num)
print(i)
print(numbers[i])
"""
numbers = [12, 65, 33, 2]
for i in range(len(numbers)):
    print(numbers[i])


"""
A list of integers is provided to you below.
Use a for loop to print the index and value of each element
of the list using the enumerate function.

for i in len(range(numbers)):
for i in range(len(numbers)):
for num in numbers:
for i, num in enumerate(numbers):
print(num)
print(i)
print(numbers[i])
print(i, num)
"""
numbers = [1, 2, 3, 4]
for i, num in enumerate(numbers):
    print(i, num)


"""
A list of strings is provided to you below.
Print each element of the list using a for loop.

for i in range(len(names)):
for num in numbers:
for name in names:
print(num)
print(i)
print(name)
print(names[i])
"""
names = ["Alice", "Joe", "Bob"]
for name in names:
    print(name)


"""
A list of mixed data types is provided to you below.
Print each element of the list using a for loop.

for i in range(len(mix)):
for value in mix:
print(mix[i])
print(value)
"""
mix = ["Alice", 2, 3, 3.1416, "Joe"]
for value in mix:
    print(value)

