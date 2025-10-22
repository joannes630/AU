fruits = ["apple", "banana", "cherry"]
print(fruits)

for index, fruit in enumerate(fruits):
    if fruit == "banana":
        fruits[index] = "orange"

print(fruits)
