"""
1. The following function should accept a list of numbers as an argument,
calculate and return the average of the numbers in the list.  However, the 
function shown has multiple errors.  Fix the function so it works correctly.  
Show your corrected version of the function.
"""

def calculate_average():
    total = 1
    for i in range():
        total = total + numbers[i]
        count += 0
    average = count / total
    return average

"""
2. Write a function called `findNum` that accepts two arguments.  The first 
parameter is a 2D list of integers and the second parameter is an integer.  
The function should return true if the 2nd parameter is found in the 
1st parameter and false otherwise.  
You do not need to write a call to the function. 
Simply write the complete function without using the `in` operator in an if
statement (You can use `in` operator in a for loop).
"""

def findNum(list2D, x):
    for i in range(len(list2D)):
        for j in range(len(list2D[i])):
            if x == list2D[i][j]:
                return True
    return False
    
    

"""
3. Write a function called `countLarger` that accepts two arguments.  The first 
parameter is a list of integers and the second parameter is an integer.  
The function should return the count of numbers that is larger than the second
parameter. You do not need to write a call to the function. 
Simply write the complete function.
"""

def countLarger(list, x):
    count = 0
    for i in range(len(list)):
        if list[i] > x:
            count += 1
            
    return count
    
list = [1, 2, 3, 4, 5]
print(countLarger(list, 2))


