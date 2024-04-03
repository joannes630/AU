def main():
    name = "Juan"

    """
    This code will print all characters of the string "Juan"
    character by character. The variable ch is assigned
    the character for each iteration of the loop.
    This does not use an index.
    """
    for ch in name:
        print(ch)

    """
    This code uses the index to access specific positions 
    within the string. The len function can be used for any
    sequence in Python to get its size.
    len(name) is 4
    range(4) will return [0, 1, 2, 3], which are the indexes
    to the string name.
    """
    for i in range(len(name)):
        print(name[i])

    """
    Strings are immutable, which means that once it's created,
    it cannot be changed.
    """
    try:
        name[0] = "X"
    except TypeError as err:
        print(f"Error: {err}")

    """
    As we have seen before, the plus operator (+) can be used to
    concatenate strings. The code below will concatenate first,
    a space character, and last to form the full name.
    """
    first = "John"
    last = "Reyes"
    print(first + " " + last)

    """
    The code below shows that when you re-use a string variable name,
    it really is not "modifying" the string. It is in fact creating a new
    instance of a string, with the same name.
    """
    name = "John"
    print(name)
    name = "Peter"
    print(name)

main()
