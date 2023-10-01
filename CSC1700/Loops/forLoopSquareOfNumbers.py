# Shows how to use a for loop to print
# the squares of numbers 1 to 10.

# This will display
# Number	Square
# 1 	 1
# 2 	 4
# 3 	 9
# 4 	 16
# 5 	 25
# 6 	 36
# 7 	 49
# 8 	 64
# 9 	 81
# 10 	 100

print("Number\tSquare")
for x in range(1, 11):
    print(x, "\t", x**2)
