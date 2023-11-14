public class LinkedQueue
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
    }

    private Node front = null; 
    private Node rear = null;                                     
    
    
    public void enqueue(String s)
    {
        if (rear != null)
        {
           rear.next = new Node(s, null);
           rear = rear.next;
        }
        else
        {
            rear = new Node(s, null);
            front = rear;
        }
    }
    
    public boolean empty()
    {
        return front == null;
    }
    
    public String peek()
    {
        if (empty())
            throw new RuntimeException();
        else
            return front.value;        
    }
    
    public String dequeue()
    {
       if (empty()) 
           throw new RuntimeException();
       else
       {
           String value = front.value;
           front = front.next;
           if (front == null) 
              rear = null;    
           return value;
       }
    }
    
    public String toString()
    {
       StringBuilder sBuilder = new StringBuilder();
       
       // Walk down the list and append all values
       Node p = front;
       while (p != null)
       {
           sBuilder.append(p.value + " ");
           p = p.next;
       }
       return sBuilder.toString();        
    }

    public static void main(String [] args)
    {
        LinkedQueue queue = new LinkedQueue();
        
        // Add 4 names
       String [ ] names = {"Alfonso", "Bob", "Carol", "Deborah"};
       System.out.println("Adding names: ");
       for (String s : names)
       {
           System.out.print(s + " ");
           queue.enqueue(s);         
       }
       
       System.out.println("\nState of queue is: ");
       System.out.println(queue);
       
       // Remove 2 names
       System.out.println("Removing 2 names.");
       queue.dequeue(); queue.dequeue();   
       System.out.println("State of queue is: ");
       System.out.println(queue);
       
       // Add another name
       System.out.println("Adding the name Elaine:");
       queue.enqueue("Elaine");
       System.out.println("State of queue is: ");
       System.out.println(queue);      
    }
}