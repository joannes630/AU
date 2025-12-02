import javax.crypto.Cipher;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

public class RSAExample {

    public static void main(String[] args) throws Exception {

        // -------- Generate RSA Key Pair --------
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048); // 2048-bit RSA keys
        KeyPair pair = keyGen.generateKeyPair();

        // Extract keys
        var publicKey = pair.getPublic();
        var privateKey = pair.getPrivate();

        // -------- Input Plaintext --------
        String plaintext = "Hello from RSA encryption in Java!";

        // -------- Encrypt with PUBLIC KEY --------
        Cipher encryptCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedBytes = encryptCipher.doFinal(plaintext.getBytes());

        String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);
        System.out.println("Ciphertext (Base64): " + encryptedBase64);

        // -------- Decrypt with PRIVATE KEY --------
        Cipher decryptCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        decryptCipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decryptedBytes = decryptCipher.doFinal(encryptedBytes);

        String decryptedText = new String(decryptedBytes);
        System.out.println("Decrypted: " + decryptedText);

        // -------- Display Keys (optional) --------
        System.out.println("Public Key (Base64): " + 
            Base64.getEncoder().encodeToString(publicKey.getEncoded()));

        System.out.println("Private Key (Base64): " + 
            Base64.getEncoder().encodeToString(privateKey.getEncoded()));
    }
}

