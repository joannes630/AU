"""
Write a function named delete_from_phonebook(phonebook,
name). The function should accept a dictionary where names
are keys and phone numbers are values, along with a name to
remove.

If the given name exists in the dictionary, delete the
corresponding key/value pair and return True. Otherwise,
return False.
"""

def delete_from_phonebook(phonebook, name):
    if name in phonebook:
        phonebook.pop(name)
        return True
    else:
        return False
