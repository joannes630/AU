"""
A school supply store needs a simple program to calculate and display the 
total price of items purchased by a customer. Each item has a 
    a) name
    b) price
    c) quantity
The program should calculate the total cost by multiplying 
the price of an item by its quantity and then print a receipt-style line showing 
the item name, unit price, quantity, and total cost. 

An example output is:
4 x Notebook $2.50 each = $10.00                                                                                                
10 x Pencil $0.75 each = $7.50                                                                                                  
1 x Backpack $25.00 each = $25.00 
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
