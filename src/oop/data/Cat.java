package oop.data;

public class Cat extends Pet {

	private boolean outdoor;

	public Cat() {
		super();
	}

	public Cat(String name, int age, String breed, String colour, boolean outdoor) {
		super(name, age, breed, colour);
		this.outdoor = outdoor;
	}

	public void sleep() {
		System.out.println("zzzz");
	}

	public void meow() {
		System.out.println("ME0W");
	}

	@Override
	public void print() {
		super.print();

		System.out.println("Outdoor: " + this.outdoor);

	}

	public boolean isOutdoor() {
		return outdoor;
	}

	public void setOutdoor(boolean outdoor) {
		this.outdoor = outdoor;
	}

}
