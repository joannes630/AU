class LinkedStack
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

    private Node top = null;  // Top of the stack

    public boolean empty()
    {
        return top == null;
    }

    public void push(String s)
    {
        top = new Node(s, top);
    }

    public String pop()
    {
        if (empty())
            throw new RuntimeException();
        else
        {
            String retValue = top.value;
            top = top.next;
            return retValue;
        }
    }

    public String peek()
    {
        if (empty())
            throw new RuntimeException();
        else
            return top.value;
    }

    public String toString()
    {
        StringBuilder sBuilder = new StringBuilder();
        Node p = top;
        while (p != null)
        {
            sBuilder.append(p.value);
            p = p.next;
            if (p != null)
                sBuilder.append("\n");
        }
        return sBuilder.toString();
    }

    public static void main(String [ ] args)
    {
        LinkedStack st = new LinkedStack();
        System.out.println("Pushing: Amy Bob Chuck");
        System.out.println("Contents of Stack:");
        st.push("Amy");
        st.push("Bob");
        st.push("Chuck");
        System.out.println(st);
        String name = st.pop();
        System.out.println("Popped: " + name);
        System.out.println("Contents of Stack:");
        System.out.println(st);
    }
}