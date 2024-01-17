package oop.data;

// DO NOT DO THIS!!11!!!
public class Pet extends Object {

	private String name;

	private int age;

	private String breed;

	private String colour;

	public Pet() {
		super();
	}

	public Pet(String name, int age, String breed, String colour) {
		super();
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.colour = colour;
	}

	public void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Breed: " + this.breed);
		System.out.println("Colour: " + this.colour);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
