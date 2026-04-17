"""
Write a function named display_phonebook(phonebook). The
function should accept a dictionary where names are keys and
phone numbers are values.

The function should iterate through the dictionary and
display each key/value pair in a clear format (e.g., name
and corresponding phone number).

Sample Output:
Alice 111-1111
Bob 222-2222
Charlie 333-3333
"""
def display_phonebook(phonebook):
    for name, phone in phonebook.items():
        print(name, phone)

