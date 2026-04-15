"""
Write a function named update_phonebook(phonebook, name,
phone). The function should accept a dictionary where names
are keys and phone numbers are values, along with a name and
a new phone number.

If the given name exists in the dictionary, update its
associated phone number and return True. Otherwise, return
False. 
"""

def update_phonebook(phonebook, name, phone):
    if name in phonebook:
        phonebook[name] = phone
        return True
    else:
        return False
