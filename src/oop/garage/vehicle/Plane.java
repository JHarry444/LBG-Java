package oop.garage.vehicle;

import interfaces.Flyable;

public class Plane extends Vehicle implements Flyable {

	private boolean propeller;

	public Plane() {
		super();
	}

	public Plane(String make, String model, String colour, boolean propeller) {
		super(make, model, colour);
		this.propeller = propeller;
	}

	@Override
	public void fly() {
		System.out.println("ZOOM");
	}

	@Override
	public String toString() {
		return "Plane [" + super.toString() + ", propeller=" + propeller + "]";
	}

	public boolean isPropeller() {
		return propeller;
	}

	public void setPropeller(boolean propeller) {
		this.propeller = propeller;
	}

	@Override
	public double calcBill() {
		return propeller ? 100 : 1_000;
	}

}
