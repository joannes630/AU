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
