import java.util.Scanner;

public class VignereDecryption {

    public static String decrypt(String text, String key) {
        text = text.toLowerCase();
        key = key.toLowerCase();
        StringBuilder result = new StringBuilder();

        int keyIndex = 0;

        // Enhanced for loop over ciphertext characters
        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int shift = key.charAt(keyIndex) - 'a';
                // Reverse the shift (subtract instead of add)
                char dec = (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                result.append(dec);

                // Move to next key character
                keyIndex = (keyIndex + 1) % key.length();
            } else {
                // Keep spaces and punctuation unchanged
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type message to decode: ");
        String ciphertext = sc.nextLine();
        System.out.print("Type the key: ");
        String key = sc.nextLine();

        String decrypted = decrypt(ciphertext, key);
        System.out.println("Ciphertext : " + ciphertext);
        System.out.println("Key         : " + key);
        System.out.println("Decrypted   : " + decrypted);
    }
}
