"""
Use an input statement in a for loop to ask user for 3
scores. Compute and display the average of the 3 scores,
rounded to 2 decimal places.
"""

total = 0
for _ in range(3):
    score = float(input("Enter score: "))
    total += score
avg = total / 3
print(f"The average score is {avg:.2f}")

