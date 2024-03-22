def main():
    sales_file = open('sales.txt', 'r')
    total = 0
    count = 0
    for line in sales_file:
        amount = float(line)
        total += amount
        count += 1
    average = total / count
    print(f"The average of the number is {average}")
    sales_file.close()

main()

# def main():
#     sales_file = open("sales.txt", "r")
#     amount = sales_file.readline()
#     while amount != "":
#         amount = float(amount)
#         print(f'{amount:.2f}')
#         amount = sales_file.readline()
#     sales_file.close()
#
# main()

# def main():
#     sales_file = open('sales.txt', 'r')
#     total = 0
#     for line in sales_file:
#         amount = float(line)
#         total += amount
#     sales_file.close()
#     print(f"The total is {total}")
#
# def main():
#     sales_file = open('sales.txt', 'r')
#     for line in sales_file:
#         amount = float(line)
#         if amount == 100:
#             print(f"The amount is in the file")
#
#     sales_file.close()
#
# main()

