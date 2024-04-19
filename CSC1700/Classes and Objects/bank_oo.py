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
    account = BankAccount(0)
    print(f"Your initial balance is ${account.get_balance()}.")
    pay = 100
    account.deposit(pay)
    print(f"Your account balance after deposit is ${account.get_balance()}.", )
    cash = 25
    account.withdraw(cash)
    print(f"Your account balance after withdrawal is ${account.get_balance()}.")

main()
