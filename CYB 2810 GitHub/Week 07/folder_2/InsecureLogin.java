public class InsecureLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "P@ssw0rd"; // Hard-coded password
        if (args.length > 0 && args[0].equals(password)) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
    }
}
