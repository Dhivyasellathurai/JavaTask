
public class RecursionExample {

	public static int sum(int k) {
		if (k > 0) {
			return k + sum(k - 1);
		} else {
			return 0;
		}
	}

	public static int sum(int x, int y) {
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		if (max > min) {
			return max + sum(min, max - 1);
		} else {
			return max;
		}

	}

	public static void main(String[] args) {
		int result = sum(10);
		System.out.println(result);
		System.out.print(sum(5, 10));

	}

}
