// Java program to demonstrate working of HashTable
import java.util.*;

public class _C_HashSetCollission {
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

    static void searchArray(Scanner keyboard, int grades[]) {
        System.out.print("Enter grade to search: ");
        int grade = keyboard.nextInt();
        while (grade != -1) {
            boolean found = false;
            int hash = hashCode(grade);
            if (grade == grades[hash])
                found = true;
            else {
                while ((hash < grades.length) && grades[hash] != -1) {
                    if (grade == grades[hash]) {
                        found = true;
                        break;
                    }
                    hash++;
                }
            }
            if (found)
                System.out.println("The number " + grade + " is in the array.");
            else
                System.out.println("The number " + grade + " is not in the array.");
            System.out.print("Enter number: ");
            grade = keyboard.nextInt();
        }
    }

    static void removeGrade(Scanner keyboard, int grades[]) {
        System.out.print("Enter grade to remove: ");
        int grade = keyboard.nextInt();
        while (grade != -1) {
            boolean found = false;
            int hash = hashCode(grade);
            if (grade == grades[hash])
                found = true;
            else {
                hash++;
                while ((hash < grades.length) && grades[hash] != -1) {
                    if (grade == grades[hash]) {
                        found = true;
                        break;
                    }
                }
            }
            if (found)
                grades[hash] = -2;
            else
                System.out.println("The number " + grade + " is not in the array.");
            printArray(grades);
            System.out.print("Enter number: ");
            grade = keyboard.nextInt();
        }
    }

    // -1 means this spot has never been used
    // -2 means this spot was used and removed
    static boolean checkForDuplicates(int grade, int grades[], int hash) {
        while ((hash < grades.length) && grades[hash] != -1) {
            if (grade == grades[hash]) {
                System.out.println("Error: Cannot add duplicate item " + grade);
                return true;
            }
            hash++;
        }
        return false;
    }
    static void add(int grade, int grades[]) {
        int hash = hashCode(grade);
        boolean duplicate = checkForDuplicates(grade, grades, hash);

        if (!duplicate) {
            while ((hash < grades.length) && (grades[hash] != -1 && grades[hash] != -2)) {
                hash++;
            }
            if (hash < grades.length)
                grades[hash] = grade;
            else
                System.out.println("Error: Out of Bounds, Increase hash table.");
        }
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
        // Add item that was already occupied (index 3)
        add(83, grades);
        // Try populate with a duplicate item
        add(83, grades);

        // Perform operations
        Scanner keyboard = new Scanner(System.in);
        printArray(grades);
        searchArray(keyboard, grades);
        removeGrade(keyboard, grades);
        searchArray(keyboard,grades);
        printArray(grades);
    }
}
