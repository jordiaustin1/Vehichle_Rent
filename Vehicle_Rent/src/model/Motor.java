package model;

public class Motor extends Vehicle {
	public String MotorType;
	public int day;
	public double cost;
	
	public Motor(String plate, String merk, String color, String type, String MotorType, int day, double cost) {
		super(plate, merk, color, type);
		this.MotorType = MotorType;
		this.day = day;
		this.cost = cost;
	}
	
	@Override
	public double calculateRent() {
		return cost * day;
	}
}
