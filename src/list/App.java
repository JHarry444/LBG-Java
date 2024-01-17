package list;

import java.util.ArrayList;

import oop.data.Bird;
import oop.data.Cat;
import oop.data.Dog;

public class App {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		words.add("!");
		System.out.println(words);

		words.remove("!");
		words.remove(1);

		words.set(0, "BLOOP");
		System.out.println(words);

		for (int i = 0; i < 5; i++) {
			words.add("barry");
		}

		// never modify a list as you're looping over it
		System.out.println(words);
		while (words.contains("barry")) {
			words.remove("barry");
		}
		System.out.println(words);

		for (int i = 0; i < words.size(); i++) {
			System.out.println("I: " + i + " Word: " + words.get(i));
		}
		// no methods + can't be null
		int primitive = 27;
		// HAS methods + CAN be null
		Integer object = 27;

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i <= 20; i++) {
			nums.add(i * 2);
		}

		System.out.println(nums);

		// Always use classes to iterate through Lists, not primitives
		for (Integer num : nums) {
			System.out.println("Num: " + num);
		}

//		ArrayList<Pet> pets = new ArrayList<>();
//
//		pets.add(new Cat("Tiddles", 12, "Happy", "Blue", false));
//		pets.add(new Dog("Pongo", 24, "Dalmation", "Black + White"));
//		pets.add(new Bird());
//
//		System.out.println(pets);
//
//		for (Pet pet : pets) {
//			pet.print();
//		}

		Kennel myKennel = new Kennel("Battersea Dogs Home");

		myKennel.board(new Cat("Tiddles", 12, "Happy", "Blue", false));
		myKennel.board(new Dog("Pongo", 24, "Dalmation", "Black + White"));
		myKennel.board(new Bird());

		myKennel.print();
	}

}
