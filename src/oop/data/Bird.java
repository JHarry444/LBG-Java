package oop.data;

public class Bird extends Pet {

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
	public void print() {
		super.print();
		System.out.println("Flying: " + this.flying);
	}

}
