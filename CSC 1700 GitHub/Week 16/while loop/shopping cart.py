"""
Use a sentinel-controlled while loop to continuously prompt
the user to enter item prices. Stop when the user enters -1.

Within the loop, process each item’s price and compute the
subtotal. After the loop ends, calculate an 8% tax.

Display the subtotal, tax amount, and final total. Round all
monetary values to two decimal places.
"""

total = 0
while True:
    price = float(input("Enter item price: "))
    if price == -1:
        break
    total += price
tax = total * 0.08
final_total = total + tax
print(f"total is {total:.2f}, tax is {tax:.2f}, final total is {final_total:.2f}")
