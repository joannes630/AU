public class DebugLogger {
    public static void main(String[] args) {
        String user = "student";
        String token = "secretToken123";
        // Should not log sensitive data
        System.out.println("DEBUG: User=" + user + ", Token=" + token);
    }
}
