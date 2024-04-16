package leetcode;

public class SumNumber {
	public static void main(String[] args) {
		int[] n = { 2, 7, 11, 15 };
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = 1; j < n.length; j++) {
				if (n[i] + n[j] == 9) {
					System.out.println("Output is " + i + "," + j);
				}
			}
		}
	}
}

