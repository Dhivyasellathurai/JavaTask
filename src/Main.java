public class Main {
	public static void main(String[] args) {
		int number = 12321; 
		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome.");
		} else {
			System.out.println(number + " is not a palindrome.");
		}
	}

	public static boolean isPalindrome(int num) {
		int reversedNum = 0;
		int originalNum = num;

		while (num != 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}

		return originalNum == reversedNum;
	}

}
