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
    account1 = BankAccount(10)
    account1.deposit(50)
    account1.withdraw(20)
    print(account1.get_balance())

main()