"""
Prompt the user to enter a username. If the username is
admin, then prompt the user to enter a password. If the
password matches abc123, display Login successful.
Otherwise, display Invalid password.

If the username is not admin, display Invalid username.
Use a nested if-else structure.
"""

login = input("Enter username: ")
if login == "admin":
    password = input("Enter password: ")
    if password == "abc123":
        print("Login successful")
    else:
        print("Invalid password")
else:
    print("Invalid username")


