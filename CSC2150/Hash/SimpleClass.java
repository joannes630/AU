public class SimpleClass {
    private String str;

    public SimpleClass(String str) {
        this.str = str;
    }

    public int hashCode() {
        return str.length();
    }

    public String toString() {
        String value = "The string is " + str;
        return value;
    }

    public boolean equals(Object value) {
        SimpleClass _value = (SimpleClass) value;
        String _str = _value.str;
        return (str.equals(_str));
    }

    public static void main(String[] args) {
        SimpleClass value = new SimpleClass("Walter White");
        SimpleClass value2 = new SimpleClass("Walter White");
       System.out.println(value.hashCode());
       System.out.println(value2.hashCode());

       System.out.println(value);
       System.out.println(value2);

        if (value2.equals(value))
            System.out.println("Same");
        else
            System.out.println("Different");
    }
}