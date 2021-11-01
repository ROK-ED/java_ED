package com.java.yedam.ch0603;

public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("Color : "+ car1.color);
		System.out.println("======================");
		Car car2 = new Car();
		System.out.println("모델 : "+car2.model);
		System.out.println();
		System.out.println("======================");
		Car car3 = new Car("모닝");
		System.out.println("모델 : "+car3.model);
		System.out.println("컬러 : "+car3.color);
		System.out.println();
		System.out.println("======================");
		Car car4 = new Car("모닝", "white");
		System.out.println("모델 : "+car4.model);
		System.out.println("컬러 : "+car4.color);
		System.out.println("최고속도 : "+car4.maxSpeed);
		System.out.println();
		System.out.println("======================");
		Car car5 = new Car("모닝", "white",300);
		System.out.println("모델 : "+car5.model);
		System.out.println("컬러 : "+car5.color);
		System.out.println("최고속도 : "+car5.maxSpeed);
		System.out.println();
		

	}

}
