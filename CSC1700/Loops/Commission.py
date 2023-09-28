# This code shows how to let user control how many
# times we go inside the while loop

keep_going = input("Calculate commission? (Enter y for yes): ")
while keep_going == "y":
    sales = float(input("Enter the amount of sales: "))
    comm_rate = float(input("enter the commission rate: "))
    commission = sales * comm_rate
    print(f"The commission is ${commission:.2f}")
    keep_going = input("Calculate commission? (Enter y for yes): ")
