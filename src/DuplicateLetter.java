import java.util.HashMap;
import java.util.Map;

public class DuplicateLetter {

	public static void main(String[] args) {
		String str = "Hello, World!";
		findDuplicateCharacters(str);
	}

	public static void findDuplicateCharacters(String str) {
		Map<Character, Integer> charFrequencyMap = new HashMap<>();

		char[] chars = str.toCharArray();

		for (char ch : chars) {
			if (charFrequencyMap.containsKey(ch)) {
				charFrequencyMap.put(ch, charFrequencyMap.get(ch) + 1);
			} else {
				charFrequencyMap.put(ch, 1);
			}
		}

		System.out.println("Duplicate characters in the string '" + str + "':");
		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Occurance"+entry.getKey() + ": " + entry.getValue() + " occurrences");
			}
		}
	}
}
