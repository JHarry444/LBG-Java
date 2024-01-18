package objects;

import oop.data.Cat;
import oop.data.Dog;

public class App {

	public static void main(String[] args) {

		Object o = new Object();

		Cat c = new Cat("Garfield", 67, "Lazy", "Ginger", true);
		Cat c2 = new Cat("Garfield", 67, "Lazy", "Ginger", true);

		System.out.println("c == c2: " + (c == c2));
		System.out.println("c.equals(c2): " + c.equals(c2));

		System.out.println("Jordan".equals("Jordan"));

		Dog d = new Dog("Rex", 12, "Alsatian", "Brown");
		Dog d2 = new Dog("Rex", 12, "Alsatian", "Brown");

		System.out.println("d == d2: " + (d == d2));
		System.out.println("d.equals(d2): " + (d.equals(d2)));

		// these two lines are the same
		// cos sysout uses toString() automatically
		System.out.println(c.toString());
		System.out.println(c);

	}

}
