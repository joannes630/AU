"""
Write a Python program that repeatedly asks the user to
enter a number and keeps a running total of the numbers
entered. The program should continue prompting the user
until they enter -1, which serves as a sentinel value to
stop the loop.  

When the user enters -1, the program should exit the loop
and display the total sum of all valid numbers entered.
"""

total = 0
while True:
    num = int(input("Enter a number: "))
    if num == -1:
        print(f"The total of the numbers entered is {total}")
        break
    total += num
