# This program demonstrates how a floating-point
# number can be formatted using various methods
amount_due = 5000.0
monthly_payment = amount_due / 12
print('The monthly payment is %.2f' %monthly_payment)
print('The monthly payment is', format(monthly_payment, '.2f'))
print(f'The monthly payment is {monthly_payment:.2f}')