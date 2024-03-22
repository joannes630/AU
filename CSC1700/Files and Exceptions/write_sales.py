# def main():
#     num_days = int(input('For how many days do you have sales? '))
#     sales_file = open('sales.txt', 'w')
#     for count in range(1, num_days + 1):
#         sales = float(input(f'Enter the sales for day #{count}: '))
#         sales_file.write(f'{sales:.2f}\n')
#
#     sales_file.close()
#
# main()

def main():
    outfile = open("sales.txt", "w")
    sales = float(input("Enter sales: "))
    while sales != -1:
        outfile.write(f"{sales:.2f}\n")
        sales = float(input("Enter sales: "))
    outfile.close()

main()
