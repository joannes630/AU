"""
Write a function named find_name_by_phone(phonebook, phone).
The function should accept a dictionary where names are keys
and phone numbers are values, along with a phone number to
search for.

The function should iterate through the dictionary to
determine whether the given phone number exists. If a match
is found, return the corresponding name. If the phone number
does not exist in the phonebook, return None.
"""

def find_name_by_phone(phonebook, search):
    for name, phone in phonebook.items():
        if search == phone:
            return name
    return None

