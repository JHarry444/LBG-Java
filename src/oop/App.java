package oop;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat();
		moggy.name = "Tiddles";
		moggy.breed = "Persian";
		moggy.age = 12;
		moggy.colour = "Blonde";

		moggy.print();
		Cat moggy2 = new Cat();
		moggy2.name = "Jess";
		moggy2.age = 60;
		moggy2.colour = "Black And White";

		moggy2.print();
		moggy2.sleep();

		Cat[] cats = { moggy, moggy2 };

		// for each cat of cats
		for (Cat cat : cats) {
			cat.print();
		}
	}

}
