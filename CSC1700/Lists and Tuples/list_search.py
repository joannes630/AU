def list_search(list, search):
    idx = 0
    found = False
    while idx < len(list) and not found:
        if search == list[idx]:
            found = True
        idx += 1
    return found

def main():
    my_list = [6, 3, 7, 2, 0]
    search = int(input("Enter item to search: "))
    result = list_search(my_list, search)
    if result:
        print(f"Item {search} is in the list")
    else:
        print(f"Item {search} is not in the list")

main()
