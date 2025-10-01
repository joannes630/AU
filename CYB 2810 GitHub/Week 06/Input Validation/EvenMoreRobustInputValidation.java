import java.util.Scanner;

public class EvenMoreRobustInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = -1;

        while (true) {
            System.out.print("Enter age (0-120): ");
            String input = sc.nextLine().trim();  // read full line

            if (input.isEmpty()) {
                System.out.println("Error: Input cannot be empty.");
                continue;  // ask again
            }

            try {
                age = Integer.parseInt(input);  // attempt conversion
                if (age >= 0 && age <= 120) {
                    break;  // valid input → exit loop
                } else {
                    System.out.println("Error: Age must be between 0 and 120.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            }
        }

        System.out.println("Age entered is " + age);
        sc.close();
    }
}
