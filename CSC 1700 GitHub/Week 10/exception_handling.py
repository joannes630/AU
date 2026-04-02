"""
Use exception handling to handle possible exceptions

except Exception as e:
try:
except ValueError:
except ZeroDivisionError:
print("Invalid input")
print(e)
except Error:
"""

x = int(input("Enter a number: "))
y = 10 / x
print("Result:", y)
print("Invalid input")
print("Program finished.")



