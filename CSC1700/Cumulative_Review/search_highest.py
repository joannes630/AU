def main():
    # Searching for the highest in an unsorted list
    my_list = [9, 4, 7, 20, 2, 0, 12]

    highest = 0
    for x in my_list:
        if x > highest:
            highest = x
    print(highest)

main()
