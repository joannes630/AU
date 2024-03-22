def main():
    infile = open('file.txt', 'r')

    employee_name = infile.readline().strip()
    employee_id = infile.readline().strip()
    pay_rate = infile.readline().strip()

    infile.close()

    print(employee_name)
    print(employee_id)
    print(pay_rate)

main()

