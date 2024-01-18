package oop.abstraction;

import java.util.List;

import oop.data.Bird;
import oop.data.Cat;
import oop.data.Dog;
import oop.data.Fish;
import oop.data.Pet;

public class App {

	public static void main(String[] args) {
		List<Pet> pets = List.of(new Cat(), new Dog(), new Bird(), new Fish());

		for (Pet p : pets) {
			System.out.println(p.makeNoise());
		}
	}

}
