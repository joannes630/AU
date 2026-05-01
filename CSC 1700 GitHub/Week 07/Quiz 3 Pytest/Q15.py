"""
Restaurant Bill with Tax

Use a sentinel controlled while loop to ask the user to
continuously enter item's prices until the user enters -1.
Compute the subtotal of the prices entered.  After the user
enters -1, calculate 8% tax of the subtotal, and compute the
final total amount (subtotal + tax)

Display the subtotal, tax amount, and final total.
Round all monetary values to two decimal places.
"""

subtotal = 0
while True:
    price = float(input("Enter price: "))
    if price == -1:
        break
    subtotal += price
tax = subtotal * 0.08
total = subtotal + tax

print(f"Subtotal: {subtotal:.2f}, Tax: {tax:.2f}, Total: {total:.2f}")

