import java.util.Scanner;

public class AtBashCipher {
    public static String encodeAtbash(String text) {
        text = text.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                char cipher = (char) ('z' - (ch - 'a'));
                result.append(cipher);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type message to encode: ");
        String plaintext = sc.nextLine();
        sc.close();
        String ciphertext = encodeAtbash(plaintext);

        System.out.println("Plaintext : " + plaintext.toLowerCase());
        System.out.println("Ciphertext: " + ciphertext);
    }
}
