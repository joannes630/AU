'''
Debug this program and find the bug.
'''

def main():
    file = open('grades.txt')
    lines = file.readlines()
    file.close()
    for line in lines:
        list = line.split(',')
        name = list[0]
        avg = (int(list[1])+int(list[2])+int(line[3]))/3
        print(f'{name}: {avg:.2f}')

main()
