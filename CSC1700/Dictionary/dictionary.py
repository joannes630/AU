"""
    Dictionary methods:
        dict[key] = value   --> add/update a key/value pair
        dict[key]           --> to retrieve a value in a dictionary
        dict.get(key)       --> to retrieve a value in a dictionary (returns None if key not found)
        dict.pop(key)       --> to retrieve and delete an item in a dictionary
        dict.popitem()      --> to retrieve and delete the last item in a dictionary
        dict.keys()         --> retrieves a list of keys
        dict.values()       --> retrieves a list of values
        dict.items()        --> retrieves a list of key/value pairs

    del dict[key]       --> deletes an item in a dictionary
"""

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
