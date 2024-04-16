import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String phrase = "big black bug bit a big black dog on his big black nose";

		String[] words = phrase.split("\\s+");

		Map<String, Integer> wordFrequency = new HashMap<>();

		for (String word : words) {
			word = word.toLowerCase();
			if (wordFrequency.containsKey(word)) {
				wordFrequency.put(word, wordFrequency.get(word) + 1);
			} else {
				wordFrequency.put(word, 1);
			}
		}

		System.out.println("Repeated words:");
		for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}
}
