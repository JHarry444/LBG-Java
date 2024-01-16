package oop.data;

public class Cat {

	private String name;

	private String breed;

	private String colour;

	private int age;

	public Cat(String name, String breed, int age, String colour) {
		// using the setters keeps the validation we wrote earlier
		setName(name);
		setBreed(breed);
		setAge(age);
		// auto-generate will look like this:
		this.colour = colour;
	}

	public Cat(String breed, String colour) {
		this.breed = breed;
		this.colour = colour;
	}

	public Cat() {

	}

	public void sleep() {
		System.out.println("zzzz");
	}

	public void print() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(colour);
	}

	public void setAge(int age) {
		if (age >= 0 && age < 30) {
			this.age = age;
		} else {
			System.out.println("Please provide an age between 0 and thirty");
		}
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
