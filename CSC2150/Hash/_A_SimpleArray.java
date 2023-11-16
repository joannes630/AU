// Java program to demonstrate working of HashTable
import java.util.*;

public class _A_SimpleArray {
    static void printArray(int array[]) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == -1)
                System.out.println(i + ": ");
            else
                System.out.println(i + ": " + array[i]);

        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int grade;
        int grades[] = new int[10];
        for (int i=0; i<grades.length; i++) {
            grades[i] = -1;
        }

        grade = 97;
        grades[0] = grade;

        grade = 82;
        grades[1] = grade;

        grade = 0;
        grades[2] = grade;

        printArray(grades);

        Scanner keyboard = new Scanner(System.in);
        boolean found = false;
        System.out.print("Enter number: ");
        int number = keyboard.nextInt();
        while (number != -1 && !found) {
            for (int i=0; i<grades.length; i++) {
                if (grades[i] == number) {
                    found = true;
                }
            }
            if (found)
                System.out.println("The number " + number + " is in the array.");
            else
                System.out.println("The number " + number + " is not in the array.");

            System.out.print("Enter number: ");
            number = keyboard.nextInt();
        }
    }
}
