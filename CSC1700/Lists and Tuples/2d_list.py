def main():
    students = [['Joe', 'Kim'],
                ['Sam', 'Sue'],
                ['Kelly', 'Chris']]
    print(students)

    for row in students:
        for item in row:
            print(item)

main()

"""
In the first iteration of the outer loop, the variable row will contain
row = ['Joe', 'Kim']
This row is passed in the inner loop. Now in each iteration of the inner
the variable item will contain
'Joe'
'Kim'

And each time it would print it.
Ans so on. In the second iteration of the outer loop
row = ['Sam', 'Sue']
item = 'Sam'
item = 'Sue'

And finally the third iteration of the outer loop
row = ['Kelly', 'Chris']
item = 'Kelly'
item = 'Chris'

"""
