import java.nio.file.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class SecureDelete {
    // Example allow-list (only these files may be deleted)
    private static final Set<String> ALLOWED_FILES = Set.of("temp1.txt", "temp2.log");

    // Example app-level permission check (in real apps use RBAC/ACL)
    private static boolean hasDeletePermission(String username, String filename) {
        // Simplified: only admin can delete files, or allow certain users
        return "admin".equals(username);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.nextLine().trim();
        System.out.print("Enter filename to delete (basename only): ");
        String filename = sc.nextLine().trim();

        // Quick sanity: require a basename (no path separators)
        if (filename.isBlank() || filename.contains("..") || filename.contains("/") || filename.contains("\\")) {
            System.out.println("Invalid filename.");
            return;
        }

        if (!hasDeletePermission(username, filename)) {
            System.out.println("Access denied: insufficient privileges.");
            return;
        }

        if (!ALLOWED_FILES.contains(filename)) {
            System.out.println("Not permitted to delete that file.");
            return;
        }

        try {
            Path base = Paths.get("files").toRealPath(LinkOption.NOFOLLOW_LINKS);
            Path requested = base.resolve(filename).normalize();

            // Ensure the resolved real path starts with the base directory
            Path requestedReal = requested.toRealPath(LinkOption.NOFOLLOW_LINKS);

            if (!requestedReal.startsWith(base)) {
                System.out.println("Access denied: outside allowed directory.");
                return;
            }

            // Perform delete in a safe, checked way
            boolean deleted = Files.deleteIfExists(requestedReal);
            System.out.println(deleted ? "Deleted safely." : "File not found or not deleted.");

            // Note: In production, log the operation to secure audit logs (not to stdout)
        } catch (NoSuchFileException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error occurred.");
            // Log the exception details to a secure log for operators
        }
    }
}
