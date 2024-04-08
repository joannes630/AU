def valid_password(password):
    # Set the Boolean variables to false.
    correct_length = False
    has_uppercase = False
    has_lowercase = False
    has_digit = False

    # Begin the validation. Start by testing the
    # password's length.
    if len(password) >= 7:
        correct_length = True

        # Test each character and set the
        # appropriate flag when a required
        # character is found.
        for ch in password:
            if ch.isupper():
                has_uppercase = True
            if ch.islower():
                has_lowercase = True
            if ch.isdigit():
                has_digit = True

    # Determine whether all of the requirements
    # are met. If they are, set is_valid to true.
    # Otherwise, set is_valid to false.
    if correct_length and has_uppercase and \
        has_lowercase and has_digit:
        is_valid = True
    else:
        is_valid = False

    # Return the is_valid variable.
    return is_valid

def main():
    password = input('Enter password: ')
    while not valid_password(password):
        print('Password is not valid, enter another')
        password = input('Enter password: ')
    print(f'Password {password} is valid')

main()
