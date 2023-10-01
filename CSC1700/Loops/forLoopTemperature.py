# Shows how to use a for loop to display a table
# of Fahrenheit to Celsius conversion table from -30
# to 110 Fahrenheit in steps of 10.

# This will display
# Fahrenheit	Celcius
# -30		-34.44
# -20		-28.89
# -10		-23.33
# 0		-17.78
# 10		-12.22
# 20		-6.67
# 30		-1.11
# 40		4.44
# 50		10.00
# 60		15.56
# 70		21.11
# 80		26.67
# 90		32.22
# 100		37.78
# 110		43.33

START_TEMP = -30
END_TEMP = 111
INCREMENT = 10

print("Fahrenheit\tCelcius")
for fah in range(START_TEMP, END_TEMP, INCREMENT):
    cel = (fah - 32) * 5/9
    print(f"{fah}\t\t{cel:.2f}")
