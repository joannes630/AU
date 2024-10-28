# Creating a dictionary with key-value pairs
phonebook = {
    "Chris": "555-1111",
    "Katie": "555-2222",
    "John": "555-3333"
}
print(phonebook)

# Using the `in` operator
if "Alice" in phonebook:
    print(phonebook["Alice"])
else:
    print("Alice is not in the dictionary")

# Adding an item in a dictionary
phonebook["Bob"] = "555-4444"
print(phonebook)

# Deleting an item in a dictionary
del phonebook["Bob"]
print(phonebook)

# Getting the number of items in the phonebook
print(len(phonebook))

# Iterating through a dictionary
for name in phonebook:
    print(name, phonebook[name])

# Another way to iterate using keys
for key in phonebook.keys():
    print(key)

# Another way to iterate using values
for value in phonebook.values():
    print(value)

# Another way to iterate using items
for key, value in phonebook.items():
    print(key, value)

# Using values method
phones = phonebook.values()
for phone in phones:
    print(phone)
    
# Using the pop method
phone = phonebook.pop("John", None)
print(phone)

# Using the popitem method
phone = phonebook.popitem()
print(phone)

