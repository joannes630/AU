def main():
    name = "Walter Smithe"

    '''
    index =  0  1  2  3  4  5  6  7  8  9  10 11 12
    string = W  a  l  t  e  r     S  m  i  t  h  e
    '''
    # Get the first name
    idx = name.find(' ')    # This will return 6
    first = name[:idx]      # We are basically stating to slice from
                            # index 0, up to but not including index 6
    print(first)
    
    '''
    idx is still 6. We will slice the string name from index 6+1 = 7 
    all the way to the end. We need to add 1 to the variable idx since we want
    to start at the character position after the space.
    '''
    last = name[idx+1:]     
    print(last)

main()

