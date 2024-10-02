def show_menu():
    print("\n--- Main Menu ---")
    print("1. Option 1")
    print("2. Option 2")
    print("3. Option 3")
    print("4. Exit")

def option_1():
    print("You selected Option 1")

def option_2():
    print("You selected Option 2")

def option_3():
    print("You selected Option 3")

def exit_program():
    print("Exiting the program... Goodbye!")

def main():
    choice = 0
    while choice != '4':
        # Display the menu
        show_menu()

        # Get user input
        choice = input("Enter your choice (1-4): ")

        # Handle the user's choice
        if choice == '1':
            option_1()
        elif choice == '2':
            option_2()
        elif choice == '3':
            option_3()
        elif choice == '4':
            exit_program()
        else:
            print("Invalid choice. Please enter a number between 1 and 4.")

# Entry point of the program
main()
