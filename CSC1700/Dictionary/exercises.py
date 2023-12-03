def main():
    #1
    phonebook = {"John": 1234567,
                 "Mary": 2345678,
                 "Kevin": 3456789}

    #2
    if "Mary" in phonebook:
        number = phonebook["Mary"]
        print(number)
    else:
        print("Mary not in phonebook")

    #3
    if "Joe" in phonebook:
        number = phonebook["Joe"]
        print(number)
    else:
        print("Joe not in phonebook")

    #4
    phonebook["Mary"] = 5551234
    print(phonebook)

    #5
    phonebook["Tony"] = 9992345
    print(phonebook)

    #6
    if "Kevin" in phonebook:
        del phonebook["Kevin"]
    else:
        print("Kevin is not in the phonebook")
    print(phonebook)

    #7
    for item in phonebook.items():
        print(item)

    #8
    number = phonebook.pop("John", None)
    print(f"John's number is {number}")
    print(phonebook)

    #9
    number = phonebook.popitem()
    print(f"The number popped was {number[0]}'s number {number[1]}")
    print(phonebook)

main()