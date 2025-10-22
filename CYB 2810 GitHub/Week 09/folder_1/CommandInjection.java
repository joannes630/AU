import java.io.*;

public class CommandInjection {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: java CommandInjection <filename>");
            return;
        }
        // Dangerous: user input directly in system command
        Runtime.getRuntime().exec("cat " + args[0]);
    }
}
