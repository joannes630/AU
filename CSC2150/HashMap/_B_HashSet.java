// Java program to demonstrate working of HashTable
import java.util.*;

public class _B_HashSet {
    static int hashCode(int number) {
        int hash = number % 10;
        return hash;
    }

    static void printArray(int array[]) {
        for (int i=0; i<array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int hash;
        int grade;
        int grades[] = new int[10];
        for (int i=0; i<grades.length; i++) {
            grades[i] = -1;
        }

        grade = 97;
        hash = hashCode(grade);
        grades[hash] = grade;

        grade = 82;
        hash = hashCode(grade);
        grades[hash] = grade;

        grade = 0;
        hash = hashCode(grade);
        grades[hash] = grade;

        printArray(grades);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = keyboard.nextInt();
        while (number != -1) {
            hash = hashCode(number);
            if (number == grades[hash])
                System.out.println("The number " + number + " is in the array.");
            else
                System.out.println("The number " + number + " is not in the array.");
            System.out.print("Enter number: ");
            number = keyboard.nextInt();
        }
    }
}
