package oop.garage.vehicle;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle> {
	private static int count;

	private final int id;
	private String make;
	private String model;
	private String colour;

	public Vehicle() {
		super();
		this.id = ++count;
	}

	public Vehicle(String make, String model, String colour) {
		super();
		this.id = ++count;
		this.make = make;
		this.model = model;
		this.colour = colour;
	}

	public void print() {
		System.out.println("Make: " + this.make);
		System.out.println("Model: " + this.model);
		System.out.println("Colour: " + this.colour);
	}

	public abstract double calcBill();

	@Override
	public String toString() {
		return "id=" + id + ", make=" + make + ", model=" + model + ", colour=" + colour;
	}

	@Override
	public int compareTo(Vehicle o) {
//		Id - ASC
//		if (id < o.getId()) {
//			return -1;
//		}
//		else if (id > o.getId()) {
//			return +1;
//		} else {
//			return 0;
//		}
//		make - DESC
//		return this.make.compareTo(o.make) * -1;

		return id - o.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, id, make, model);
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
		Vehicle other = (Vehicle) obj;
		return Objects.equals(colour, other.colour) && id == other.id && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getId() {
		return id;
	}

}
