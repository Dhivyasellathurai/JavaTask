
public class NumberSwap {

	public static void main(String[] args) {
		int x, y;
		x = 15;
		y = 20;

		System.out.print("before SWap ");
		System.out.println(x + "," + y);
		x = x+y;
		y = x-y;
		x=x-y;
        System.out.print("After SWap ");
		System.out.println(x + "," + y);

	}

}
