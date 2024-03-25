def main():
    numbers = get_values()

    print('The numbers in the list are:')
    print(numbers)

def get_values():
    values = []    
    values.append(3)
    values.append(7)
    values.append(2)
    return values

if __name__ == '__main__':
    main()
