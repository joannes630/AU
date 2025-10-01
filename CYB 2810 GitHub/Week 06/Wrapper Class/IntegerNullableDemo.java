public class IntegerNullableDemo {
    public static void main(String[] args) {
        // Imagine we’re storing student ages, but not all ages are known yet
        Integer ageKnown = 20;   // valid value
        Integer ageUnknown = null;  // missing value

        System.out.println("Known age: " + ageKnown);

        if (ageUnknown == null) {
            System.out.println("Age is unknown (not yet provided).");
        } else {
            System.out.println("Age: " + ageUnknown);
        }

        // You couldn’t do this with int, because "int ageUnknown = null;" is illegal
    }
}
