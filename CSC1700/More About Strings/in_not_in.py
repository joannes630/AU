def main():
    names = 'Walter Jesse Mike Hank Gustavo'

    '''
    Similar to lists, we can use the 'in' and 'not in' operators can be used with
    strings to tests if a substring is in the string.
    '''
    search = input('Enter name to search: ')
    if search in names:
        print(f'{search} is in names')
    else:
        print(f'{search} is not in names')

    '''
    Or you can reverse the logic with the not operator.
    '''
    search = input('Enter name to search: ')
    if search not in names:
        print(f'{search} is not in names')
    else:
        print(f'{search} is in names')

main()

