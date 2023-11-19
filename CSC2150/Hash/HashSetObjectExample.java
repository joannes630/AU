import java.util.HashSet;

class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId == student.studentId;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(studentId);
    }
}

public class HashSetObjectExample {
    public static void main(String[] args) {
        // Creating a HashSet of Student objects
        HashSet<Student> studentSet = new HashSet<>();

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
