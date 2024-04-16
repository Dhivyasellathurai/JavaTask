package leetcode;

public class PalindromeCheck {

	public boolean isPalindrome(int x) {
		int sum = 0, digit = 0;
		int temp = x;
		while (x > 0) {
			digit = x % 10;
			sum = (sum * 10) + digit;
			x = x / 10;
		}
		if (temp == sum) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		PalindromeCheck object = new PalindromeCheck();
		Boolean result = object.isPalindrome(121);
		System.out.print(result);
	}
}
