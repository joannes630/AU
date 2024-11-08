# This is object oriented programming

class Car:
    def __init__(self):
        self.speed = 0

    def accelerate(self):
        self.speed += 1

    def deccelerate(self):
        self.speed -= 1

    def get_speed(self):
        return self.speed

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

