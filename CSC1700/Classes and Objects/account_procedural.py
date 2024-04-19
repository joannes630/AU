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
    name, phone, addr = get_info()
    display_info(name, phone, addr)

main()
