package com.yedam.java.ch01_01;

public class Car {
	//필드
	int speed;
	//메소드
	void speedUp() {
		speed++;
	}
	//final 메소드
	final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
