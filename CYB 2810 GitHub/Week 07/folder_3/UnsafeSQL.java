import java.sql.*;

public class UnsafeSQL {
    public static void main(String[] args) throws Exception {
        String user = args[0];
        String query = "SELECT * FROM users WHERE username='" + user + "'";
        // Vulnerable: SQL Injection
        System.out.println("Executing: " + query);
        // Fake execution (for demo)
    }
}
