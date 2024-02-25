#CSC-1700 SP24

#1
# number = int(input("Enter a number: "))
# product = number * 10
# while product < 100:
#     number = int(input("Enter a number: "))
#     product = number * 10

#2
# for num in range(1, 101):
#     if num%2 == 1:
#         print(num)

#3
# sum = 0
# for numer in range(30):
#     denom = 30 - numer
#     print(f"{numer+1}/{denom}")
#     sum += (numer+1) / denom
# print(f"{sum:.2f}")

#4
# sum = 0
# for _ in range(10):
#     num = int(input("Enter a number: "))
#     sum += num
# print(sum)

#5
# num = int(input("Enter a number: "))
# while num <= 0:
#     print("Error: Please enter a positive nonzero number")
#     num = int(input("Enter a number: "))
# print(num)

#6
# num = int(input("Enter a number: "))
# while num < 1 or num > 100:
#     print("Error: Please enter a number between 1 and 100")
#     num = int(input("Enter a number: "))
# print(num)

#7
# CAL_PER_MINUTE = 4.2
# print ('Minutes\t\tCalories Burned')
# for minutes in range(10, 31, 5):
#     caloriesBurned = CAL_PER_MINUTE * minutes
#     print (minutes, "\t\t\t", caloriesBurned)

#8
# numDays = int(input('Enter the number of days: '))
# total = 0
# dayPennies = 1
# print ('Day\tPennies')
# for day in range(1, numDays + 1):
#     print(f'{day}\t${dayPennies / 100:,.2f}')
#     total += dayPennies
#     dayPennies *= 2
# print(f'The total salary for {numDays} days is: ${total/100:,.2f}')

#9
# for row in range(5):
#     for col in range(10):
#         print("*", end="")
#     print()

#10
# for row in range(8):
#     for col in range(row+1):
#         print("*", end="")
#     print()
