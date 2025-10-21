x = int(input("Enter x: "))
y = int(input("Enter y: "))   # Enter 0
try:
    answer = x / y
    print(answer)
except ZeroDivisionError:
    print("Cannot divide by zero")

print("Program continues ...")
