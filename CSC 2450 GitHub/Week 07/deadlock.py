import threading
import time

lockA = threading.Lock()
lockB = threading.Lock()

def thread1():
    print("Thread 1: acquiring lockA")
    lockA.acquire()
    print("Thread 1: acquired lockA")

    time.sleep(1)  # Give Thread 2 time to acquire lockB

    print("Thread 1: waiting for lockB")
    lockB.acquire()
    print("Thread 1: acquired lockB")
    lockB.release()
    lockA.release()

def thread2():
    print("Thread 2: acquiring lockB")
    lockB.acquire()
    print("Thread 2: acquired lockB")

    time.sleep(1)  # Give Thread 1 time to acquire lockA

    print("Thread 2: waiting for lockA")
    lockA.acquire()
    print("Thread 2: acquired lockA")
    lockA.release()
    lockB.release()

t1 = threading.Thread(target=thread1)
t2 = threading.Thread(target=thread2)

t1.start()
t2.start()

t1.join()
t2.join()