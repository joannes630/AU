import java.io.File;
import java.util.Scanner;

public class InsecureDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filename to delete: ");
        String filename = sc.nextLine();

        // WARNING: concatenating user input directly into file paths is dangerous
        File f = new File("files/" + filename);

        if (f.exists()) {
            boolean ok = f.delete();
            System.out.println(ok ? "Deleted." : "Delete failed.");
        } else {
            System.out.println("File not found.");
        }
    }
}
