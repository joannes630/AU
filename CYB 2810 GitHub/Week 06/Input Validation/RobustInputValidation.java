import java.util.Scanner;

public class RobustInputValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		while (true) {
			System.out.print("Enter age (0-120): ");
			while (!sc.hasNextInt()) {
				System.out.print("Enter age (0-120): ");
				sc.nextLine();
			}

			age = sc.nextInt();
			if (age >= 0 && age <= 120) {
				break;			
			}
			else {
				sc.nextLine();
			}
		}
		System.out.println("Age entered is " + age);
    }
}
