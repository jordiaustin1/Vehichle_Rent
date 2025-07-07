package model;

public class Vehicle {
	public String plate;
	public String merk;
	public String color;
	public String type;
	public int chair;
	

	public Vehicle(String plate, String merk, String color, String type) {
		super();
		this.plate = plate;
		this.merk = merk;
		this.color = color;
		this.type = type;
		this.chair = chair;
	}
	
	public double calculateRent(){
		return 0.0;
	}
}


