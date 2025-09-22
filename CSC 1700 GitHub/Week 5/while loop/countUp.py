# Write a program that asks the user for a positive integer and then counts up from 1 to the number.

num = int(input("Enter a positive number: "))
count = 1
while count <= num:
    print(count)
    count += 1
print("Blast off!")
