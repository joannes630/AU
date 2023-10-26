public class LinkedList0 
{
    private class Node
    {
        String value;
        Node next;
        
        Node(String val, Node n)
        {
            value = val;
            next = n;
        }
        
        Node(String val)
        {
            value = val;
            next = null;
        }
    }

    private Node first = null;

    public LinkedList0()
    {
      first = new Node("Debby");
      first.next = new Node("Elaine");
      first.next.next = new Node ("Fred");
      first = new Node ("Chuck", first);

      String [ ] names = {"Bob", "Allan"};

      for (String s : names)
          first = new Node(s, first);
    } 
    
    public void print()
    {
       Node ref = first;                     
       while (ref!= null)
       {
          System.out.print(ref.value + " ");
          ref = ref.next;
       }    
    }
    
    public static void main(String [] args)
    {
       LinkedList0 ll = new LinkedList0();
       String str = "The contents of the list are:";
       System.out.println(str);
       ll.print();
    }
}