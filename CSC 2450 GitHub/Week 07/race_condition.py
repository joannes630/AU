import threading
import time

counter = 0
NUM_ITERATIONS = 1000

def increment():
    global counter
    for _ in range(NUM_ITERATIONS):
        temp = counter
        # time.sleep(0.0000001)   # Force context switch
        counter = temp + 1

threads = []

for _ in range(4):
    t = threading.Thread(target=increment)
    threads.append(t)
    t.start()

for t in threads:
    t.join()

print("Expected:", 4 * NUM_ITERATIONS)
print("Actual:  ", counter)
