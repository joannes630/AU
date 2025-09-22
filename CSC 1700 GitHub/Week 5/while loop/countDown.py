# Write a program that asks the user for a positive integer and then counts down to zero.

num = int(input("Enter a positive number: "))
while num >= 0:
    print(num)
    num -= 1
print("Blast off!")
