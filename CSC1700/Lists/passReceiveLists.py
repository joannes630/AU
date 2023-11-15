def main():
    list = create_list()
    total = running_total(list)
    print(total)

def create_list():
    list = ["1", "2", "3"]
    return list

def running_total(list):
    total = 0
    for i in range(len(list)):
        total += int(list[i])
    return total

main()