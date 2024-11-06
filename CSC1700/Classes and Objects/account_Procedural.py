# This is the procedural programming

def deposit(balance, amount):
    balance += amount
    return balance

def withdraw(balance, amount):
    balance -= amount
    return balance

def main():
    balance = 0
    print(f"Your initial balance is ${balance:,.2f}.")
    balance = deposit(balance, 50)
    print(f"Your account balance after deposit is ${balance:,.2f}.")
    balance = withdraw(balance, 20)
    print(f"Your account balance after withdrawal is ${balance:,.2f}.")

main()