"""
Objective: In this exercise, students will practice using Python dictionaries 
by creating a simple inventory management system for a store. They will 
implement a system that allows adding, updating, and retrieving items, as 
well as checking stock levels and calculating the total value of the inventory.

Write a Python program that performs the following tasks:
1. Create an empty dictionary called inventory.
2. Implement the following functions:
	a. add_item(item_name, price, quantity): Adds a new item to the inventory or updates an existing one.
	b. add_quantity(item_name, quantity): Updates the quantity of an existing item.
	c. update_price(item_name, price): Updates the price of an existing item.
	d. get_item_details(item_name): Retrieves the price and quantity of a specific item.
	e. print_inventory(): Prints all items in the inventory with their details.
	f. calculate_total_value(): Calculates and prints the total value of the inventory.
	g. is_in_stock(item_name): Checks whether an item is in stock (quantity > 0).

If the program is written correctly, it should display:

Inventory:
Item: apple, Price: 5, Quantity: 50
Item: banana, Price: 1, Quantity: 100
Item: orange, Price: 3, Quantity: 70

Adding 20 apples to inventory
Changing the price of bananas to $2
Inventory:
Item: apple, Price: 5, Quantity: 70
Item: banana, Price: 2, Quantity: 100
Item: orange, Price: 3, Quantity: 70

Item: apple, Price: 5, Quantity: 70
Item: banana, Price: 2, Quantity: 100

Total Inventory Value: 760

Is 'banana' in stock? True
Is 'grape' in stock? False

"""

# 1: Create the dictionary to store inventory items

# 2a: Write a function to add an item. 
#         If the item exists, it will overwrite it.
def add_item(item_name, price, quantity):

# 2b: Write a function to add to the quantity of an existing item
def add_quantity(item_name, quantity):

# 2c: Write a function to update the price of an existing item
def update_price(item_name, new_price):

# 2d: Write a function to retrieve details of a specific item
def get_item_details(item_name):

# 2e: Write a function to print all items in the inventory
def print_inventory():

# 2f: Write a function to calculate the total value of the inventory
def calculate_total_value():

# 2g: Write a function to check if an item is in stock
def is_in_stock(item_name):
    
# Driver
add_item("Laptop", 1200, 5)
add_item("Mouse", 25, 50)
add_item("Keyboard", 70, 20)

# Get details of an item
print(get_item_details("Mouse"))

# Update the quantity of an item
update_quantity("Laptop", 3)

# Print all items in the inventory
print_inventory()

# Check if an item is in stock
print(is_in_stock("Laptop"))
print(is_in_stock("Monitor"))

# Calculate the total value of the inventory
calculate_total_value()
