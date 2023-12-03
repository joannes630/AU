# This is the procedural programming

def deposit(balance, amount):
    balance += amount
    return balance

def withdraw(balance, amount):
    balance -= amount
    return balance

def main():
    balance = float(input("Enter John's starting balance: "))
    pay = float(input("How much were you paid this week? "))
    balance = deposit(balance, pay)
    print(f"Your account balance is ${balance:,.2f}.")
    cash = float(input("How much would you like to withdraw? "))
    balance = withdraw(balance, cash)
    print(f"Your account balance is ${balance:,.2f}.")

main()