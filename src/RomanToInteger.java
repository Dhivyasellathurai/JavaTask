import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		try (Scanner number = new Scanner(System.in)) {
			System.out.print("Enter a Roman numeral: ");
			String romanNumeral = number.nextLine();

			int result = romanToInt(romanNumeral);
			System.out.println("Integer value: " + result);
		}
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;
		int prev = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int current = map.get(s.charAt(i));
			if (current < prev) {
				result -= current;
			} else {
				result += current;
			}
			prev = current;
		}
		return result;
	}
}
