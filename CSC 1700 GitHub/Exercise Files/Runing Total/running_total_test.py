import running_total
import time

# 1
print("1. Testing Sum from 1 to N.")
print("Enter 10...")
assert running_total.sum1toN() == 55
print("Correct!\n")
time.sleep(1)

# 2
print("2. Testing Sum of Even Numbers from 1 to N.")
print("Enter 20...")
assert running_total.sumEvenNumbers() == 110
print("Correct!")
time.sleep(1)

# 3
print("3. Total Marks of 5 Subjects.")
print("Enter the following 80, 70, 85, 90, 75")
assert running_total.totalMarks() == 400
print("Correct!")
time.sleep(1)

# 4
print("4. Average of 5 numbers")
print("Enter the following 10, 20, 30, 40, 50")
assert running_total.averageOfNumbers() == 30.0
print("Correct!")
time.sleep(1)

# 5
print("5. Total of 5 shopping card items")
print("Enter the following 1.1, 2.2, 3.3, 4.4, 5.5")
assert running_total.totalOfItems() == 16.5
print("Correct!")
time.sleep(1)

