def main():
    # Searching for an element in an unsorted list
    my_list = [9, 4, 7, 3, 2, 0, 12]
    
    print("The list is", my_list)
    search = int(input("Enter number to search: "))
    found = False
    idx = 0
    while idx < len(my_list) and not found:
        if search == my_list[idx]:
            print("Found")
            found = True
        idx += 1
    
    if not found:
        print("The number was not found")
    
main()
