public class DLinkedList
{
    private class Node
    {
        String value;
        Node next;
        Node prev;      // Previous element in the list

        Node(String val, Node n, Node p)
        {
            value = val;
            next = n;
            prev = p;
        }

        Node(String val)
        {
           // Call the other (sister) constructor.
           this(val, null, null);            
        }
    }

    private Node first;  // list head
    private Node last;   // last element in list

    public DLinkedList()
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
          last.next = new Node(e, null, last);
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
             Node p = first;
             first = new Node(e, p, null);
             if (p != null)
                 p.prev = first;             
             if (last == null)
                 last = first;
             return;
         }

         Node pred = first;
         for (int k = 1; k <= index - 1; k++)
         {
            pred = pred.next;
         }

         Node succ = pred.next;
         Node middle = new Node(e, succ, pred);
         pred.next = middle;  
         if (succ == null)             
             last = middle;       
         else            
             succ.prev = middle;                     
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

       Node target = first;
       for (int k = 1; k <= index; k++)
           target = target.next;
       
       String element = target.value;  // Element to return
       Node pred = target.prev;        // Node before the target
       Node succ = target.next;        // Node after the target
       
       if (pred == null)
           first = succ;
       else
           pred.next = succ;
       
       if (succ == null)
           last = pred;
       else
           succ.prev = pred;
       
       return element;        
    }
    
    public boolean remove(String element)
    {
       if (isEmpty())
           return false;

       Node target = first;
       while (target != null 
               && !element.equals(target.value))
           target = target.next;
       
       if (target == null)
           return false;       
      
       Node pred = target.prev;        // Node before the target
       Node succ = target.next;        // Node after the target
       
       if (pred == null)
           first = succ;
       else
           pred.next = succ;
       
       if (succ == null)
           last = pred;
       else
           succ.prev = pred;      
    
        return true;       
    }
    
    public static void main(String [] args)
    {
        DLinkedList ll = new DLinkedList();
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