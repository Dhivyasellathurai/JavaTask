import java.util.Arrays;

public class ArrayExercise {
	public static void main(String[] args) {
		String cars[] = new String[3];
		cars[0] = "bmw";
		cars[1] = "volvo";
		cars[2] = "audi";
		System.out.println(Arrays.toString(cars));
		int[] result = { 10, 15, 20, 25, 30 };
		findLargest(result);
		secondLargest(result);

	}

	public static void findLargest(int num[]) {
		int max = 0;
		for (int i = 0; i <= num.length - 1; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);
	}

	public static void secondLargest(int num[]) {
		int max = 0;
		int sec_max = -1;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				sec_max = max;
				max = num[i];
			}
		}
		System.out.print(sec_max);
	}
}
