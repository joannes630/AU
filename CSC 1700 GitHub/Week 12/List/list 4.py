"""
1. Print the last two elements of the list below
using negative indexing.

print(numbers[1])
print(numbers[2])
print(numbers[-1])
print(numbers[-2])
print(numbers[0])
"""
numbers = [1, 2, 3]


"""
2. Use a single statement to repeat the elements of the list three times 
and store the result in a new variable. Finally, print the new list.
Your output should display a list where the original elements appear 
three times in sequence.

a = numbers + 3
a = numbers * 3
print(numbers)
print(a)
a = numbers * 2
"""
numbers = [1, 2, 3]


"""
3. Use a single statement to concatenate the two lists below
and store the result in a new list. Print the new list.
Your output should display a list where the two lists are
combined.

a = numbers + 3
a = numbers * 3
print(c)
print(numbers)
print(a)
a = numbers * 2
c = a + b

"""
a = [11, 52, 73]
b = [34, 22, 56]

"""
4. Use a single statement to extract a portion of a list  
and store the result in a new list. Print the new list.  
The new list should contain elements starting from the  
2nd element up to the 4th element (inclusive) of the original list.

a = numbers[1:4]
a = numbers[:2]
a = numbers[2:]
print(numbers)
print(a)
a = numbers[0:3]
a = numbers[1:3]
"""
numbers = [10, 20, 30, 40, 50]


"""
5. Use a single statement to extract a portion of a list  
and store the result in a new list. Print the new list.  
The new list should contain the first two elements of the original list.

a = numbers[:2]
a = numbers[2:]
a = numbers[1:3]
print(numbers)
print(a)
a = numbers[0:3]
a = numbers[3:]
"""
numbers = [10, 20, 30, 40, 50]


"""
6. Use a single statement to extract a portion of a list  
and store the result in a new list. Print the new list.  
The new list should contain the last three elements of the original list.

a = numbers[-3:]
a = numbers[:3]
a = numbers[2:4]
print(numbers)
print(a)
a = numbers[1:4]
a = numbers[3:]

"""
numbers = [10, 20, 30, 40, 50]

"""
7. Create an empty list and use the append() method to add elements to it.  
Add the values 10, 20, and 30 to the list in that order.  
Finally, print the list.

numbers = []
numbers.append(10)
numbers = [10, 20, 30]
numbers.append([10, 20, 30])
numbers.append(30)
print(numbers)
numbers.append(20)
"""

"""
8. Use a for loop with append to create a copy of a list and store the result in
a new list. Start with an empty list, then copy each element from the original 
list into the new list. Finally, print the new list. 
The new list should contain the same elements as the original list.

a = []
for x in numbers:
a = numbers
a = numbers.copy()
for i in range(len(numbers)):
a.append(x)
a = numbers[i]
print(a)
"""
numbers = [10, 20, 30, 40]

