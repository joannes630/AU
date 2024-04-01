def main():
    students = [['Joe', 'Kim'],
                ['Sam', 'Sue'],
                ['Kelly', 'Chris']]
    print(students)

    # Accessing the 2-D list via index
    for i in range(len(students)):
        for j in range(len(students[i])):
            print(students[i][j])

main()

"""
Now, we can also use the index to use to iterate through our two-dimensional list.
Let's go through the steps what actually happens

When you use the len function on a two-dimensional list, you will get 
the number of rows.
So len(students) will return the value of 3.
for i in range(len(students)):
for i in range(3):
for i in [0, 1, 2]:
This will make i have the values 0, 1, 2 for each iteration of the outer loop.

Now for the inner loop:
for i in range(len(students[i])):
for i in range(len(students[0])):
    Now, students[0] is the list of the first row
    basically, students[0] is ['Joe', 'Kim]
for i in range(2):
for i in [0, 1]:

This will now iterate through the two elements in each row

Then the print statement in the inner loop will use the i and j indexes
to index through the two-dimensional list. The first index is the row
and the second index is the column.

"""
