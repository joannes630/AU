class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year
        self.mileage = 0

    def drive(self, distance):
        self.mileage += distance

    def get_mileage(self):
        return self.mileage

my_car = Car("Toyota", "Camry", 2023)
my_car.drive(100)
my_car.drive(50)
print("My car mileage is", my_car.get_mileage())  # Output: 150