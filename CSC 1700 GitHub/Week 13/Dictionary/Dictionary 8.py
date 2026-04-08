"""
8. Given a dictionary named phonebook, write a program that iterates
through the phonebook and prints all names and phone numbers (keys and
values).

print(name, phone)
for name, phone in phonebook.items():
"""

phonebook = {"John Doe" : "224-111-1111",
             "Alice Cruz" : "224-222-2222",
             "Kyle Gonzalez" : "224-333-3333" }

for name, phone in phonebook.items():
    print(name, phone)

