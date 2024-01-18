package oop.garage;

import java.util.ArrayList;

import oop.garage.vehicle.Vehicle;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public boolean dropOff(Vehicle v) {
		return this.vehicles.add(v);
	}

	public boolean collect(Vehicle v) {
		return this.vehicles.remove(v);
	}

	public Vehicle collect(int index) {
		return this.vehicles.remove(index);
	}

	public double fix() {
		double bill = 0;

		for (Vehicle v : this.vehicles) {
			bill += v.calcBill();
		}

		return bill * 1.19;
	}

	public int countVehilces() {
		return this.vehicles.size();
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

}
