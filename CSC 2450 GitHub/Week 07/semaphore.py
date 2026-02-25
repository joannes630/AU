import threading
import time

x = 0
NUM_ITERATIONS = 5

sem = threading.Semaphore(3)   # Allow 3 concurrent threads

def worker():
    global x
    for _ in range(NUM_ITERATIONS):
        sem.acquire()          # wait(S)
        try:
            temp = x
            time.sleep(0.1)    # simulate work
            x = temp + 1
            print(f"{threading.current_thread().name} updated x to {x}")
        finally:
            sem.release()      # signal(S)

threads = []

for i in range(6):  # 6 threads total
    t = threading.Thread(target=worker, name=f"T{i}")
    threads.append(t)
    t.start()

for t in threads:
    t.join()

print("Final x:", x)
