"""
A school supply store needs a simple program to calculate and display the 
total price of items purchased by a customer. Each item has a name, a 
price, and a quantity. The program should calculate the total cost by multiplying 
the price of an item by its quantity and then print a receipt-style line showing 
the item name, unit price, quantity, and total cost. 
"""

# Function to compute and print the total price
def checkout(item, price, quantity):
    total = price * quantity
    print(f"{quantity} x {item} ${price:.2f} each = ${total:.2f}")

# Main program
def main():
    checkout("Notebook", 2.50, 4)
    checkout("Pencil", 0.75, 10)
    checkout("Backpack", 25.00, 1)

main()
