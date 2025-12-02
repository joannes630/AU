import javax.crypto.Mac;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class HMACExample {

    public static void main(String[] args) throws Exception {

        // -------- Generate HMAC Key --------
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");
        SecretKey hmacKey = keyGen.generateKey();

        // -------- Input Message --------
        String message = "Hello from CYB 2810!";

        // -------- Compute HMAC --------
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(hmacKey);
        byte[] hmacBytes = mac.doFinal(message.getBytes());

        // Encode to Base64 for readable output
        String hmacBase64 = Base64.getEncoder().encodeToString(hmacBytes);
        String keyBase64 = Base64.getEncoder().encodeToString(hmacKey.getEncoded());

        System.out.println("Message: " + message);
        System.out.println("HMAC Key (Base64): " + keyBase64);
        System.out.println("HMAC-SHA256 (Base64): " + hmacBase64);
    }
}

