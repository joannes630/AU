class Account:
    def __init__(self):
        self.name = None
        self.phone = None
        self.addr = None

    def get_info(self):
        name = input("Enter name: ")
        phone = input("Enter phone number: ")
        addr = input("Enter address: ")
        self.name = name
        self.phone = phone
        self.addr = addr

    def display_account(self):
        print(f"Customers name: {self.name}")
        print(f"Phone Number: {self.phone}")
        print(f"Address: {self.addr}")

def main():
    account1 = Account()
    account1.get_info()
    account1.display_account()

    account2 = Account()
    account2.get_info()
    account2.display_account()

main()
