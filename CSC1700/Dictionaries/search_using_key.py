'''
A dictionary is created below. The name is the key.
The value is composed of two parts: The first part is the phone number,
the second part is the grade.
Perform a search using the name (key).
Print the value if the key is found.
If it is not found, print 'None'.
'''
def main():
    dict = {'Ross': ['123-4567', 89.9],
            'Joey': ['234-5678', 75.5],
            'Chandler': ['345-6789', 80.2]}
    name = input('Enter name to search: ')

    value = dict.get(name)
    print(value)

main()
