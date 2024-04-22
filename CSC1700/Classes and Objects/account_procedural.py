def display_info(name, phone, addr):
    print(f"Customers name: {name}")
    print(f"Phone Number: {phone}")
    print(f"Address: {addr}")

def get_info():
    name = input("Enter name: ")
    phone = input("Enter phone number: ")
    addr = input("Enter address: ")
    return name, phone, addr

def main():
    # Create and populate name, phone, and addr variables
    name, phone, addr = get_info()
    display_info(name, phone, addr)

    # Create and populate name2, phone2, and addr2 variables
    name2, phone2, addr2 = get_info()
    display_info(name2, phone2, addr2)

main()
