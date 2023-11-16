// Java program to demonstrate working of HashTable
import java.util.*;

class StudentGrades {
    private String name;
    private double grade;

    public StudentGrades(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public double getGrade() { return grade; }

    public String toString() {
        return (name + " " + grade);
    }
}

public class _E_HashMapLinkedList {
    static int hashCode(String name) {
        int g=2;
        int hash = 0;
        for (int i=0; i<name.length(); i++) {
            hash += name.charAt(i) * Math.pow(g, i);
        }
        hash = Math.abs(hash);
        hash = hash % 10;
        return hash;
    }

    public static void main(String args[])
    {
        int hash;
        LinkedList<StudentGrades> linkedList[] = new LinkedList[10];
        for (int idx = 0; idx < linkedList.length; idx++)
            linkedList[idx] = new LinkedList<>();

        StudentGrades student;
        student = new StudentGrades("Michael Scott", 89.0);
        hash = hashCode(student.getName());
        linkedList[hash].add(student);
        System.out.println(linkedList[hash]);

        student = new StudentGrades("Dwight Schrute", 76.0);
        hash = hashCode(student.getName());
        linkedList[hash].add(student);
        System.out.println(linkedList[hash]);

        student = new StudentGrades("Jim Halpert", 92.0);
        hash = hashCode(student.getName());
        linkedList[hash].add(student);
        System.out.println(linkedList[hash]);

        student = new StudentGrades("Pam Beesly", 97.0);
        hash = hashCode(student.getName());
        linkedList[hash].add(student);
        System.out.println(linkedList[hash]);

        System.out.println();
        for (int idx=0; idx < linkedList.length; idx++) {
            Iterator it = linkedList[idx].iterator();
            System.out.print(idx + " ");
            while (it.hasNext()) {
                student = ((StudentGrades) it.next());
                System.out.print(student + " | ");
            }
            System.out.println();
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String name = keyboard.nextLine();
        while (name != "") {
            boolean found = false;
            hash = hashCode(name);
            Iterator it = linkedList[hash].iterator();
            while (it.hasNext()) {
                student = ((StudentGrades) it.next());
                String n = student.getName();
                if (n.equals(name)) {
                    found = true;
                }
            }
            if (found)
                System.out.println(student);
            else
                System.out.println(name + " was not found.");

            System.out.print("Enter name: ");
            name = keyboard.nextLine();
        }
    }
}
