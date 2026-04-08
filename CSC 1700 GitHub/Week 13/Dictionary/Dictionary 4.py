"""
4. Given a dictionary named phonebook, prompt the user to enter a name
and a phone number. If the name exists in the phonebook dictionary,
update the contact’s phone number, and display the updated dictionary.

Otherwise, display a message informing the user that the name is not in
the phonebook

print(phonebook)
phone = input("Enter phone number: ")
phonebook[name] = phone
name = input("Enter name to update: ")
else:
print(f"{name} is not in the phonebook")
if name in phonebook:
"""

phonebook = {"John Doe" : "224-111-1111",
             "Alice Cruz" : "224-222-2222",
             "Kyle Gonzalez" : "224-333-3333" }

name = input("Enter name to update: ")
if name in phonebook:
    phone = input("Enter phone number: ")
    phonebook[name] = phone
    print(phonebook)
else:
    print(f"{name} is not in the phonebook")

