import java.security.MessageDigest;

public class InsecureHash {
    public static void main(String[] args) throws Exception {
        String Password = "hello123";
        // Weak hash algorithm
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(Password.getBytes());
        byte[] digest = md.digest();
        System.out.println("Hash: " + new String(digest));
    }
}
