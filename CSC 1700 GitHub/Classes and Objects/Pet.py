class Pet:
    def __init__(self, name, animal_type, age):
        """Initialize the pet's attributes"""
        self.__name = name
        self.__animal_type = animal_type
        self.__age = age

    # Setter methods
    def set_name(self, name):
        """Set the pet's name"""
        self.__name = name

    def set_animal_type(self, animal_type):
        """Set the pet's animal type"""
        self.__animal_type = animal_type

    def set_age(self, age):
        """Set the pet's age"""
        self.__age = age

    # Getter methods
    def get_name(self):
        """Return the pet's name"""
        return self.__name

    def get_animal_type(self):
        """Return the pet's animal type"""
        return self.__animal_type

    def get_age(self):
        """Return the pet's age"""
        return self.__age


# Program to create a Pet object and display its data
def main():
    # Creating a Pet object
    my_pet = Pet("Bear", "Dog", 9)

    # Displaying the pet's details using accessor methods
    print("\nPet's Details:")
    print(f"Name: {my_pet.get_name()}")
    print(f"Type: {my_pet.get_animal_type()}")
    print(f"Age: {my_pet.get_age()}")


# Run the main program
if __name__ == "__main__":
    main()
