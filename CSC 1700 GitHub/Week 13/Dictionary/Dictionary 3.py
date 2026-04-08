"""
3. Given a dictionary named phonebook, write a program that prompts the
user to enter a name and a phone number. Then add this new entry to an
existing phonebook dictionary, and display the updated dictionary.

phonebook[name] = phone
phone = input("Enter phone number: ")
print(phonebook)
name = input("Enter name to add: ")
"""

phonebook = {"John Doe" : "224-111-1111",
             "Alice Cruz" : "224-222-2222",
             "Kyle Gonzalez" : "224-333-3333" }

name = input("Enter name to add: ")
phone = input("Enter phone number: ")
phonebook[name] = phone
print(phonebook)

