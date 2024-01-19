package oop.garage;

import oop.garage.vehicle.Car;
import oop.garage.vehicle.Plane;

public class App {

	public static void main(String[] args) {
		Garage garage = new Garage();

		garage.dropOff(new Car("Lambo", "Murcielago", "Black", 10));
		garage.dropOff(new Car("Ferrari", "Enzo", "Red", 8));
		garage.dropOff(new Car("Fiat", "Panda", "White", 20));

		garage.dropOff(new Plane("Boeing", "747", "White", false));
		garage.dropOff(new Plane("Rolls Royce", "Spitfire", "Green", true));

		System.out.println(garage);

		System.out.println("Removed id 1, 2, 3: " + garage.collect(1, 2, 3));
		System.out.println("Removed id 99: " + garage.collect(99));

		System.out.println(garage);

		System.out.println("Bill: " + garage.fix());
	}

}
