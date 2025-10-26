import java.util.Scanner;

public class CaesarCipherEncode {
    public static String encodeCaesar(String text, int shift) {
        text = text.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                int offset = (ch - 'a' + shift) % 26;
                if (offset < 0) 
                    offset += 26;
                char cipher = (char) ('a' + offset);
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

        System.out.print("Enter shift value (e.g., 3): ");
        int shift = sc.nextInt();
        sc.close();

        String ciphertext = encodeCaesar(plaintext, shift);

        System.out.println("\nPlaintext : " + plaintext.toLowerCase());
        System.out.println("Shift     : " + shift);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
