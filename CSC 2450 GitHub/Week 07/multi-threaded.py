import time
import threading
from datetime import datetime

def print_time(label):
    print(f"{label} | {datetime.now().strftime('%H:%M:%S')}")

def download():
    for i in range(5):
        print_time("Downloading...")
        time.sleep(1)
    print("Download complete\n")

def process():
    for i in range(5):
        print_time("Processing...")
        time.sleep(1)
    print("Processing complete\n")

start = time.time()

t1 = threading.Thread(target=download)
t2 = threading.Thread(target=process)

t1.start()
t2.start()

t1.join()
t2.join()

end = time.time()
print(f"Total execution time: {end - start:.2f} seconds")