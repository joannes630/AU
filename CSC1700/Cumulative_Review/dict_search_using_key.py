def main():
    # Dictionary
    dict = {'Ross': [1, 2, 3],
            'Joey': [4, 5, 6],
            'Chandler': [7, 8, 9]}

    # Direct way to search using a key
    name = input("Enter name to search: ")
    if name in dict:
        print("The value of the key is", dict[name])
    else:
        print(name, "was not found in the dictionary")

    # Searching using a key and get() method
    value = dict.get(name)
    if value != None:
        print("The value of the key is", value)
    else:
        print(name, "was not found in the dictionary")


main()
