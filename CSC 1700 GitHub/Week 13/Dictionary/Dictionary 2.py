"""
2. Given a dictionary named phonebook, write a program that prompts the
user to enter a name. The program should then display the corresponding
phone number. 

If the name is not found in the dictionary, display an appropriate
message informing the user.

print(phonebook[name])
if name in phonebook:
print(f"{name} is not in the phonebook")
name = input("Enter name to search: ")
else:
"""

phonebook = {"John Doe" : "224-111-1111",
             "Alice Cruz" : "224-222-2222",
             "Kyle Gonzalez" : "224-333-3333" }

name = input("Enter name to search: ")
if name in phonebook:
    print(phonebook[name])
else:
    print(f"{name} is not in the phonebook")
