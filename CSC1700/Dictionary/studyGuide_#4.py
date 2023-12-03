# Dictionary Values Search:
# Write a function that accepts two arguments which is a dictionary and a
# string (key). The key in the dictionary is a name (string) and the values
# are phone numbers (also a string). The function will search for the key
# in the dictionary. If the key is found it will print the phone number,
# otherwise, it will print info that the person was not found.

def search(dict, name):
    if name in dict:
        phoneNumber = dict[name]
        print(f"The phone number of {name} is {phoneNumber}")
    else:
        print(f"{name} was not found")

dict = {"John": "544-2345", "Peter": "432-4434", "Ed": "435-4094"}
search(dict, "Peter")


