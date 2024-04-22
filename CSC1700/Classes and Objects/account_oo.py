class Account:
    def __init__(self, name, phone, addr):
        self.name = name
        self.phone = phone
        self.addr = addr

    def display_account(self):
        print(f"Customers name: {self.name}")
        print(f"Phone Number: {self.phone}")
        print(f"Address: {self.addr}")

def main():
    account1 = Account("John", "123-4567", "10 Maple St.")
    account1.display_account()

    account2 = Account("Tim", "234-5678", "10 Maple St.")
    account2.display_account()

main()
