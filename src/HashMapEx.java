import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		String name = "botree";

		char[] obj = name.toCharArray();

		HashMap<Object, Integer> map = new HashMap<>();
		for (char c : obj) {
			if(map.containsKey(c)) {
			map.put(c, map.get(c) + 1);
			}else {
				map.put(c, 1);
			}
		}

		for (Map.Entry<Object, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + "," + entry.getValue());
		}

	}
}
