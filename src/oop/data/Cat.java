package oop.data;

import java.util.Objects;

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

	@Override
	public String makeNoise() {
		return "meow";
	}

//	@Override
//	public void print() {
//		super.print();
//
//		System.out.println("Outdoor: " + this.outdoor);
//
//	}

	@Override
	public int hashCode() {
		return Objects.hash(outdoor);
	}

	@Override
	public String toString() {
		return "Cat [outdoor=" + outdoor + ", name()=" + getName() + ", age=" + getAge() + ", breed=" + getBreed()
				+ ", colour=" + getColour() + "]";
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
		// Casts the other obj to be a Cat
		Cat other = (Cat) obj;

		if (!super.equals(obj)) {
			return false;
		}

		if (this.outdoor != other.isOutdoor()) {
			return false;
		}

		return true;
	}

	public boolean isOutdoor() {
		return outdoor;
	}

	public void setOutdoor(boolean outdoor) {
		this.outdoor = outdoor;
	}

}
