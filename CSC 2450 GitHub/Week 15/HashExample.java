import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class HashExample {

    public static void main(String[] args) {
        try {
            // Ask user for input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to hash: ");
            String input = sc.nextLine();

            // SecureRandom random = new SecureRandom();
            // byte[] salt = new byte[16];   // 16 bytes = 128-bit salt (typical)
            // random.nextBytes(salt);

            // Create MessageDigest instance using SHA-256 algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            // md.update(salt);  // add salt first

            // Compute the hash (digest)
            byte[] digest = md.digest(input.getBytes());
            // byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));

            // Convert hash bytes to hex string for display
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println("SHA-256 Hash: " + hexString.toString());

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}

