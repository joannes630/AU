"""
Create a function named find_phonenumber(phonebook, name).
The function should accept a phonebook dictionary, where
names are used as keys and phone numbers as values, along
with a name to search for.

The function should check whether the given name exists in
the dictionary. If the name is found, return the
corresponding phone number. Otherwise, return None.
"""

def find_phonenumber(phonebook, name):
    if name in phonebook:
        return phonebook[name]
    else:
        return None


