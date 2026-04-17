
def is_valid_password(passwd):
    has_lower = False
    has_upper = False
    has_digit = False
    has_special = False

    for ch in passwd:
        if ch.islower():
            has_lower = True
        elif ch.isupper():
            has_upper = True
        elif ch.isdigit():
            has_digit = True
        elif not ch.isalnum():
            has_special = True

    if len(passwd) >= 8 and has_lower and has_upper and has_digit and has_special:
        return True
    else:
        return False

passwd = input("Enter a password: ")
result = is_valid_password(passwd)
if result:
    print(f"{passwd} is good")
else:
    print(f"{passwd} is not good")

