package oop.data;

public class Dog extends Pet {

	public Dog(String name, int age, String breed, String colour) {
		super(name, age, breed, colour);
	}

	public Dog() {
		super();
	}

	@Override
	public String makeNoise() {
		return "W00f";
	}

	@Override
	public String toString() {
		return "Dog [ name=" + getName() + ", age=" + getAge() + ", breed=" + getBreed() + ", colour=" + getColour()
				+ "]";
	}

}
