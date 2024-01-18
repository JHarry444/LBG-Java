package list;

import java.util.ArrayList;

import oop.data.Pet;

public class Kennel {

	private String name;
	private ArrayList<Pet> pets = new ArrayList<>();

	public Kennel(String name) {
		super();
		this.name = name;
	}
//  DO NOT need to write a method for each kind of Pet
//	as we can just treat them all as Pet
//	public void boardDog(Dog dog) {
//
//	}
//
//	public void boardCat(Cat cat) {
//
//	}
//
//	public void boardBird(Bird bird) {
//
//	}

	public void board(Pet pet) {
		pets.add(pet);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void collect(Pet pet) {
		pets.remove(pet);
	}

	public void print() {
		System.out.println("NAME: " + this.getName());
		for (Pet pet : pets) {
			pet.print();
		}
	}
}
