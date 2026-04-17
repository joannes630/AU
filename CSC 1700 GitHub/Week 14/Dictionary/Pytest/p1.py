"""
Write a function named create_dictionary() that builds a
phonebook using a dictionary. In this dictionary, each name
should be used as the key and the corresponding phone number
as the value. 

The function should prompt the user to enter three names and
their associated phone numbers, store these key/value pairs
in the dictionary, and then return the completed
dictionary.
"""

def create_dictionary():
    phonebook = {}
    for _ in range(3):
        name = input("Enter name: ")
        phone = input("Enter phone: ")
        phonebook[name] = phone
    return phonebook
