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
    account = Account("John", "123-4567", "10 Maple St.")
    account.display_account()

main()
