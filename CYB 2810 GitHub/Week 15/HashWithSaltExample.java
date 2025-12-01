import java.security.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

public class HashWithSaltExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to hash: ");
        String password = sc.nextLine();


        // 1. Generate random 16-byte salt
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        // 2. Hash salt + password
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt);   // include salt first
        byte[] hash = md.digest(password.getBytes(StandardCharsets.UTF_8));

        // 3. Encode salt + hash so you can store them
        String saltBase64 = Base64.getEncoder().encodeToString(salt);
        String hashBase64 = Base64.getEncoder().encodeToString(hash);

        System.out.println("Salt (Base64): " + saltBase64);
        System.out.println("Hash (Base64): " + hashBase64);
    }
}

