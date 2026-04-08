names = ["Chris", "Katie", "John"]
numbers = ["555-1111", "555-2222", "555-3333"]

dict = {}
for i in range(len(names)):
    dict[names[i]] = numbers[i]

print(dict.pop("Joannes"))
