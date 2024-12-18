class Car:
    def __init__(self, make, model, year):
        """Initialize the car's attributes"""
        self.__make = make
        self.__model = model
        self.__year = year

    # Setter methods
    def set_make(self, make):
        """Set the car's make"""
        self.__make = make

    def set_model(self, model):
        """Set the car's model"""
        self.__model = model

    def set_year(self, year):
        """Set the car's year"""
        self.__year = year

    # Getter methods
    def get_make(self):
        """Return the car's make"""
        return self.__make

    def get_model(self):
        """Return the car's model"""
        return self.__model

    def get_year(self):
        """Return the car's year"""
        return self.__year


# Program to create a Car object and display its data
def main():
    # Creating a Car object
    my_car = Car("Toyota", "Corolla", 2020)

    # Displaying the car's details using accessor methods
    print("\nCar's Details:")
    print(f"Make: {my_car.get_make()}")
    print(f"Model: {my_car.get_model()}")
    print(f"Year: {my_car.get_year()}")


# Run the main program
if __name__ == "__main__":
    main()
