import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CaesarFileCipher {

    // Encrypt or decrypt file (same method, since Caesar is symmetric)
    public static void processFile(String inputPath, String outputPath, int key) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputPath);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            int data;
            while ((data = fis.read()) != -1) {
                int shifted = (data + key) & 0xFF; // wrap around 0–255
                fos.write(shifted);
            }
        }
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java CaesarFileCipher <encrypt|decrypt> <inputFile> <outputFile> <key>");
            return;
        }

        String mode = args[0];
        String inputFile = args[1];
        String outputFile = args[2];
        int key = Integer.parseInt(args[3]);

        // For decryption, reverse the shift
        if (mode.equalsIgnoreCase("decrypt")) {
            key = -key;
        }

        try {
            processFile(inputFile, outputFile, key);
            System.out.println("Operation completed successfully.");
            System.out.println("Mode : " + mode);
            System.out.println("Input: " + inputFile);
            System.out.println("Output: " + outputFile);
            System.out.println("Key   : " + (key & 0xFF));
        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}

