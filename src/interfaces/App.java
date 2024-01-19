package interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import oop.data.Bird;
import oop.garage.vehicle.Car;
import oop.garage.vehicle.Plane;
import oop.garage.vehicle.Vehicle;

public class App {

	public static void main(String[] args) {
		List<Flyable> flying = new ArrayList<>();

		flying.add(new Bird());
		flying.add(new Plane());

		for (Flyable f : flying) {
			f.fly();
		}

		List<Integer> nums = new ArrayList<>();
		nums.add(5);
		nums.add(1);
		nums.add(12);
		nums.add(242);
		nums.add(8);

		System.out.println("NUMS: " + nums);

		Collections.sort(nums);

		System.out.println("SORTED: " + nums);

		List<String> words = new ArrayList<>();
		words.add("Jordan");
		words.add("Elliot");
		words.add("Robert");
		words.add("Andrew");
		words.add("Piers");

		System.out.println("WORDS: " + words);

		Collections.sort(words);

		System.out.println("WORDS: " + words);

		List<Vehicle> vehicles = new ArrayList<>();

		Vehicle v1 = new Car("Lambo", "Murcielago", "Black", 10);
		Vehicle v2 = new Car("Ferrari", "Enzo", "Red", 8);
		Vehicle v3 = new Car("Fiat", "Panda", "White", 20);
		Vehicle v4 = new Plane("Boeing", "747", "White", false);
		Vehicle v5 = new Plane("Rolls Royce", "Spitfire", "Green", true);

		vehicles.add(v2);
		vehicles.add(v4);
		vehicles.add(v1);

		vehicles.add(v5);
		vehicles.add(v3);

		System.out.println("VEHICLES: " + vehicles);

		Collections.sort(vehicles);

		System.out.println("VEHICLES: " + vehicles);

	}

}
