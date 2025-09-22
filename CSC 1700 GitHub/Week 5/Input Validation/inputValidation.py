# Ask the user to enter a number between 1 and 10.
# Keep asking until they give a valid number.

num = int(input("Enter a number between 1 and 10: "))
while not (1 <= num <= 10):
    num = int(input("Invalid. Enter a number between 1 and 10: "))
print("You entered:", num)