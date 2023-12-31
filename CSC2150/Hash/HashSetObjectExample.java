import java.util.Set;
import java.util.HashSet;

public class HashSetObjectExample {
    public static void main(String[] args) {
        // Creating a HashSet of Student objects
        Set<Student> studentSet = new HashSet<>();

        // Adding students to the set
        studentSet.add(new Student(1, "John Doe"));
        studentSet.add(new Student(2, "Jane Smith"));
        studentSet.add(new Student(3, "Bob Johnson"));

        // Adding a duplicate student (based on equals() and hashCode() implementation)
        studentSet.add(new Student(1, "John Doe"));

        // Displaying the elements in the set
        for (Student student : studentSet) {
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getName());
        }
    }
}
