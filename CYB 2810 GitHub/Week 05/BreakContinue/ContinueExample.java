package BreakContinue;

/*
Simple continue example
 */
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // skip this iteration only
            }
            System.out.println("i = " + i);
        }
    }
}
