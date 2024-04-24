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
    # Create an account object with $10 initial deposit
    account = BankAccount(10)
    print(f"Your initial balance is ${account.get_balance()}.")
    # Deposit $100 to your account
    account.deposit(100)
    print(f"Your account balance after deposit is ${account.get_balance()}.", )
    # Withdraw $25 from your account
    account.withdraw(25)
    print(f"Your account balance after withdrawal is ${account.get_balance()}.")

main()
