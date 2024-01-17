package oop.data;

public class Dog extends Pet {

	public Dog(String name, int age, String breed, String colour) {
		super(name, age, breed, colour);
	}

	public Dog() {
		super();
	}

	public void bark() {
		System.out.println("W00f");
	}

}
