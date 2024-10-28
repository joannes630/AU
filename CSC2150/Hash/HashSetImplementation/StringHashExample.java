package Hash.HashSetImplementation;
public class StringHashExample {

    // A simple hash function for strings
    public static int hashString(String str) {
        int hash = 0;
        int prime = 31; // A prime multiplier to help distribute hash values uniformly

        // Traverse through each character of the string
        for (int i = 0; i < str.length(); i++) {
            hash = prime * hash + str.charAt(i); // Polynomial rolling hash
        }

        return hash;
    }

    public static void main(String[] args) {
        String str = "Hello";
        int hashValue = hashString(str);

        System.out.println("Hash value of the string '" + str + "' is: " + hashValue);
    }
}