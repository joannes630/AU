# This is object oriented programming

class Car:
    def __init__(self):
        self.__speed = 0

    def accelerate(self):
        self.__speed += 1

    def deccelerate(self):
        self.__speed -= 1

    def get_speed(self):
        return self.__speed

def main():
    car = Car();
    print(car.get_speed())

    for i in range(60):
        car.accelerate()

    print(car.get_speed())

    for i in range(30):
        car.deccelerate()

    print(car.get_speed())

main()

