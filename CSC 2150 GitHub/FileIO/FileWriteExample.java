import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("write_example.txt"))) {
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("This is a second line.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}