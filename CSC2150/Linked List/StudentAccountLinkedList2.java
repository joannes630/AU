import java.util.LinkedList;

class Student{
    private String name;
    private char letterGrade;

    public Student(String name, char letterGrade){
        this.name = name;
        this.letterGrade = letterGrade;
    }

    public String getName(){
        return name;
    }
    public char getLetterGrade(){
        return letterGrade;
    }
}

public class StudentAccountLinkedList2 {

    private LinkedList<Student> doublyLinkedList = new LinkedList<>();

    public void addStudent(String name, char letterGrade) {
        Student student = new Student(name, letterGrade);
        doublyLinkedList.add(student);
    }

    public int size() {
        return doublyLinkedList.size();
    }

    public boolean isFound(String name) {
        for (Student student : doublyLinkedList) {
            if (student.getName().equals(name))
                return true;
        }
        return false;
    }

    public int countGreaterThanOrEqualTo(char letterGrade) {
        int count = 0;
        for (Student student : doublyLinkedList) {
            if (student.getLetterGrade() <= letterGrade)
                count++;
        }
        return count;
    }

    public String removeElement(int index) {
        if (index < 0 || index >= doublyLinkedList.size())
        {
            String message = String.valueOf(index);
            throw new IndexOutOfBoundsException(message);
        }

        String target = doublyLinkedList.get(index).getName() + " " + doublyLinkedList.get(index).getLetterGrade();
//        String target = String.format("(%s, %c)", doublyLinkedList.get(index).getName(),
//                doublyLinkedList.get(index).getLetterGrade());
        doublyLinkedList.remove(index);
        return target;
    }

    public String toString(){
        String str = "";
        for (Student student : doublyLinkedList)
            str += String.format("%s  %c\n", student.getName(), student.getLetterGrade());
        return str;
    }

    public void removeAll() {
        doublyLinkedList.clear();
    }

    public static void main(String[] args) {
        StudentAccountLinkedList2 studentList = new StudentAccountLinkedList2();
        studentList.addStudent("Tony Stark", 'A');
        studentList.addStudent("Steve Rogers", 'C');
        studentList.addStudent("Bruce Banner", 'B');
        System.out.println(studentList);

        System.out.println("Size of the doubly linked list is " + studentList.size());
        String name = "Steve Rogers";
        if (studentList.isFound(name))
            System.out.printf("%s is in the doubly linked list\n", name);
        else
            System.out.printf("%s is not in the doubly linked list\n", name);

        char letterGrade = 'B';
        System.out.printf("Number of accounts with grades of %c or better is %d\n",
                letterGrade, studentList.countGreaterThanOrEqualTo(letterGrade));

        System.out.printf("Remove element with index 1: %s\n", studentList.removeElement(1));
        System.out.println("The elements of the list are: ");
        System.out.println(studentList);

        System.out.println("Entire list will be removed:");
        studentList.removeAll();
        System.out.println("Size of the doubly linked list is " + studentList.size());
    }
}


