def compute_salary(hours, rate):
    if hours > 40:
        overtime_hours = hours - 40
        return (40 * rate) + (overtime_hours * rate * 1.5)
    else:
        return hours * rate

# Main program
hours = float(input("Enter hours worked: "))
rate = float(input("Enter hourly rate: "))
salary = compute_salary(hours, rate)
print("Your salary is:", salary)
