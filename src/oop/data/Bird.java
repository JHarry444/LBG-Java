package oop.data;

import interfaces.Flyable;

public class Bird extends Pet implements Flyable {

	private boolean flying;

	public Bird() {
	}

	public Bird(String name, String breed, int age, String colour, boolean flying) {
		setName(name);
		setAge(age);
		setBreed(breed);
		setColour(colour);
		this.flying = flying;
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	@Override
	public String makeNoise() {
		return "I t'ought I taw a putty tat";
	}

	@Override
	public void fly() {
		System.out.println("FLAP FLAP");
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Flying: " + this.flying);
//	}

}
