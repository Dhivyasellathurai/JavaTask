
public class FindVowels {
	public static void main(String[] args) {
		String name = "dhivya";
		Boolean result = name.toLowerCase().matches(".*[aeoiu]*.");
		System.out.println(result);
		char[] chars = name.toCharArray();
		String vowel = "aeoiu";
		char[] char2 = vowel.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < char2.length; j++) {
				if (chars[i] == char2[j]) {
					System.out.print(chars[i]);
				}
			}
		}
	}
}