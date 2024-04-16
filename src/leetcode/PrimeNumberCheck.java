package leetcode;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		int num = 20;
		if (num <= 1) {
			System.out.print(false);
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {

			if (num % i == 0) {
				System.out.println(false);

			}
		}
	}
}
