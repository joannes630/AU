package CommandInjection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SecureCommandExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a directory to list: ");
        String dir = scanner.nextLine();

        try {
            // Use ProcessBuilder with arguments, not shell command strings
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir", dir); // "cmd", "/c", "dir", dir for Windows
            pb.redirectErrorStream(true);
            Process process = pb.start();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream())
            );

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
