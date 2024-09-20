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
boolean isAvailable - true if the car is currently rented, false otherwise.

Methods:
A constructor to initialize the car with its make and model. The car should not be rented by default.
Create the getters and setters for the attributes: getMake, setMake, getModel, setModel.
rentCar() - Marks the car as rented if it's not already rented.
returnCar() - Marks the car as returned.
isAvailable() - Returns true if the car is available (not rented), false otherwise.
*/

public class Car {
    private String make;
    private String model;
    private boolean isAvailable;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        isAvailable = true;
    }

    public void rentCar() {
        if (isAvailable) {
            System.out.println("Renting the " + make + " " + model);
            isAvailable = false;
        }
        else
            System.out.println("Sorry, car is not available");
    }

    public void returnCar() {
        if (!isAvailable) {
            System.out.println("Returning the " + make + " " + model);
            isAvailable = true;
        }
        else
            System.out.println("Hmm, " + make + " " + model + " is not rented out.");
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        String status = isAvailable ? "Available" : "Rented";
        return("Make: " + make + ", Model: " + model + ", Status: " + status);
    }
}
