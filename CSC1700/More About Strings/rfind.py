def main():
    '''
    Assume the string name is composed of first, middle, and last.
    '''
    name = "Walter E. Smithe"

    '''
    index =  0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15
    string = W  a  l  t  e  r     E  .     S  m  i  t  h  e
    '''
    # Get the first name
    idx = name.find(' ')    # This will return 6
    first = name[:idx]      # We are basically stating to slice from
                            # index 0, up to but not including index 6
    print(first)

    '''
    Now, we could not use the current value of idx anymore to get the 
    last name since there is a middle name. One solution is use the method
    rfind(), to start the search from the end (rear) of the string.
    '''
    idx = name.rfind(' ')
    last = name[idx+1:]
    print(last)

    # What about if the name is 'John Ronald Reuel Tolkien'?
    '''
    0  1  2  3  4  5  6  7  8  9  10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
    J  o  h  n     R  o  n  a  l  d     R  e  u  e  l     T  o  l  k  i  e  n 
    '''
main()

