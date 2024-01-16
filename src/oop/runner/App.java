package oop.runner;

import oop.data.Bird;
import oop.data.Cat;
import oop.data.Dog;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat("Tiddles", "Persian", 12, "Blonde");

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

		Dog doggy = new Dog();
		doggy.setName("Peppy");

		doggy.print();

		Bird flappy = new Bird();
		flappy.setName("polly");
		flappy.setFlying(true);
	}

}
