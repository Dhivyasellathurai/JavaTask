import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		String name = "botree";

		char[] obj = name.toCharArray();

		HashMap<Object, Integer> map = new HashMap<>();
		for (char c : obj) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Object, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + "," + entry.getValue());
		}

	}
}
