"""
5. Given a dictionary named phonebook, write a program that prompts the
user to enter a name.  If the name exists in the phonebook dictionary,
remove the contact using the name as the key, and display the updated
dictionary.

Otherwise, display a message informing the user that the name is not in
the phonebook
"""

phonebook = {"John Doe" : "224-111-1111",
             "Alice Cruz" : "224-222-2222",
             "Kyle Gonzalez" : "224-333-3333" }

name = input("Enter name to delete: ")
if name in phonebook:
    phonebook.pop(name)
    print(phonebook)
else:
    print(f"{name} is not in the phonebook")

