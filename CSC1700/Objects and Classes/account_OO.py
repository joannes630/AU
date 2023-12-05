# This is object oriented programming

class BankAccount:
    def __init__(self, bal):
        self.balance = bal

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount

    def get_balance(self):
        return self.balance

def main():
    johnAccount = BankAccount(0)
    print(f"Your initial balance is ${johnAccount.get_balance():,.2f}.")
    johnAccount.deposit(100)
    print(f"Your account balance after deposit is ${johnAccount.get_balance():,.2f}.")
    johnAccount.withdraw(25)
    print(f"John's account balance after withdrawal is ${johnAccount.get_balance():,.2f}.")

main()