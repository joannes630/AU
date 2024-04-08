# This program calls the split method, using the
# '/' character as a separator.

def main():
    # Create a string with a date.
    date_string = '11/26/2020'

    '''
    Split the date. The argument in the split method is the delimiter
    used to split the string into elements. The elements will be stored in
    a list.
    '''
    date_list = date_string.split('/')
    
    '''
    This will make the list
    date_list = ['11', '26', '2020']
    '''

    # Display each piece of the date.
    print(f'Month: {date_list[0]}')
    print(f'Day: {date_list[1]}')
    print(f'Year: {date_list[2]}')

# Call the main function.
if __name__ == '__main__':
    main()
