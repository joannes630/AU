import time

counter = 0
NUM_ITERATIONS = 4000

def increment():
    global counter
    for _ in range(NUM_ITERATIONS):
        temp = counter
        counter = temp + 1

# Call increment
increment()

print("Expected:", NUM_ITERATIONS)
print("Actual:  ", counter)
