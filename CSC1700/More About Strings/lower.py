def main():
    choice = get_choice()
    if choice == True:
        print('The choice is True')
    else:
        print('The choice is False')

def get_choice():
    '''
    The code below does an input validation for a user to enter 'y' or 'n'.
    But the user might enter 'Y', 'N', 'Yes', or 'No', which are all valid
    response too if you think about it. So we are making our program a bit more
    robust to accept those answers from users who do not follow strict directions.

    We transform the user input to all lowercase characters to lessen the
    permutations of all possible user inputs.
    '''
    choice = input('Do you agree? (y/n): ')
    '''
    The logic in the while statement below is that all possible correct inputs
    should not match. If all possible correct values does not match, it means the user
    did not enter one of the expected responses, and we ask them again. If at least one
    of these is matches (means its True), then it does not go in the while loop.
    '''
    while choice.lower() != 'y' and \
            choice.lower() != 'n' and \
            choice.lower() != 'yes' and \
            choice.lower() != 'no':
        print('Please enter y/n...')
        choice = input('Do you agree? (y/n): ')

    '''
    Instead of returning the choice variable, its better to return a generic
    boolean value so the calling function can just check for True or False, instead of 
    'y', 'yes', 'n' or 'no'.
    '''
    if choice.lower() == 'y' or choice.lower() == 'yes':
        return True
    else:
        return False

main()
