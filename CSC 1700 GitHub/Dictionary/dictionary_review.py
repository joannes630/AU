"""
    Dictionary methods:
        dict[key] = value   --> add/update a key/value pair
        dict[key]           --> to retrieve a value in a dictionary
        dict.get(key)       --> to retrieve a value in a dictionary (returns None if key not found)
        dict.pop(key)       --> to retrieve and delete an item in a dictionary
        dict.popitem()      --> to retrieve and delete the last item in a dictionary
        dict.keys()         --> retrieves a list of keys
        dict.values()       --> retrieves a list of values
        dict.items()        --> retrieves a list of key/value pairs

    del dict[key]       --> deletes an item in a dictionary
"""

"""
1. Write a function called `findMaxValue` that accepts a dictionary as its 
parameter. Each key in the dictionary is a string representing a category, 
and each value is a list of positive integers. The function should return the 
maximum integer found across all lists in the dictionary. You are not allowed 
to use the built-in `max` function.
"""

dict = {"Joe": [1, 2, 3], "Kevin": [10, 7, 8]}

def findMaxValue(dict):
    max = 0
    for key in dict:
        list = dict[key]
        for n in list:
            if n > max:
                max = n
    return max
    
print(findMaxValue(dict))

            
