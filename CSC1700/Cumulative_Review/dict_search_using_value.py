def main():
    # Dictionary
    dict = {'Ross': [1, 2, 3],
            'Joey': [4, 5, 6],
            'Chandler': [7, 8, 9]}

    # Search using value in a dictionary
    search = int(input("Enter number to search: "))
    found = False
    for key, value in dict.items():
        for x in value:
            if search == x:
                print("The number is found in key", key)
                found = True

    if not found:
        print("The number was not found")

main()
