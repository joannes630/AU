# Shows how to use a for loop to display a table
# of Fahrenheit to Celsius conversion table from -30
# to 110 Fahrenheit in steps of 10.

START_TEMP = -30
END_TEMP = 111
INCREMENT = 10

print("Fahrenheit\tCelcius")
for fah in range(START_TEMP, END_TEMP, INCREMENT):
    cel = (fah - 32) * 5/9
    print(f"{fah}\t\t\t{cel:.2f}")
