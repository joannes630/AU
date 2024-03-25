public class Overflow {
    public static void main(String[] args) {
        int a = 2_147_483_637;
        int b = 10;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
	int c = a + b;
	System.out.println("The sum of a and b is " + c);
    }
}

