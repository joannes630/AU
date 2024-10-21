// Java program to demonstrate working of HashTable
import java.util.*;

public class HashCollision {
    static int hashCode(int number) {
        int hash = number % 10;
        return hash;
    }

    static void search(int grade, int grades[]) {
        boolean found = false;
        int hash = hashCode(grade);
        while ((hash < grades.length) && grades[hash] != -1) {
            if (grade == grades[hash]) {
                found = true;
                break;
            }
            hash++;
        }
        if (found)
            System.out.println("The number " + grade + " is in the array.");
        else
            System.out.println("The number " + grade + " is not in the array.");
    }

    static void add(int grade, int grades[]) {
        int hash = hashCode(grade);
        while ((hash < grades.length) && (grades[hash] != -1)) {
            hash++;
        }
        if (hash < grades.length)
            grades[hash] = grade;
        else
            System.out.println("Error: Out of Bounds, Increase hash table.");
    }

    public static void main(String args[])
    {
        int grades[] = new int[10];
        for (int i=0; i<grades.length; i++) {
            grades[i] = -1;
        }

        // Populate our hash table
        add(97, grades);
        add(82, grades);
        add(0, grades);
        // Make it hash to the same index 2
        add(92, grades);
        add(72, grades);
        System.out.println("Hash Table: " + Arrays.toString(grades));

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = keyboard.nextInt();
        search(number, grades);

    }
}
