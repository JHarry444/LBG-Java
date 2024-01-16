package oop.runner;

import oop.data.Cat;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat();
		moggy.setName("Tiddles");
		moggy.setBreed("Persian");
		moggy.setAge(12);
		moggy.setColour("Blonde");

		moggy.print();
		Cat moggy2 = new Cat();
		moggy2.setName("Jess");
		moggy2.setAge(125);
		moggy2.setColour("Black And White");

		moggy2.print();
		moggy2.sleep();

		Cat[] cats = { moggy, moggy2 };

		// for each cat of cats
		for (Cat cat : cats) {
			cat.print();
			cat.getAge();
		}
		moggy.setAge(moggy.getAge() + 1);
	}

}
