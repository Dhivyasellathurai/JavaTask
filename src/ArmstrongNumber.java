import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		if (isArmstrong(number))
			System.out.println(number + " is an Armstrong number.");
		else
			System.out.println(number + " is not an Armstrong number.");

		scanner.close();
	}

	public static boolean isArmstrong(int number) {
		int originalNumber, remainder, result = 0, n = 0;
		originalNumber = number;

		for (originalNumber = number; originalNumber != 0; originalNumber /= 10, ++n)
			;

		originalNumber = number;

		for (; originalNumber != 0; originalNumber /= 10) {
			remainder = originalNumber % 10;
			result += Math.pow(remainder, n);
		}

		if (result == number)
			return true;
		else
			return false;
	}
}
