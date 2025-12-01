import javax.net.ssl.*;
import java.io.*;
import java.security.KeyStore;

public class TLSServer {
    public static void main(String[] args) throws Exception {
        // Load server keystore
        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(new FileInputStream("server.keystore"), "password".toCharArray());

        // Create key manager factory
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(ks, "password".toCharArray());

        // Create TLS context
        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(kmf.getKeyManagers(), null, null);

        // Create TLS server socket
        SSLServerSocketFactory ssf = sc.getServerSocketFactory();
        SSLServerSocket serverSocket = (SSLServerSocket) ssf.createServerSocket(8443);

        System.out.println("TLS Server running on port 8443...");

        while (true) {
            SSLSocket client = (SSLSocket) serverSocket.accept();
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            out.write("mySecretPassword123");
            out.flush();
            client.close();
        }
    }
}


