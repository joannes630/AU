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

class Node {
    public Student data;
    public Node next ;
    public Node prev ;

    Node(Student data, Node n, Node p ) {
        this.data = data;
        next = n;
        prev = p;
    }

    Node(Student data) {
        this(data, null, null);
    }
}

public class StudentAccountLinkedList {

    private Node first;
    private Node last;

    public StudentAccountLinkedList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        int count=0;
        Node p = first;

        while(p != null){
            count++;
            p = p.next;
        }

        return count;
    }

    public void addHead(String name, char letterGrade){
        Student student = new Student(name, letterGrade);

        if(isEmpty()){
            last = new Node(student);
            first = last;
        }
        else{
            Node p = first;
            first = new Node(student, p, null);
            if (p != null)
                p.prev = first;
            if (last == null)
                last = first;
        }
    }

    public void addTail(String name, char letterGrade){
        Student student = new Student(name, letterGrade);
        if(isEmpty()){
            last = new Node(student);
            first = last;
        }
        else{
            last.next = new Node(student,null,last);
            last = last.next;
        }
    }

    public void add(int n, String name, char letterGrade){
        Student student = new Student(name, letterGrade);
        if (n < 0  || n > size()) {
            String message = String.valueOf(n);
            throw new IndexOutOfBoundsException(message);
        }

        if(n == 0){
            Node p = first;
            first = new Node(student, p, null);
            if (p != null)
                p.prev = first;
            if (last == null)
                last = first;
        }
        else{
            Node pred = first;
            for (int i = 1; i <= n-1; i++)
            {
                pred = pred.next;
            }

            Node succ = pred.next;
            Node middle = new Node(student, succ, pred);

            pred.next = middle;
            if(succ == null){
                last = middle;
            }
            else{
                succ.prev = middle;
            }
        }
    }

    public boolean isFound(String name){
        boolean found =false;
        Node p = first;

        while(p != null){

            if (p.data.getName().equals(name)) {
                found = true;
                break;
            }
            p = p.next;
        }

        return found;
    }

    public int countGreaterOrEqualTo(char letterGrade){
        int count=0;
        Node p =first;

        while(p != null){
            if (p.data.getLetterGrade() <= letterGrade ){
                count++;
            }
            p = p.next;
        }

        return count;
    }

    public void removeAll(){
        if(isEmpty()){
            return;
        }
        first = null;
        last = null;
    }

    public String removeElement(int x){
        if (x < 0 || x >= size())
        {
            String message = String.valueOf(x);
            throw new IndexOutOfBoundsException(message);
        }

        Node element = first;
        for (int k = 1; k <= x; k++)
            element = element.next;
        String target = String.format("(%s, %c)", element.data.getName(), element.data.getLetterGrade());
        Node pred = element.prev;
        Node succ = element.next;

        if (pred == null)
            first = succ;
        else
            pred.next = succ;

        if (succ == null)
            last = pred;
        else
            succ.prev = pred;
        return target;
    }

    public String toString(){
        String str = "";
        Node p = first;
        while (p != null) {
            str += String.format("%s  %c\n", p.data.getName(), p.data.getLetterGrade());
            p = p.next;
        }
        return str;
    }

    public static void main(String[] args){
        StudentAccountLinkedList studentAccount = new StudentAccountLinkedList();

        studentAccount.addTail("Tony Stark", 'A');
        studentAccount.addTail("Steve Rogers", 'C');
        studentAccount.addHead("Bruce Banner", 'B');

        System.out.println("The elements of the list are: ");
        System.out.println(studentAccount);

        System.out.println("Size of the doubly linked list is " + studentAccount.size());
        String name = "Steve Rogers";
        if (studentAccount.isFound(name))
            System.out.printf("%s is in the doubly linked list\n", name);
        else
            System.out.printf("%s is not in the doubly linked list\n", name);

        char letterGrade = 'A';
        System.out.printf("Number of accounts with grades of %c or better is %d\n",
                letterGrade, studentAccount.countGreaterOrEqualTo(letterGrade));

        System.out.printf("Remove element with index 1: %s\n", studentAccount.removeElement(1));
        System.out.println("The elements of the list are: ");
        System.out.println(studentAccount);

        System.out.println("Entire list will be removed:");
        studentAccount.removeAll();
        System.out.println("Size of the doubly linked list is " + studentAccount.size());
    }
}


