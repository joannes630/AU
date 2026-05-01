"""
Write a Python program that defines a class named Bank to
represent a simple bank account.

The class must include the following:
1. An __init__() constructor that accepts two parameters:
    name – the account holder's name
    balance – the starting account balance
2. A __str__() method that returns the account information in the following format:
    Name: Alice, Balance: 100.00
    The balance should always display with two decimal places.

3. A deposit(amount) method that adds the given amount to the account balance.
4. A withdraw(amount) method that:
    Displays the withdrawal amount in this format:
        Withdraw of 20.00
    Subtracts the amount from the balance if enough money is available.
    If the balance is too low, display this message:
        Balance is too low, try a smaller withdrawal

After creating the class, write code that:

1. Creates a bank account for a customer with a zero balance.
2. Prints the account information.
3. Deposits money into the account and prints the updated balance.
4. Attempts to withdraw more money than is available.
5. Withdraws a valid amount.
6. Prints the final account balance.
"""
class Bank:
    def __init__(self, name, balance):
        self.name = name
        self.balance = balance

    def __str__(self):
        return f"Name: {self.name}, Balance: ${self.balance:.2f}"

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
        else:
            print("Insufficent funds...")
            
account1 = Bank("Joe", 500)
print(account1)

account2 = Bank("Mary", 1000)
print(account2)

account1.deposit(200)
print(account1)

account2.withdraw(2000)
print(account2)

account2.withdraw(20)
print(account2)



