import os

def launch_with_affinity(core_id):
    pid = os.fork()

    if pid == 0:  # Child process
        # Set CPU affinity for this process
        os.sched_setaffinity(0, {core_id})

        # Replace process image with gnome-system-monitor
        os.execv("/usr/bin/gnome-system-monitor",
                 ["/usr/bin/gnome-system-monitor"])
    else:
        print(f"Started gnome-system-monitor with PID {pid} on core {core_id}")

if __name__ == "__main__":
    launch_with_affinity(0)  # Pin to core 0
