import java.io.*;

public class FileAccess {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java FileAccess <path>");
            return;
        }
        // Insecure file access without validation
        FileInputStream fis = new FileInputStream(args[0]);
        int b;
        while ((b = fis.read()) != -1) {
            System.out.write(b);
        }
        fis.close();
    }
}
