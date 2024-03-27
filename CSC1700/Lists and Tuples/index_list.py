]def main():
    my_list = ["Walter", "Jesse", "Saul", "Mike"]
    search = input("Enter name: ")
    if search in my_list:
        index = my_list.index(search)
        my_list[index] = "Gustavo"
    else:
        print(f"{search} is not in the list")
    print(my_list)
    
# Call the main function.
if __name__ == '__main__':
    main()
