"""
Write a Python program that completes the Bank class shown below.

The class already includes:
    a __str__() method to display the account information
    a deposit() method to add money to the balance

Your tasks are:
1. Write the constructor method to initialize:
      account holder name
      starting balance
2. Write a withdraw() method that accepts an amount.
      If the amount is less than or equal to the balance, subtract it from the balance.
      If the amount is greater than the balance, print:
          "Insufficient funds"
3. Create two Bank objects with different names and starting balances.
4. Make one deposit and withdrawal for one of the accounts
5. Print the bank object before and after transactions.
"""
class Bank:
    def __str__(self):
        return f"Name: {self.name}, Balance: {self.balance:.2f}"

    def deposit(self, amount):
        self.balance += amount


