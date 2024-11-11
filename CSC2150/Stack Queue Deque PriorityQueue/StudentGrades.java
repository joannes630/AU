import java.util.PriorityQueue;
import java.util.Comparator;

class Student {
    String name;
    double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        // Create a max-heap priority queue for students based on grades
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(
            Comparator.comparingDouble(Student::getGrade).reversed()
        );

        // Add students to the queue
        studentQueue.add(new Student("Alice", 85.0));
        studentQueue.add(new Student("Bob", 92.5));
        studentQueue.add(new Student("Charlie", 78.0));
        studentQueue.add(new Student("Diana", 88.5));
        studentQueue.add(new Student("Edward", 95.0));

        // Print the top three students with the highest grades
        System.out.println("Top three students:");
        for (int i = 0; i < 3 && !studentQueue.isEmpty(); i++) {
            System.out.println(studentQueue.poll());
        }
    }
}
