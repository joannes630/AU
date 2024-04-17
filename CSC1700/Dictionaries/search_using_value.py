'''
A dictionary is created below. The name is the key.
The value is composed of two parts: The first part is the phone number,
the second part is the grade.
Perform a search using the phone number, which is a part of the value.
Print the key if the first instance of the phone number is found.
If it is not found, print 'None'.
Make your search efficient.
'''
def main():
    dict = {'Ross': ['123-4567', 89.9],
            'Joey': ['234-5678', 75.5],
            'Chandler': ['345-6789', 80.2]}
    phone = input('Enter phone number to search: ')
    found = False
    for key, value in dict.items():
        if phone == value[0]:
            print(key)
            found = True
            break
    if not found:
        print('None')

main()
