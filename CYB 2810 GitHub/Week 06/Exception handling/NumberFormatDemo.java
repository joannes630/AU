public class NumberFormatDemo {
    public static void main(String[] args) {
        String value = "abc123";  // not a valid number

        int number = Integer.parseInt(value);
        System.out.println("Converted number: " + number);
        System.out.println("Program continues...");
    }
}
