

import java.util.HashMap;
import java.util.Map;

public class FindOccuranceMap {
	public static void main(String[] args) {
		System.out.println("Hello dhivya");
		String str= "botree";
		occurance(str);
	}

	public static void occurance(String name) {
		char[] chars = name.toCharArray();
		Map<Character, Integer> mapping = new HashMap<>();
		for (char obj : chars) {
			if (mapping.containsKey(obj)) {
				mapping.put(obj, mapping.get(obj) + 1);
			} else {
				mapping.put(obj, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : mapping.entrySet()) {
			if (entry.getValue() >= 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
