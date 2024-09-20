/*
Objective:
To practice working with classes, objects, constructors, and methods in Java by creating a basic car rental system.

Assignment Description:

You will create a Java program that simulates a car rental system.
The system will include two classes: Car and CarRental.
For this exercise, just create the Car class.

Requirements:
Class 1: Car

This class represents a car in the rental system.

Attributes:
String make - the make of the car (e.g., Toyota, Ford).
String model - the model of the car (e.g., Camry, Mustang).
boolean isRented - true if the car is currently rented, false otherwise.

Methods:
A constructor to initialize the car with its make and model. The car should not be rented by default.
rentCar() - Marks the car as rented if it's not already rented.
returnCar() - Marks the car as returned.
isAvailable() - Returns true if the car is not rented, false otherwise.
toString() - Returns a string representation of the car in the following format: "Make: [make], Model: [model], Status: [Available/Rented]".
*/

public class CarRental {
    private Car car1;
    private Car car2;
    private Car car3;

    // Constructor
    public CarRental(Car car1, Car car2, Car car3) {
        this.car1 = car1;
        this.car2 = car2;
        this.car3 = car3;
    }

    // Method to rent a car by make and model
    public void rentCar(String make, String model) {
        if (car1.toString().contains(make) && car1.toString().contains(model)) {
            car1.rentCar();
        } else if (car2.toString().contains(make) && car2.toString().contains(model)) {
            car2.rentCar();
        } else if (car3.toString().contains(make) && car3.toString().contains(model)) {
            car3.rentCar();
        } else {
            System.out.println("Car not found.");
        }
    }

    // Method to return a car by make and model
    public void returnCar(String make, String model) {
        if (car1.toString().contains(make) && car1.toString().contains(model)) {
            car1.returnCar();
        } else if (car2.toString().contains(make) && car2.toString().contains(model)) {
            car2.returnCar();
        } else if (car3.toString().contains(make) && car3.toString().contains(model)) {
            car3.returnCar();
        } else {
            System.out.println("Car not found.");
        }
    }

    // Method to show available cars
    public void showAvailableCars() {
        System.out.println("Available Cars:");
        if (car1.isAvailable()) {
            System.out.println(car1);
        }
        if (car2.isAvailable()) {
            System.out.println(car2);
        }
        if (car3.isAvailable()) {
            System.out.println(car3);
        }
    }
}
