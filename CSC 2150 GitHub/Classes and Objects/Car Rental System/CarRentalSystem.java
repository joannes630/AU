public class CarRentalSystem {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Tesla", "Model 3");
        Car car3 = new Car("Honda", "Accord");
        CarRental carRental = new CarRental(car1, car2, car3);

        carRental.showAvailableCars();
        carRental.rentCar("Toyota", "Corolla");
        carRental.showAvailableCars();
    }
}
