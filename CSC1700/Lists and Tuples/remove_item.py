def main():
    my_list = ["Walter", "Jesse", "Saul", "Mike"]
    search = input("Enter name: ")
    if search in my_list:
        my_list.remove(search)
    else:
        print(f"{search} is not in in the list")
    print(my_list)

main()

