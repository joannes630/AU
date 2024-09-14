import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    // This method will run before each test to set up the environment
    @Before
    public void setUp() {
        // Create a new Car object before each test
        car = new Car("Toyota", "Camry");
    }

    // Test the initial availability of the car
    @Test
    public void testInitialAvailability() {
        // Assert that the car is initially available
        assertTrue(car.isAvailable());
    }

    // Test renting the car when it is available
    @Test
    public void testRentCarWhenAvailable() {
        car.rentCar();  // Rent the car
        assertFalse(car.isAvailable());  // The car should no longer be available
    }

    // Test renting the car when it is already rented
    @Test
    public void testRentCarWhenNotAvailable() {
        car.rentCar();  // Rent the car, making it unavailable
        car.rentCar();  // Try renting again, should still be unavailable
        assertFalse(car.isAvailable());  // The car should remain unavailable
    }

    // Test returning the car when it is rented
    @Test
    public void testReturnCarWhenRented() {
        car.rentCar();  // Rent the car
        car.returnCar();  // Return the car
        assertTrue(car.isAvailable());  // The car should be available again
    }

    // Test returning the car when it is already available
    @Test
    public void testReturnCarWhenAvailable() {
        car.returnCar();  // Try returning when the car is already available
        assertTrue(car.isAvailable());  // The car should remain available
    }

    // Test the toString method for the "Available" state
    @Test
    public void testToStringWhenAvailable() {
        car.rentCar();
        car.returnCar();  // Return the car
        String message = car.toString();
        System.out.println(message);
        assertTrue(message.contains("Toyota"));
        assertTrue(message.contains("Camry"));
        assertTrue(message.contains("Available"));
    }

    // Test the toString method for the "Rented" state
    @Test
    public void testToStringWhenRented() {
        car.rentCar();  // Rent the car
        String message = car.toString();
        System.out.println(message);
        assertTrue(message.contains("Toyota"));
        assertTrue(message.contains("Camry"));
        assertTrue(message.contains("Rented"));
    }
}
