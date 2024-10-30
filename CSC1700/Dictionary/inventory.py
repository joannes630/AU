"""
Objective: In this exercise, students will practice using Python dictionaries 
by creating a simple inventory management system for a store. They will 
implement a system that allows adding, updating, and retrieving items, as 
well as checking stock levels and calculating the total value of the inventory.

Problem Statement:

Write a Python program that performs the following tasks:

1. Create a dictionary to store items in the inventory, where the key is the 
   item name and the value is a tuple containing the price of the item and the 
   quantity in stock.
2. Add new items to the inventory.
3. Update the quantity of existing items.
4. Retrieve and display the details of a specific item.
5. Print all items in the inventory along with their prices and quantities.
6. Calculate the total value of the inventory (price multiplied by quantity 
   for all items).
7. Check if a specific item is in stock (quantity > 0).

Instructions:

1. Create an empty dictionary called inventory.
2. Implement the following functions:
	a. add_item(item_name, price, quantity): Adds a new item to the inventory or updates an existing one.
	b. update_quantity(item_name, quantity): Updates the quantity of an existing item.
	c. get_item_details(item_name): Retrieves the price and quantity of a specific item.
	d. print_inventory(): Prints all items in the inventory with their details.
	e. calculate_total_value(): Calculates and prints the total value of the inventory.
	f. is_in_stock(item_name): Checks whether an item is in stock (quantity > 0).

"""

# Step 1: Create the dictionary to store inventory items

# Step 2: Function to add or update an item in the inventory

# Step 3: Function to update the quantity of an item

# Step 4: Function to get details of a specific item

# Step 5: Function to print the entire inventory

# Step 6: Function to calculate the total value of the inventory

# Step 7: Function to check if an item is in stock

# Example usage
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
