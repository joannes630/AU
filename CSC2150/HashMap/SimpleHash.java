// Java program to demonstrate working of HashTable
import java.util.Arrays;
import java.util.Scanner;

public class SimpleHash {
    static int hashCode(int number) {
        int hash = number % 10;
        return hash;
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

        grade = 33;
        hash = hashCode(grade);
        grades[hash] = grade;

        System.out.println("Hash Table: " + Arrays.toString(grades));

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = keyboard.nextInt();
        hash = hashCode(number);
        if (number == grades[hash])
            System.out.println("The number " + number + " is in the array.");
        else
            System.out.println("The number " + number + " is not in the array.");
    }
}
