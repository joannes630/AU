import time
from datetime import datetime
import tkinter as tk
from tkinter import messagebox

def get_current_time():
    return datetime.now().strftime("%H:%M:%S")

def update_current_time():
    current_time_label.config(text=f"Current Time: {get_current_time()}")
    root.after(1000, update_current_time)  # Schedule the update every second

def set_alarm():
    alarm_time = alarm_time_entry.get()
    try:
        datetime.strptime(alarm_time, "%H:%M:%S")  # Validate time format
    except ValueError:
        messagebox.showerror("Invalid Time Format", "Please enter time in HH:MM:SS format.")
        return

    status_label.config(text=f"Alarm set for: {alarm_time}")
    root.update()

    while True:
        current_time = get_current_time()
        if current_time == alarm_time:
            messagebox.showinfo("Alarm", "Time to wake up!")
            break
        time.sleep(1)
        root.update()

root = tk.Tk()
root.title("Alarm Clock")

current_time_label = tk.Label(root, text="", font=("Arial", 14), fg="blue")
current_time_label.pack(pady=10)

time_label = tk.Label(root, text="Enter Alarm Time (HH:MM:SS):", font=("Arial", 12))
time_label.pack(pady=10)

alarm_time_entry = tk.Entry(root, font=("Arial", 14), width=15, justify='center')
alarm_time_entry.pack(pady=5)

set_alarm_button = tk.Button(root, text="Set Alarm", font=("Arial", 12), command=set_alarm)
set_alarm_button.pack(pady=10)

status_label = tk.Label(root, text="", font=("Arial", 12), fg="green")
status_label.pack(pady=5)

update_current_time()
root.mainloop()
