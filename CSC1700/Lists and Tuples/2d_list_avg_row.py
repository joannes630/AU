def main():
    values = [[1,   2,   3],
              [10,  20,  30],
              [100, 200, 300]]

    for i in range(len(values)):
        total = 0
        count = 0
        for j in range(len(values[i])):
            total += values[i][j]
            count += 1
        avg = total / count
        print(f"The average of row {i+1} is {avg}")

if __name__ == '__main__':
    main()

"""
We have values defined as a two-dimensional list of integers.
Since we will compute average of each rows, we need an accumulator (total) and a counter (count) for each row.
Set both total and count to 0 before the inner loop, after the outer loop.
Why did we do this? It's because the total and count have to be set to zero for each row,
since we are computing the average of each row of numbers.

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

Now, outside the inner loop (inside the outer loop), we will compute the average using total and count,
and simply print the result. We do this in between the outer and inner loops because we are computing
the average of each rows.

"""
