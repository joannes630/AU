'''
Add the following items to the dictionary phonebook and display the dictionary
'Joe'  '847-890-1234'
'Chris' '630-678-9012'
'''

def main():
    phonebook = {'John':'847-234-5678', 'Walter':'224-123-5678',
                 'Peter':'630-456-7890'}
    phonebook['Joe'] = '847-890-1234'
    phonebook['Chris'] = '630-678-9012'
    print(phonebook)

main()
