'''
Dictionary:
    - To create an empty dictionary
        dict = {}
    - To create and initialize a dictionary
        dict = {
            "Chris": 5551111,
            "Katie": 5552222,
            "John":  5553333
        }
    - To add key/value pairs in the dictionary (Assuming key is a String and value is an integer)
        dict["Bob"] = 2244446666
    - To check if a key is in a dictionary
        if "Bob" in dict:
    - To check if a key is NOT in a dictionary
        if "Bob" not in dict:
    - To retrieve a value using a key
        dict["Bob"]         --> Could crash if "Bob" is not a key
        or
        dict.get("Bob")     --> Would not crash if "Bob" is not a key
    - To retrieve and delete an item in a dictionary
        phonenumber = dict.pop("Bob")
    - To retrieve and delete the last item in a dictionary
        phonenumber = dict.popitem()
    - To delete a key/value pair (item)
        del dict["Bob"]
    - Iterating a dictionary using keys
        for name in dict.keys():
            print(name, dict[name])
    - Iterating a dictionary using values
        for phonenumber in dict.values():
            print(phonenumber)
    - Iterating a dictionary using key/value pairs
        for name, phonenumber in dict.items():
            print(name, phonenumber)
    - Mixing data types in a dictionary

'''

# dict = {
#     "Chris": 5551111,
#     "Katie": 5552222,
#     "John": 5553333
# }
# print(dict)

dict = {}
dict["Chris"] = 5551111
dict["Katie"] = 5552222
dict["John"] = 5553333
# print(dict)

# if "Katie" in dict:
#     print(dict["Katie"])
#
# print(dict.get("Katie"))

# phonenumber = dict.pop("Katie")
# print(phonenumber)
# print(dict)

# phonenumber = dict.popitem()
# print(phonenumber)
# print(dict)

# del dict["Katie"]
# print(dict)

# for name in dict.keys():
#     print(name, dict[name])

# for phonenumber in dict.values():
#     print(phonenumber)

# for name, phonenumber in dict.items():
#     print(name, phonenumber)

test_scores = { 'Kayla' : [88, 92, 100],
                'Luis' : [95, 74, 81],
                'Sophie' : [72, 88, 91],
                'Ethan' : [70, 75, 78] }

for key, value in test_scores.items():
    sum, count = 0, 0
    for grade in value:
        sum += grade
        count += 1
    avg = sum / count
    print(f"{key}, {avg:.2f}")
