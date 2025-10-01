# Function to calculate total price of an item
def calculate_total(price, quantity):
    return price * quantity

# Function that calls calculate_total
def checkout(item, price, quantity):
    total = calculate_total(price, quantity)  # function calls a function
    print(f"{quantity} x {item} @ ${price:.2f} each = ${total:.2f}")

# Main program
def main():
    checkout("Notebook", 2.50, 4)
    checkout("Pencil", 0.75, 10)
    checkout("Backpack", 25.00, 1)

main()
