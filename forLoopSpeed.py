# Shows how to use a for loop to display a table
# of MPH to KPH conversion table from 0
# to 80 MPH in steps of 10.

CONVERSION_FACTOR = 1.609344
STARTING_SPEED = 0
ENDING_SPEED = 81
INCREMENT = 10

print("MPH\tKPH")
for mph in range(STARTING_SPEED, ENDING_SPEED, INCREMENT):
    kph = mph * CONVERSION_FACTOR
    print(f".*{mph}.*{kph:.2f}.*")
