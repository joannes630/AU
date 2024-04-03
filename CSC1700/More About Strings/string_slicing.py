def main():
    """
    Just like in list, you can use slicing on a string.
    The syntax is
        string[start : end]
    The "start" is the starting index.
    The "end" minus 1 is the ending index.

    The code below will "slice" the middle name out of the full name
    using string slicing and the start and end index.
    The indexes are:
    0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15
    P  a  t  t  y     L  y  n  n     S  m  i  t  h
    """
    name = "Patty Lynn Smith"
    middle = name[6:10]
    print(middle)

    """
    If you leave out the start index, it will start from the beginning.
    And if you leave out the end index, it will stop at the end.
    """
    first = name[:5]
    last = name[11:]
    print(first, last)

    """
    You can also use negative number to index to the string.
    With negative index, the position will start from the end of the string
    such that -1 is the last character, -2 is second from last, -3 is third
    from last, and so on.
    -5 -4 -3 -2 -1
     S  m  i  t  h
    Using the string, "Patty Lynn Smith", the index -5 will reference the 
    fifth character from last, such that
    last = name[-5:] will reference "Smith"
    """
    last = name[-5:]
    print(last)

main()
