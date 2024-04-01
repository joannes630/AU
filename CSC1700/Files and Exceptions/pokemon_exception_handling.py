def main():
    try:
        num1 = int(input('Enter a number: '))
        num2 = int(input('Enter another number: '))
        result = num1 / num2
        print(f'{num1} divided by {num2} is {result}')
    except Exception as err:
        # This should catch any exceptions that can happen
        # in the code above. Since "you gotta catch them all" 
        # is why its called Pokemon exception handling.
        print(err)

main()
