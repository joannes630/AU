import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;
import java.util.Base64;

public class AESExample {

    public static void main(String[] args) throws Exception {

        // -------- Generate AES Key --------
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128); // 128-bit AES key
        SecretKey secretKey = keyGen.generateKey();

        // -------- Generate IV (Initialization Vector) --------
        byte[] iv = new byte[16]; // AES block size = 16 bytes
        SecureRandom random = new SecureRandom();
        random.nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // -------- Input Plaintext --------
        String plaintext = "Hello AES Encryption in Java!";

        // -------- Encrypt --------
        Cipher encryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        encryptCipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);
        byte[] ciphertext = encryptCipher.doFinal(plaintext.getBytes());

        // Encode ciphertext and IV to Base64 for readable output
        String cipherTextBase64 = Base64.getEncoder().encodeToString(ciphertext);
        String ivBase64 = Base64.getEncoder().encodeToString(iv);

        System.out.println("Plaintext: " + plaintext);
        System.out.println("IV (Base64): " + ivBase64);
        System.out.println("Ciphertext (Base64): " + cipherTextBase64);

        // -------- Decrypt --------
        Cipher decryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        decryptCipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);
        byte[] decryptedBytes = decryptCipher.doFinal(ciphertext);
        String decryptedText = new String(decryptedBytes);

        System.out.println("Decrypted: " + decryptedText);
    }
}

