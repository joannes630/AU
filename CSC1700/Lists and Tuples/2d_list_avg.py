def main():
    values = [[1,   2,   3],
              [10,  20,  30],
              [100, 200, 300]]

    total = 0
    count = 0
    for i in range(len(values)):
        for j in range(len(values[i])):
            total += values[i][j]
            count += 1
    avg = total / count
    print(f"The average value is {avg}")

if __name__ == '__main__':
    main()

"""
We have values defined as a two-dimensional list of integers.
Since we will compute average, we need an accumulator (total) and a counter (count).
Set both total and count to 0 before the outer loop.

Again, if we use the len function on a 2-D list, we will get the number of rows
of the 2-D list. In this example there are three rows.
len(values) will return 3.

For the outer loop
for i in range(len(values)):
for i in range(3):
for i in [0, 1, 2]:

Now for the inner loop, for each value of i, it will iterate through all the elements of 
that single list.
for j in range(len(values[i])):
for j in range(len(values[0])):
for j in range(3):
for j in [0, 1, 2]:

Now i and j will have the indexes to our 2-D list.
We can use it in the running total computation to add the elements to our total
total += values[i][j]
Remember that the first index is the row location, the second index is the column location.
And we increment count so we keep a count of all elements of the 2-D list.

Then outside the nested for loop, we will compute the average using total and count,
and simply print the result
"""
