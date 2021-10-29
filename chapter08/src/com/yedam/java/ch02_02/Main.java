package com.yedam.java.ch02_02;

public class Main {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		System.out.println();
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus1 =(Bus) vehicle;
		bus1.run();
		bus1.checkFare();
		
		//객체확인 필수

	}

}
