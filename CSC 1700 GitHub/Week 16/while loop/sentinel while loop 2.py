"""
Write a Python program that repeatedly asks the user to
enter a number and keeps a running total of the numbers
entered. The program should continue prompting the user
until they enter -1, which serves as a sentinel value to
stop the loop.  

When the user enters -1, the program should exit the loop
and display the average of all valid numbers entered
(rounded to 2 decimal places). Be sure to handle the case
where the sentinel value is entered immediately (i.e., no
valid numbers were entered).
"""

total = 0
count = 0
while True:
    num = int(input("Enter a number: "))
    if num == -1:
        if count != 0:
            print(f"The average value is {total/count:.2f}")
        else:
            print("No values entered")
        break
    total += num
    count += 1
