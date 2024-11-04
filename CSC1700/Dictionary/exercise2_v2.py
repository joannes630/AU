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

# 1. Initialize Inventory (global)
#    Create an empty dictionary named `inventory` that will store items as keys, with each key mapping to a tuple of `(price, quantity)`.

# Write the following functions.
# 2. Function 1: `add_item`  
#    The function accepts 3 arguments: the item name, price, an quantity.
#    Write a function that adds an item to the `inventory` dictionary:
#    - If the `item_name` already exists in the inventory, print a message that the item will be overwritten.
#    - Update or add the item with its `price` and `quantity` as a tuple in the dictionary.

#    Example Usage:
#    add_item("apple", 1.5, 10)  # Adds or updates "apple" in the inventory

# 3. Function 2: `add_quantity(item_name, quantity)`  
#    The function accepts 2 arguments: the item name and quantity.
#    Write a function that adds to the quantity of an existing item:
#    - If `item_name` exists, increase the quantity by the specified `quantity`.
#    - If the item does not exist, print an error message indicating that the item is not in the inventory.

#    Example Usage:
#    add_quantity("apple", 5)  # Increases the quantity of "apple" by 5

# 4. Function 3: `update_price(item_name, new_price)`  
#    The function accepts 2 arguments: the item name and new price.
#    Write a function that updates the price of an existing item:
#    - If `item_name` exists, update its price to `new_price`.
#    - If the item does not exist, print an error message indicating the item is not in the inventory.

#    Example Usage:
#    update_price("apple", 2.0)  # Updates the price of "apple" to 2.0

# 5. Function 4: `get_item_details(item_name)`  
#    The function accepts 1 argument: the item name.
#    Write a function that retrieves the details of a specific item:
#    - If `item_name` exists, print the item name, price, and quantity.
#    - If the item does not exist, print an error message indicating it was not found.

#    Example Usage:
#    get_item_details("apple")

# 6. Function 5: `print_inventory()`  
#    The function has no parameters.
#    Write a function that prints the details of all items in the inventory:
#    - Print each item’s name, price, and quantity.
#    - If the inventory is empty, print a message stating that the inventory is empty.

#    Example Usage:
#    print_inventory()

# 7. Function 6: `calculate_total_value()`  
#    The function has no parameters.
#    Write a function that calculates and prints the total value of all items in the inventory:
#    - For each item, multiply its price by its quantity, then sum all values.
#    - Print the total inventory value.

#    Example Usage:
#    calculate_total_value()

# 8. Function 7: `is_in_stock(item_name)`  
#    The function accepts 1 argument: the item name.
#    Write a function that checks if an item is in stock:
#    - Return `True` if the item exists in the inventory and its quantity is greater than zero.
#    - Return `False` otherwise.

#    Example Usage:
#    is_in_stock("apple")
