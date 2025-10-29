import java.util.Scanner;

public class VignereEncryption {

    public static String encrypt(String text, String key) {
        text = text.toLowerCase();
        key = key.toLowerCase();
        StringBuilder result = new StringBuilder();

        int keyIndex = 0;

        // Enhanced for loop over characters of text
        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int shift = key.charAt(keyIndex) - 'a';
                char enc = (char) ((ch - 'a' + shift) % 26 + 'a');
                result.append(enc);

                // Move to next letter in key
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                // Preserve spaces and punctuation
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type message to encode: ");
        String plaintext = sc.nextLine();
        System.out.print("Type the key: ");
        String key = sc.nextLine();

        String encrypted = encrypt(plaintext, key);
        System.out.println("Plaintext : " + plaintext);
        System.out.println("Key        : " + key);
        System.out.println("Ciphertext : " + encrypted);
    }
}
