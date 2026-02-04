public class CallStackDemo {

    public static void main(String[] args) {
        System.out.println("Start of main()");
        int x = 1;
        firstFunction();
        System.out.println("End of main(). X is " + x);
    }

    static void firstFunction() {
        System.out.println(" Entering firstFunction()");
        int y = 2;
        secondFunction();
        System.out.println(" Exiting firstFunction(). Y is " + y);
    }

    static void secondFunction() {
        System.out.println("  Entering secondFunction()");
        int z = 3;
        thirdFunction();
        System.out.println("  Exiting secondFunction(). Z is " + z);
    }

    static void thirdFunction() {
        System.out.println("   Entering thirdFunction()");
        System.out.println("   Doing work in thirdFunction()");
        System.out.println("   Exiting thirdFunction()");
    }
}