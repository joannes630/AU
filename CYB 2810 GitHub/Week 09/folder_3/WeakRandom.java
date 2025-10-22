import java.util.Random;

public class WeakRandom {
    public static void main(String[] args) {
        Random rand = new Random(); // Predictable PRNG
        int otp = rand.nextInt(1000000);
        System.out.println("Generated OTP: " + otp);
    }
}
