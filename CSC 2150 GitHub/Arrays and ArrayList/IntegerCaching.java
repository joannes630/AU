public class IntegerCaching {
    /*
    Integer Caching:
        Java caches Integer objects for values between -128 and 127 by default.
        This means that Integer objects within this range are reused, and
        their references point to the same object in memory.
     */
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.out.println(a == b);  // true if between -128 an 127 (same object reference)
    }
}