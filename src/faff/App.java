package faff;

public class App {

	public static void main(String[] args) {
		int a = 1;
		int b = -1;
		boolean negative = false;

		if (!negative) {
			if (a < 0 && b > 0) {
				System.out.println(true);
			} else if (a < 0 && b > 0) {
				System.out.println(true);
			}
		} else {
			if (a < 0 & b < 0) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

//		return negative ? a < 0 && b < 0 : a < 0 ^ b < 0;
	}

}
