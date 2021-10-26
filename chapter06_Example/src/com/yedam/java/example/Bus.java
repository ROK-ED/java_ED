package com.yedam.java.example;

public class Bus {
	//필드
	private int busNumber;
	private int passengerCount;
	private int money;
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	//메소드
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("버스 "+busNumber+"번의 승객은 "+passengerCount
				           +"명이고, 수입은 "+money+"원 입니다.");
	}

}
