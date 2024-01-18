package oop.runner;

import oop.data.Bird;
import oop.data.Cat;
import oop.data.Dog;
import oop.data.Pet;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat("Tiddles", 12, "Persian", "Blonde", false);

//		moggy.print();

		Dog doggy = new Dog("Rex", 4, "Alsation", "Brown");
//		doggy.print();

		Pet p = new Dog("Spot", 8, "Dalmation", "Black + White");
		Pet p2 = new Cat("Garfield", 47, "Animated", "Ginger", false);

		Pet[] pets = { p, p2, new Bird() };

		for (Pet pet : pets) {
//			pet.print();
		}

		Object[] objs = { 12, "fgdnkjdn", true, new Cat() };
	}

}
