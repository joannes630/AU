# Find a number:
#    Write a function that accepts one argument which is a list of integers.
#    In the function, it will ask the user to input a number (you don't need
#    to do any exception handling). The function will search for the number
#    in the list. If the number is found, it will return True, otherwise,
#    it will return False. You are not allowed to use the "in" operator.
#    You have to loop through the list, searching for the number.
#    Ensure your function is efficient, meaning, once it finds the number,
#    it exits the loop and avoids unnecessary looping.

def find(list):
    number = int(input("Enter a number: "))
    i = 0
    found = False
    while i < len(list) and not found:
        if number == list[i]:
            found = True
        i += 1
    return found

list = [1, 2, 3, 4]
print(f"The list is {list}")
value = find(list)
print(f"The number is in the list: {value}")
