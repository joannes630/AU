import os
import time

def burn_cpu(start, end):
    y = 0
    for x in range(start, end):
        y += x * 3.1415

if __name__ == "__main__":
    os.sched_setaffinity(0, {1})
    burn_cpu(0, 2_000_000_000)
    print("Done.")
