import java.util.LinkedList;

public class StringLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        System.out.println("The members of the list are:\n" + ll);
        ll.remove(2);
        System.out.println("The members of the list are:\n" + ll);
        ll.remove("Bob");
        System.out.println("The members of the list are:\n" + ll);

    }
}
