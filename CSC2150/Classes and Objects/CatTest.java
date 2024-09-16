import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {

    private Cat cat;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        cat = new Cat();
        // Set up to capture the System.out output
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCatProperties() {
        // Set the properties
        cat.name = "Jerry";
        cat.age = 12;

        // Test the properties
        assertEquals("Jerry", cat.name);
        assertEquals(12, cat.age);
    }

    @Test
    public void testDisplayInfo() {
        // Set the properties
        cat.name = "Jerry";
        cat.age = 12;

        // Call the method
        cat.displayInfo();

        // Check the output
        assertTrue(outContent.toString().contains("Jerry"));
        assertTrue(outContent.toString().contains("12"));
    }

    // Restore the original System.out after the test
    @org.junit.After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
