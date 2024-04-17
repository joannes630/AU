'''
Create the dictionary called 'grade'. It is composed of the three student
names, with each student having three grades. The student and their 
grades are
Kayla - 88, 92, 100
Luis  - 95, 74, 81
Sophie - 72, 88, 91

The key is a string data type, and the value is a list of numbers. 
After creating the dictionary, display it.
'''

def main():
    grade = { 'Kayla' : [88, 92, 100],
              'Luis' : [95, 74, 81],
              'Sophie' : [72, 88, 91] }
    print(grade)

main()
