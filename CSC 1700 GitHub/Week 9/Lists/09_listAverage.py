numbers = [5, 10, 15, 20]
total = 0
count = 0

for num in numbers:
    total += num
    count += 1

if (count != 0):
    print("The average is:", total / count)
else:
    print("Cannot divide by zero")
