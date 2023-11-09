public class ArrayStackString
{
    private String [] s;  // Holds stack elements
    private int top;   // Stack top pointer

    public ArrayStackString (int capacity)
    {
        s = new String[capacity];
        top = 0;
    }

    public boolean empty()
    {
        return top == 0;
    }

    public void push(String x)
    {
        if (top == s.length)
            throw new RuntimeException();
        else
        {
            s[top] = x;
            top ++;
        }
    }

    public String pop()
    {
        if (empty())
            throw new RuntimeException();
        else
        {
            top--;
            return s[top];
        }
    }

    public String peek()
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
        ArrayStackString  st = new ArrayStackString(5);
        str = "Pushing 10 20 onto the stack.";
        System.out.println(str);
        st.push("Moe");
        st.push("Larry");
        str = "Value at top of the stack is ";
        System.out.println(str + st.peek());
        str = "Popping and printing all values:";
        System.out.println(str);
        while (!st.empty())
            System.out.print(st.pop() + " ");
    }

}