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
    print(johnAccount.get_balance())
    johnAccount.deposit(50)
    print(johnAccount.get_balance())
    johnAccount.withdraw(20)
    print(johnAccount.get_balance())

main()