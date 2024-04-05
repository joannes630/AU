def main():
    date = "4/5/2024"
    '''
    The method split() will 'tokenize' the string date using the delimiter
    '/'. This means the string date, will be literally split using the character '/'
    to divide it. The result will be stored in a list object.
    '''
    list = date.split('/')

    # After the string is split, the result is a list object
    month = list[0]
    day = list[1]
    year = list[2]

    print(f'The month is {month}')
    print(f'The day is {day}')
    print(f'The year is {year}')

main()
