package oop.data;

public class Cat extends Pet {

	public Cat() {
	}

	public Cat(String name, String breed, int age, String colour) {
		setName(name);
		setAge(age);
		setBreed(breed);
		setColour(colour);
	}

	public void sleep() {
		System.out.println("zzzz");
	}

	public void meow() {
		System.out.println("ME0W");
	}

}
