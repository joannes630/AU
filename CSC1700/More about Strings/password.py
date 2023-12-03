# Write a program to check a user's password.
# The password should have the following attributes:
# •	Length is at least 8 characters
# •	At least one uppercase
# •	At least one number
# •	At least one special character

def main():
    upperOk = False
    numberOk = False
    specialOk = False
    password = ("Passw12!")
    if len(password) < 8:
        print("The length should be at least 8 characters")
    else:
        for ch in password:
            if ch.isupper():
                upperOk = True
            if ch.isdigit():
                numberOk = True
            if not ch.isalnum():
                specialOk = True

        if upperOk and numberOk and specialOk:
            print("Good password")
        else:
            print("Bad password")

main()