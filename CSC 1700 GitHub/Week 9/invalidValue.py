try:
    x = int(input("Enter x: "))
    y = int(input("Enter y: "))   # Enter abc
    sum = x + y
    print(sum)
except ValueError:
    print("Invalid value")

print("Program continues ...")
