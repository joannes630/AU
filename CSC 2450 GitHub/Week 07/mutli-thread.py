import threading
import time

x = 0
lock = threading.Lock()

def worker(thread_name):
    global x
    for i in range(5):
        with lock:
            x += 1
            print(f"{thread_name} iteration {i}, x = {x}")
        time.sleep(1)

thread1 = threading.Thread(target=worker, args=("Thread-1",))
thread2 = threading.Thread(target=worker, args=("Thread-2",))
thread3 = threading.Thread(target=worker, args=("Thread-3",))

thread1.start()
thread2.start()
thread3.start()

thread1.join()
thread2.join()
thread3.join()

print("Final value of x:", x)
