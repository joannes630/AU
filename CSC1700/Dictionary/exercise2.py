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

"""
    Dictionary methods:
        dict[key] = value   --> add/update a key/value pair
        dict[key]           --> to retrieve a value in a dictionary
        dict.get(key)       --> to retrieve a value in a dictionary (returns None if key not found)
        dict.pop(key)       --> to retrieve and delete an item in a dictionary
        dict.popitem()      --> to retrieve and delete the last item in a dictionary
        dict.keys()         --> retrieves a list of keys
        dict.value()        --> retrieves a list of values
        dict.items()        --> retrieves a list of key/value pairs

    del dict[key]       --> deletes an item in a dictionary
"""

# Initialize an empty dictionary for the inventory
inventory = {}

# Function to add an item. If if the item exists, it will overwrite it.
def add_item(item_name, price, quantity):
    if item_name in inventory:
        print(f"Item {item_name} will be overwritten.")
    inventory[item_name] = price, quantity

# Function to add to the quantity of an existing item
def add_quantity(item_name, quantity):
    if item_name in inventory:
        price, current_quantity = inventory[item_name]
        inventory[item_name] = (price, current_quantity + quantity)
    else:
        print(f"Item '{item_name}' does not exist in the inventory.")

# Function to update the price of an existing item
def update_price(item_name, new_price):
    if item_name in inventory:
        price, quantity = inventory[item_name]
        inventory[item_name] = (new_price, quantity)
    else:
        print(f"Item '{item_name}' does not exist in the inventory.")

# Function to retrieve details of a specific item
def get_item_details(item_name):
    if item_name in inventory:
        price, quantity = inventory[item_name]
        print(f"Item: {item_name}, Price: {price}, Quantity: {quantity}")
    else:
        print(f"Item '{item_name}' is not found in the inventory.")

# Function to print all items in the inventory
def print_inventory():
    print("Inventory:")
    for item_name, (price, quantity) in inventory.items():
        print(f"Item: {item_name}, Price: {price}, Quantity: {quantity}")

# Function to calculate the total value of the inventory
def calculate_total_value():
    total_value = 0
    for item_name, (price, quantity) in inventory.items():
        total_value += price * quantity
    print(f"Total Inventory Value: {total_value}")

# Function to check if an item is in stock
def is_in_stock(item_name):
    if item_name not in inventory:
        quantity = 0
    else:
        price, quantity = inventory[item_name]
        
    if quantity == 0:
        return False
    else:
        return True

# Driver
add_item("apple", 5, 50)
add_item("banana", 1, 100)
add_item("orange", 3, 70)
print_inventory()
print()

print("Adding 20 apples to inventory")
add_quantity("apple", 20)
print("Changing the price of bananas to $2")
update_price("banana", 2)
print_inventory()
print()

get_item_details("apple")
get_item_details("banana")
print()

calculate_total_value()
print()

print("Is 'banana' in stock?", is_in_stock("banana"))
print("Is 'grape' in stock?", is_in_stock("grape"))
