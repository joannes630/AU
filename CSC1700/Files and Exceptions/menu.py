
def menu():
    print(f"""
    Customer Records System
    1. Add Customer
    2. View Customer Data
    3. View Total Savings
    4. Quit
    """)

def main():
    choice = 0
    while choice != 4:
        menu()
        choice = int(input("Enter choice: "))
        if choice == 1:
            pass
        elif choice == 2:
            pass
        elif choice == 3:
            pass
        elif choice == 4:
            pass
        else:
            print("Error, invalid choice")

main()
