package Quiz5;

import java.util.Arrays;

public class Question1 {
    static void initialize(int[] grades) {
        // Write the missing code to initialize the hash table
        for (int i=0; i<grades.length; i++) {
            grades[i] = -1;
        }
    }

    static int hashCode(int[] grades, int number) {
        // Write the missing code to generate a simple hash key using the table size
        int index = number % grades.length;
        return index;
    }

    public static void main(String[] args) {
        int[] grades = new int[10];

        initialize(grades);
        int grade = 97;
        int hash = hashCode(grades, grade);
        grades[hash] = grade;
        System.out.println(Arrays.toString(grades));
    }
}