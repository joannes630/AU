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
    start_bal = float(input("Enter John's starting balance: "))
    johnAccount = BankAccount(start_bal)
    pay = float(input("How much were you paid this week? "))
    johnAccount.deposit(pay)
    print(f"Your account balance is ${johnAccount.get_balance():,.2f}.")
    cash = float(input("How much would you like to withdraw? "))
    johnAccount.withdraw(cash)

    print(f"John's account balance is ${johnAccount.get_balance():,.2f}.")

main()