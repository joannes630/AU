import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);

            String password = "mySecretPassword123";
            out.println(password);

            System.out.println("Password sent to server.");

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

