public class ArrayStack
{
    private int [] s;  // Holds stack elements
    private int top;   // Stack top pointer

    public ArrayStack (int capacity)
    {
        s = new int[capacity];
        top = 0;
    }

    public boolean empty()
    {
        return top == 0;
    }

    public void push(int x)
    {
        if (top == s.length)
            throw new RuntimeException();
        else
        {
            s[top] = x;
            top ++;
        }
    }

    public int pop()
    {
        if (empty())
            throw new RuntimeException();
        else
        {
            top--;
            return s[top];
        }
    }

    public int peek()
    {
        if (empty())
            throw new RuntimeException();
        else
        {
            return s[top-1];
        }
    }

    public static void main(String [] arg)
    {
        String str;  // Use for output
        ArrayStack  st = new ArrayStack(5);
        str = "Pushing 10 20 onto the stack.";
        System.out.println(str);
        st.push(10);
        st.push(20);
        str = "Value at top of the stack is ";
        System.out.println(str + st.peek());
        str = "Popping and printing all values:";
        System.out.println(str);
        while (!st.empty())
            System.out.print(st.pop() + " ");
    }

}