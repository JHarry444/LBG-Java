package oop.data;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(age, breed, colour, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Pet other = (Pet) obj;
		return age == other.age && Objects.equals(breed, other.breed) && Objects.equals(colour, other.colour)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", breed=" + breed + ", colour=" + colour + "]";
	}

//	public void print() {
//		System.out.println("Name: " + this.name);
//		System.out.println("Age: " + this.age);
//		System.out.println("Breed: " + this.breed);
//		System.out.println("Colour: " + this.colour);
//	}

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
