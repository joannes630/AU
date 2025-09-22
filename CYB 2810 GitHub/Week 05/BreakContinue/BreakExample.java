package BreakContinue;

/*
Simple break example
 */
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking out of the loop at i = " + i);
                break; // exit the loop completely
            }
            System.out.println("i = " + i);
        }
    }
}
