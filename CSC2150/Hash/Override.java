public class Override {
    String str;

    public Override(String str) {
        this.str = str;
    }

    public int hashCode() {
        int g=2;
        int hash = 0;
        for (int i=0; i<str.length(); i++) {
            hash += str.charAt(i) * Math.pow(g, i);
        }
        hash = Math.abs(hash);
        hash = hash % 10;
        return hash;
    }

    public String toString() {
        String value = "The string is " + str;
        return value;
    }

    public static void main(String[] args) {
//        String str = new String("John");
//        String str2 = new String("John");
//
//        if (str == str2)
//            System.out.println("Same");
//        else
//            System.out.println("Different");

        Override value = new Override("John");
        Override value2 = new Override("John");

        System.out.println(value.hashCode());
        System.out.println(value2.hashCode());

        System.out.println(value);
    }
}