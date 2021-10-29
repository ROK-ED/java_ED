package com.yedam.java.ch02_02;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { //강제로 타입변환할땐 무조건 instanceof 필요
		Bus bus = (Bus) vehicle;
		bus.checkFare();
		}
		vehicle.run();
	}

}
