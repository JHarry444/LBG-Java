package oop.garage;

import oop.garage.vehicle.Car;
import oop.garage.vehicle.Vehicle;

public class App {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();

		v.print();

		v.setColour("Black");
		v.setMake("Ford");
		v.setModel("T");

		v.print();

		Car c = new Car();

		c.setColour("White");
		c.setMake("Fiat");
		c.setModel("Panda");
		c.setBootSize(4494);

		c.print();
	}

}
