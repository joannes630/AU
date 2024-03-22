def main():
    num1 = int(input('Enter a number: '))
    num2 = int(input('Enter another number: '))
    try:
        result = num1 / num2
        print(f'{num1} divided by {num2} is {result}')
    except ZeroDivisionError:
        print("You cannot divide by zero")

main()