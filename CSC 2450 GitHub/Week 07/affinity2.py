import multiprocessing
import os

def burn_cpu(start, end, core_id):
    os.sched_setaffinity(0, {core_id})
    y = 0
    for x in range(start, end):
        y += x * 3.14159

if __name__ == "__main__":
    limit = 1_000_000_000
    chunk = limit // 4

    processes = []
    p = multiprocessing.Process(target=burn_cpu, args=(0, 250_000_000, 2))
    p.start()
    processes.append(p)

    p = multiprocessing.Process(target=burn_cpu, args=(250_000_000, 500_000_000, 3))
    p.start()
    processes.append(p)

    p = multiprocessing.Process(target=burn_cpu, args=(500_000_000, 750_000_000, 4))
    p.start()
    processes.append(p)

    p = multiprocessing.Process(target=burn_cpu, args=(750_000_000, 1_000_000_000, 5))
    p.start()
    processes.append(p)

    for p in processes:
        p.join()

    print("Done.")
