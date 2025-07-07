package model;

public class Mobil extends Vehicle {
	public int chair;
	public int day;
	public double cost;

	public Mobil(String plate, String merk, String color, String type, int chair, int day, double cost) {
		super(plate, merk, color, type);
		this.chair = chair;
		this.day = day;
		this.cost = cost;
	}
	@Override
	public double calculateRent() {
		return cost * day;
	}

}
