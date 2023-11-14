import java.util.*; 

public class ArrayQueue
{
    private String [ ] q; // Holds queue elements
    private int front;    // Next item to be removed
    private int rear;     // Next slot to fill
    private int size;     // Number of items in queue   
    
    ArrayQueue(int capacity)
    {
        q = new String[capacity];
        front = 0; 
        rear = 0;
        size = 0;
    }
    
    public int capacity()
    {
        return q.length;
    }
    
    public void enqueue(String s)
    {
       if (size == q.length)
           throw new RuntimeException();
       else
       {
           size ++;
           q[rear] = s;
           rear ++;
           if (rear == q.length) rear = 0;           
       }
    }
    
    public String peek()
    {
        if (empty())
             throw new RuntimeException();
        else
             return q[front];
    }
    
    public String dequeue()
    {
        if (empty())
            throw new RuntimeException();
        else
        {
           size --;
           String value = q[front];
           q[front] = null;     
           front++;
           if (front == q.length) front = 0;
			         
           return value;        
        }
    }
    
    public boolean empty()
    {
        return size == 0;
    }
    
    public String toString()
    {
      StringBuilder sBuilder = new StringBuilder();
      sBuilder.append("front = " + front + "; ");
      sBuilder.append("rear = " + rear + "\n");
      for (int k = 0; k < q.length; k++)
      {
          if (q[k] != null)
             sBuilder.append(k + " " + q[k]);
          else 
             sBuilder.append(k + " ?");
          if (k != q.length - 1)
			    sBuilder.append("\n");
      }
      return sBuilder.toString();        
    }    

    public static void main(String [] args)
    {    
        String str;  // Holds various string values
            
       ArrayQueue queue = new ArrayQueue(4);
         str = "Queue has capacity ";
         System.out.println(str + queue.capacity());
       
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
       
       // Add a name
       System.out.println("Adding the name Elaine:");
       queue.enqueue("Elaine");
       System.out.println("State of queue is: ");
       System.out.println(queue);       
    }        
}