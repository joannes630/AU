"""
You can access a list via it's index
"""
list = [4, 191, 7, 2]
print(list[0])
print(list[1])
print(list[2])
print(list[3])

"""
A list of integers
You can interate through all the values in a list using
a for loop. This way is called iterate by values.
This is the most pythonic way to iterate through a list
"""
list = [34, 65, 67, 33]
for num in list:
    print(num)

"""
Another way to iterate through a list is
iterate by index
"""
list = [12, 65, 33, 2]
for i in range(len(list)):
    print(list[i])

"""
Another way to iterate through a list is to use the
enumerate function
"""
list = [1, 2, 3, 4]
for i, val in enumerate(list):
    print(i, val)

"""
A list of strings
"""
names = ["Alice", "Joe", "Bob"]
for name in names:
    print(name)

"""
You can mix different data types in a list
"""
mix = ["Alice", 2, 3, 3.1416, "Joe"]
for value in mix:
    print(value)

