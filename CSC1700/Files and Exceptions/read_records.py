# Print all employee data
# def main():
#     file = open('employees.txt', 'r')
#     for employee_name in file:
#         name = employee_name.strip()
#         rate = file.readline().strip()
#         hours = float(file.readline().strip())
#         print(f"{name}\n{rate}\n{hours}")
#     file.close()
#
# main()

def main():
    file = open('employees.txt', 'r')
    highest = 0
    for name in file:
        name = name.strip()
        rate = file.readline().strip()
        hours = float(file.readline().strip())
        if hours > highest:
            highest_name = name
            highest_rate = rate
            highest = hours
        # print(f"{name}\n{rate}\n{hours}")
    print(f"The employee with highest hours is:")
    print(f"{highest_name}\n{highest_rate}\n{highest_rate}")
    file.close()

main()

# def main():
#     infile = open("employee.txt")
#     name = infile.readline().strip()
#     while name != "":
#         id = infile.readline().strip()
#         dept = infile.readline().strip()
#         print(name)
#         print(id)
#         print(dept)
#         name = infile.readline().strip()
#
#     infile.close()
#
# main()