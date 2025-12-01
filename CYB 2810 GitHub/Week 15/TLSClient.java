import javax.net.ssl.*;
import java.io.*;

public class TLSClient {
    public static void main(String[] args) throws Exception {

        // Trust all certificates for this demo (not for production!)
        SSLContext sc = SSLContext.getInstance("TLS");
        sc.init(null, new TrustManager[]{ new InsecureTrustManager() }, new java.security.SecureRandom());

        SSLSocketFactory sf = sc.getSocketFactory();
        SSLSocket socket = (SSLSocket) sf.createSocket("localhost", 8443);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Server says: " + in.readLine());

        socket.close();
    }

    // For demo only — trusts any certificate.
    private static class InsecureTrustManager implements X509TrustManager {
        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {}
        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {}
        public java.security.cert.X509Certificate[] getAcceptedIssuers() { return new java.security.cert.X509Certificate[0]; }
    }
}

