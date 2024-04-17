def list_search(my_list2, search2):
    found = False
    idx = 0
    while idx < len(my_list2) and not found:
        if search2 == my_list2[idx]:
            print("Found")
            found = True
        idx += 1
    return found

def main():
    # Searching for an element in an unsorted list
    my_list = [9, 4, 7, 3, 2, 0, 12]

    print("The list is", my_list)
    search = int(input("Enter number to search: "))
    found = list_search(my_list, search)

    if not found:
        print("The number was not found")

main()
