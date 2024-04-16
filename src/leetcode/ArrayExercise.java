package leetcode;

import java.util.ArrayList;

public class ArrayExercise {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = range(1, 10);
		ArrayList<Integer> numbers1 = range(5, 1);
		ArrayList<Integer> numbers2 = rangeStep(10, 1, 2);
		ArrayList<Integer> numbers3 = swap(numbers1);
		System.out.println(numbers);
		System.out.println(numbers1);
		System.out.println(numbers2);
		System.out.println(numbers3);
		int sum = sumNumbers(numbers);
		System.out.println(sum);

	}

	public static ArrayList<Integer> range(int start, int end) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		if (start < end) {
			for (int i = start; i <= end; i++) {
				result.add(i);
			}
		} else if (start > end) {
			for (int j = end; j <= start; j++) {
				result.add(j);
			}
		}
		return result;
	}

	public static ArrayList<Integer> rangeStep(int start, int end, int step) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int max = Math.max(start, end);
		int min = Math.min(start, end);
		if (max > step) {
			for (int i = min; i <= max; i = i + step) {
				result.add(i);
			}
		}
		return result;

	}

	public static int sumNumbers(ArrayList<Integer> num) {
		int output = 0;
		for (int i = 0; i <= num.size(); i++) {
			output += i;
		}
		return output;
	}

	public static ArrayList<Integer> reverse(ArrayList<Integer> num) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = num.size(); i > 0; i--) {
			result.add(i);
		}
		return result;
	}

	public static ArrayList<Integer> swap(ArrayList<Integer> num) {
		for (int i = 0; i < num.get(Math.abs(num.size() / 2)); i++) {
			int temp = num.get((num.size() - 1) - i);
			num.set((num.size() - 1) - i, num.get(i));
			num.set(i, temp);
		}
		return num;
	}
}