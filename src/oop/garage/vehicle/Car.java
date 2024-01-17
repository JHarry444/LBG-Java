package oop.garage.vehicle;

public class Car extends Vehicle {

	private int bootSize;

	public int getBootSize() {
		return bootSize;
	}

	public void setBootSize(int bootSize) {
		this.bootSize = bootSize;
	}

	@Override
	public void print() {
		System.out.println("Boot Size: " + this.bootSize);
	}
}
