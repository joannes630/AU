package CommandInjection;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InsecureCommandExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a directory to list: ");
        String dir = scanner.nextLine();

        try {
            // Vulnerable: user input is passed directly to the shell
            // choice /M "Do you want to restart the computer?" && shutdown /r /t 0
            String command = "cmd /c dir " + dir; // For Windows, use "cmd /c dir " + dir
            Process process = Runtime.getRuntime().exec(command);

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
