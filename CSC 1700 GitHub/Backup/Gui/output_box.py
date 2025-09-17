import tkinter as tk

def display_temperature():
    temperature = 40  # Example variable value
    output_label.config(text=f"Temperature: {temperature} °F")

# Create the main window
root = tk.Tk()
root.title("Temperature Display")
root.geometry("250x100")  # Set window size

# Create a button to trigger temperature display
output_button = tk.Button(root, text="Show Temperature", command=display_temperature)
output_button.pack(pady=10)

# Create a label to display the temperature
output_label = tk.Label(root, text="Temperature: -- °F", bg="lightgray", width=20)
output_label.pack(pady=5)

# Start the GUI loop
root.mainloop()
