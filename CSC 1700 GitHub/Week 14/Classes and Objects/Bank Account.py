class Bank_account:
    name = None
    balance = None

    def __init__(self, name, balance):
        self.name = name
        self.balance = balance

    def get_name(self):
        return self.name

    def get_balance(self):
        return self.balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
        else:
            print("Account does not have enough funds")

name = input("Enter depositor name: ")
amount = float(input("Enter initial deposit: "))
account1 = Bank_account(name, amount)
print(f"{account1.get_name()} account has ${account1.get_balance()}")

amount = float(input("Enter amount to deposit: "))
account1.deposit(amount)
print(f"{account1.get_name()} account has ${account1.get_balance()}")

amount = float(input("Enter amount to withdraw: "))
account1.withdraw(amount)
print(f"{account1.get_name()} account has ${account1.get_balance()}")

