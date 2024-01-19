package oop.garage.vehicle;

public class Plane extends Vehicle {

	private boolean propeller;

	public Plane() {
		super();
	}

	public Plane(String make, String model, String colour, boolean propeller) {
		super(make, model, colour);
		this.propeller = propeller;
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
