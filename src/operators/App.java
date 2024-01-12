package operators;

public class App {

	public static void main(String[] args) {
		System.out.println(10.0 / 4);
		System.out.println(0.1 + 0.1 + 0.1);
		System.out.println((1 + 1 + 1) / 10.0);

		int i = 12;

		System.out.println(i++);
		System.out.println(++i);
//		Methods are all initialised before they're called
//		so call them wherever
		System.out.println(add(12, 24));
//		Can't use a VARIABLE before it's declared
//		System.out.println(x);
//		int x = 27;
		System.out.println(greaterThan(12, 15));

		int product = add(12, 4) * add(27, 6);

		System.out.println(product);
	}

	public static boolean greaterThan(int a, int b) {
		return a > b;
	}

	public static int add(int a, int b) {
		return a + b;
	}
}
