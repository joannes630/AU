import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SecureFileAccess {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename to read: ");
        String filename = scanner.nextLine();

        // Validate filename format (only letters, numbers, hyphens, underscores)
        if (!filename.matches("[\\w\\-.]+")) {
            System.out.println("Invalid filename.");
            return;
        }
        File file = new File("files/" + filename);

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found or cannot be accessed.");
        }
    }
}