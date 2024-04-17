'''
Fix the exception in the Python program below by using the 'in' operator
before attempting to print using a key.
'''

def main():
    phonebook = {'John':'847-234-5678', 'Walter':'224-123-5678',
                 'Peter':'630-456-7890'}
    if 'Ed' in phonebook:
        print(phonebook['Ed'])
    else:
        print('Ed is not in the phonebook')

main()
