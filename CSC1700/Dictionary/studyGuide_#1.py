# Dictionary Sum:
#    Write a function that accepts one argument which is a dictionary. The
#    keys in the dictionary are names and the values in the dictionary are
#    integers. The function will calculate the total of all the values in
#    the dictionary and return the total.

def total(dict):
    total = 0
    for values in dict.values():
        total += values
    return total

dict = {"John": 1, "Peter": 2, "Ed": 3}
total = total(dict)
print(total)


