# This is object oriented programming
class BankAccount:
    def __init__(self, bal):
        self.__balance = bal

    def deposit(self, amount):
        self.__balance += amount

    def withdraw(self, amount):
        self.__balance -= amount

    def get_balance(self):
        return self.__balance

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
