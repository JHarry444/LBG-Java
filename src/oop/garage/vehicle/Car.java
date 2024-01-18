package oop.garage.vehicle;

public class Car extends Vehicle {

	private int bootSize;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String model, String colour, int bootSize) {
		super(make, model, colour);
		this.bootSize = bootSize;
	}

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	public String toString() {
		return "Car [bootSize=" + bootSize + ", make=" + getMake() + ", model=" + getModel() + ", colour=" + getColour()
				+ "]";
	}

	@Override
	public double calcBill() {
		return 10 + this.bootSize * 5;
	}

	@Override
	public void print() {
		System.out.println("Boot Size: " + this.bootSize);
	}
}
