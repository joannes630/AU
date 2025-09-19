
# Use input validation to validate the number entered
# is between 1 and 10 (inclusive)
num = int(input("Enter a number (1-10): "))
while not(1 <= num <= 10):
    print("Incorrect, number should be between 1 and 10")
    num = int(input("Enter a number (1-10): "))
print("Number entered is", num)

# Another example
# Keep asking until the correct password is entered
password = input("Enter the password: ")
while password != "python123":
    print("Incorrect password, try again.")
    password = input("Enter the password: ")
print("Access granted!")

# Yet another example
# Only allow positive numbers
num = int(input("Enter a positive number: "))
while num <= 0:
    print("That’s not positive!")
    num = int(input("Enter a positive number: "))
print("You entered:", num)