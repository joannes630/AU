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
    johnAccount = BankAccount(0)
    pay = 50
    johnAccount.deposit(pay)
    print(johnAccount.get_balance())
    cash = 25
    johnAccount.withdraw(cash)
    print(johnAccount.get_balance())




















    # johnAccount = BankAccount(0)
    # timAccount = BankAccount(0)
    # print(f"Your initial balance is ${johnAccount.get_balance():,.2f}.")
    # johnAccount.deposit(100)
    # print(f"Your account balance after deposit is ${johnAccount.get_balance():,.2f}.")
    # johnAccount.withdraw(25)
    # johnAccount.balance = 1_000_000
    # print(f"John's account balance after withdrawal is ${johnAccount.get_balance():,.2f}.")
    #
    # print(f"Tim's account balance is ${timAccount.get_balance():,.2f}.")

main()

