import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class MethodExercisesTest {
    private MethodExercises methodExercises;

    @Before
    public void setUp() {
        // Arrange: Initialize before each test
        methodExercises = new MethodExercises();
    }

    @After
    public void tearDown() {
        // Clean up after each test (optional)
        methodExercises = null;
    }

//    @Test
//    public void testAreaCalculator() {
//        double result = MethodExercises.calculateArea(4.0, 5.0);
//        assertEquals(result, 20.0, 0.01);
//        result = MethodExercises.calculateArea(2.0, 3.0);
//        assertEquals(result, 6.0, 0.01);
//        System.out.println("testAreaCalculator passed");
//    }
//
//    @Test
//    public void testAreaCalculatorCircle() {
//        double result = MethodExercises.calculateAreaCircle(6.2);
//        assertEquals(result, 120.76, 0.01);
//        result = MethodExercises.calculateAreaCircle(4.7);
//        assertEquals(result, 69.39, 0.01);
//        System.out.println("testAreaCalculatorCircle passed");
//    }
//
//    @Test
//    public void testAdd() {
//        int result = MethodExercises.add(3, 4);
//        assertEquals(result, 7);
//        result = MethodExercises.add(1, 2);
//        assertEquals(result, 3);
//        System.out.println("testAdd passed");
//    }
//
//    @Test
//    public void testAdd2() {
//        int result = MethodExercises.add(3, 4, 5);
//        assertEquals(result, 12);
//        result = MethodExercises.add(1, 2, 3);
//        assertEquals(result, 6);
//        System.out.println("testAdd2 passed");
//    }
//
//    @Test
//    public void testAdd3() {
//        double result = MethodExercises.add(3.5, 4.2);
//        assertEquals(result, 7.7, 0.01);
//        result = MethodExercises.add(4.7, 5.2);
//        assertEquals(result, 9.9, 0.01);
//        System.out.println("testAdd3 passed");
//    }
//
//    @Test
//    public void testFindMax() {
//        int result = MethodExercises.findMax(13, 24, 45);
//        assertEquals(result, 45);
//        result = MethodExercises.findMax(101, 24, 45);
//        assertEquals(result, 101);
//        System.out.println("testFindMax passed");
//    }
//
//    @Test
//    public void testIsEven() {
//        boolean result = MethodExercises.isEven(13);
//        assertFalse(result);
//        result = MethodExercises.isEven(12);
//        assertTrue(result);
//        System.out.println("testIsEven passed");
//    }
//
//    @Test
//    public void testFact() {
//        int result = MethodExercises.factorial(5);
//        assertEquals(result, 120);
//        result = MethodExercises.factorial(4);
//        assertEquals(result, 24);
//        System.out.println("testFact passed");
//    }
//
//    @Test
//    public void testConvertToFahrenheit() {
//        double result = MethodExercises.convertToFahrenheit(25.0);
//        assertEquals(result, 77.00, 0.01);
//        result = MethodExercises.convertToCelsius(100);
//        assertEquals(result, 37.78, 0.01);
//        System.out.println("testFact passed");
//    }
}
