# This is the procedural programming

def deposit(balance, amount):
    balance += amount
    return balance

def withdraw(balance, amount):
    balance -= amount
    return balance

def main():
    balance = 0
    print(f"Your initial balance is ${balance}.")
    balance = deposit(balance, 100)
    print(f"Your account balance after deposit is ${balance}.")
    balance = withdraw(balance, 25)
    print(f"Your account balance after withdrawal is ${balance}.")

main()
