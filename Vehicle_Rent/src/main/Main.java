package main;

import java.util.*;
import model.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	ArrayList<Vehicle> VehicleList = new ArrayList<>();
	
	public void insertMenu(){
		String plate;
		String merk;
		String color;
		String type;
		String MotorType;
		int chair;
		double cost = 0.0;
		int day;
		
		System.out.println("Rental [Mobil/Motor]: ");
		type = sc.nextLine();
		
		System.out.println("Plate Number: ");
		plate = sc.nextLine();
		
		System.out.println("Merk: ");
		merk = sc.nextLine();
		
		System.out.println("Color: ");
		color = sc.nextLine();
		
		if(type.equalsIgnoreCase("Mobil")) {
			System.out.print("Rent Duration: ");
			day = sc.nextInt(); sc.nextLine();
			System.out.print("Seat Amount: ");
			chair = sc.nextInt(); sc.nextLine();
			System.out.print("Cost per Day: ");
			cost = sc.nextDouble(); sc.nextLine();
			
			Mobil newMobil = new Mobil(plate, merk, color, type, chair, day, cost);
			VehicleList.add(newMobil);
		}
		else if(type.equalsIgnoreCase("Motor")) {
			System.out.print("Rent Duration: ");
			day = sc.nextInt(); sc.nextLine();
			
			System.out.print("Motor Type [Matic/Manual]: ");
			MotorType = sc.nextLine();
			if(MotorType.equalsIgnoreCase("Matic")) {
				Motor newMotor = new Motor(plate, merk, color, type, MotorType, day, cost);
				VehicleList.add(newMotor);
			}else if(MotorType.equalsIgnoreCase("Manual")) {
				Motor newMotor = new Motor(plate, merk, color, type, MotorType, day, cost);
				VehicleList.add(newMotor);
			}else {
				System.out.println("Please Input correct Motor Type");
				sc.nextLine();
			}
			
			System.out.print("Cost per Day: ");
			cost = sc.nextDouble(); sc.nextLine();
			
			Motor newMotor = new Motor(plate, merk, color, type, MotorType, day, cost);
			VehicleList.add(newMotor);
		}
		System.out.println("Successfully Added");
	}
	
	
	
	public Main() {
		
	}

	public static void main(String[] args) {
		new Main();

	}

}
