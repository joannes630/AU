// Java program to demonstrate working of HashTable
import java.util.*;

import static java.lang.System.exit;

public class _D_HashSetString {
    static int hashCode(String name) {
        int g=2;
        int hash = 0;
        for (int i=0; i<name.length(); i++) {
            hash += name.charAt(i) * Math.pow(g, i);
        }
        hash = Math.abs(hash);
        hash = hash % 10;
        System.out.println(name + " : Hash: " + hash);
        return hash;
    }

    static void printArray(String array[]) {
        for (int i=0; i<array.length; i++) {
            if (array[i] == null)
                System.out.println(i + ": ");
            else
                System.out.println(i + ": " + array[i]);
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        int hash;
        String name;
        String names[] = new String[10];

        name = "Michael Scott";
        hash = hashCode(name);
        names[hash] = name;

        name = "Dwight Schrute";
        hash = hashCode(name);
        names[hash] = name;

        name = "Jim Halpert";
        hash = hashCode(name);
        names[hash] = name;
        System.out.println();

        printArray(names);

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = keyboard.nextLine();
        while (!name.equals("")) {
            hash = hashCode(name);
            if (name.equals(names[hash]))
                System.out.println("The name " + name + " is in the array.");
            else
                System.out.println("The name " + name + " is not in the array.");
            System.out.print("Enter name: ");
            name = keyboard.nextLine();
        }
    }
}
