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
        System.out.print("Enter grade to search (-1 to end): ");
        int grade = keyboard.nextInt();
        while (grade != -1) {
            boolean found = false;
            int hash = hashCode(grade);
            while (grades[hash] != -1 && !found) {
                if (grade == grades[hash]) {
                    found = true;
                }
                hash++;
                if (hash >= grades.length)
                    hash = 0;

            }
            if (found)
                System.out.println("The number " + grade + " is in the array.");
            else
                System.out.println("The number " + grade + " is not in the array.");
            System.out.print("Enter grade to search (-1 to end): ");
            grade = keyboard.nextInt();
        }
        System.out.println();
    }

    static void removeGrade(Scanner keyboard, int grades[]) {
        System.out.print("Enter grade to remove (-1 to end): ");
        int grade = keyboard.nextInt();
        while (grade != -1) {
            boolean found = false;
            int hash = hashCode(grade);
            while (grades[hash] != -1 && !found) {
                if (grade == grades[hash]) {
                    found = true;
                }
                if (!found)
                    hash++;
                if (hash >= grades.length)
                    hash = 0;
            }

            if (found)
                grades[hash] = -2;
            else
                System.out.println("The number " + grade + " is not in the array.");
            printArray(grades);
            System.out.print("Enter grade to remove (-1 to end): ");
            grade = keyboard.nextInt();
        }
        System.out.println();
    }

    // -1 means this spot has never been used
    // -2 means this spot was used and removed
    static boolean checkForDuplicates(int grade, int grades[], int hash) {
        System.out.println(hash);
        while (grades[hash] != -1) {
            if (grade == grades[hash]) {
                System.out.println("Error: Cannot add duplicate item " + grade);
                return true;
            }
            hash++;
            if (hash >= grades.length)
                hash = 0;
        }
        return false;
    }
    static void add(int grade, int grades[]) {
        int hash = hashCode(grade);
        System.out.println(hash);
        boolean duplicate = checkForDuplicates(grade, grades, hash);

        if (!duplicate) {
            while (grades[hash] != -1 && grades[hash] != -2) {
                hash++;
                if (hash >= grades.length)
                    hash = 0;
            }

            grades[hash] = grade;
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
        // Make it hash to the same index 2
        add(92, grades);
        add(72, grades);
        // Add item that was already occupied (index 3)
        add(83, grades);
        // Try populate with a duplicate item
        add(83, grades);
        add(99, grades);
        add(89, grades);

        // Perform operations
        Scanner keyboard = new Scanner(System.in);
        printArray(grades);
        searchArray(keyboard, grades);
        removeGrade(keyboard, grades);
        searchArray(keyboard,grades);
        printArray(grades);
    }
}
