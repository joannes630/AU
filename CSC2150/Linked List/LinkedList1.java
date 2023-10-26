public class LinkedList1
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
           // Call the other (sister) constructor.
           this(val, null);
        }
    }

    private Node first;  // list head
    private Node last;   // last element in list

    public LinkedList1()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public int size()
    {
       int count = 0;
       Node p = first;
       while (p != null)
       {
           count ++;
           p = p.next;
       }
       return count;
    }

    public void add(String e)
    {
      if (isEmpty())
      {
          first = new Node(e);
          last = first;
      }
      else
      {
          last.next = new Node(e);
          last = last.next;
      }
    }

    public void add(int index, String e)
    {
         if (index < 0  || index > size())
         {
             String message = String.valueOf(index);
             throw new IndexOutOfBoundsException(message);
         }

         if (index == 0)
         {
             first = new Node(e, first);
             if (last == null)
                 last = first;
             return;
         }

         Node pred = first;
         for (int k = 1; k <= index - 1; k++)
         {
            pred = pred.next;
         }

         pred.next = new Node(e, pred.next);

         if (pred.next.next == null)
             last = pred.next;
    }

    public String toString()
    {
      StringBuilder strBuilder = new StringBuilder();

      Node p = first;
      while (p != null)
      {
         strBuilder.append(p.value + "\n");
         p = p.next;
      }
      return strBuilder.toString();
    }

    public String remove(int index)
    {
       if (index < 0 || index >= size())
       {
           String message = String.valueOf(index);
           throw new IndexOutOfBoundsException(message);
       }

       String element;  // The element to return
       if (index == 0)
       {
          element = first.value;
          first = first.next;
          if (first == null)
              last = null;
       }
       else
       {
          Node pred = first;

          for (int k = 1; k <= index -1; k++)
              pred = pred.next;

          element = pred.next.value;

          pred.next = pred.next.next;

          if (pred.next == null)
              last = pred;
       }
       return element;
    }

    public boolean remove(String element)
    {
       if (isEmpty())
           return false;

       if (element.equals(first.value))
       {
          first = first.next;
          if (first == null)
              last = null;
          return true;
       }

      Node pred = first;
      while (pred.next != null &&
             !pred.next.value.equals(element))
      {
          pred = pred.next;
      }

      if (pred.next == null)
          return false;

      pred.next = pred.next.next;

      if (pred.next == null)
          last = pred;

      return true;
    }

    public static void main(String [] args)
    {
        LinkedList1 ll = new LinkedList1();
        ll.add("Amy");
        ll.add("Bob");
        ll.add(0, "Al");
        ll.add(2, "Beth");
        ll.add(4, "Carol");
        System.out.println("The members of the list are:");
        System.out.print(ll);
    }
}