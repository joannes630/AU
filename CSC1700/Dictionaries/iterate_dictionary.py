'''
Iterate through the dictionary to print all the key/value pairs.
'''

def main():
    phonebook = {'John':'847-234-5678', 'Walter':'224-123-5678',
                 'Peter':'630-456-7890'}
    for key, value in phonebook.items():
        print(key, value)

main()
