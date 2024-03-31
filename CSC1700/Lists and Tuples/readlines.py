"""
numbers.txt contains
1.2
3.4
5.6
"""

def main():
    file = open("numbers.txt")
    list = file.readlines()
    total = count = 0
    for line in list:
        total += float(line)
        count += 1
    file.close()
    avg = total / count
    print(f"{avg:.2f}")

main()

"""
list = ["1.2", "3.4", "5.6"]

line = "1.2"
total = 0 + float("1.2") = 1.2
count = 0 + 1 = 1

line = "3.4"
total = 1.2 + float("3.4") = 4.6
count = 1 + 1 = 2

line = "5.6"
total = 4.6 + float("5.6") = 10.2
count = 2 + 1 = 3

avg = 10.2 / 3 = 3.4
"""
