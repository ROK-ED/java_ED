package com.java.yedam.ch0603;

public class Car {
	//필드
	String company = "현대자동차" ;
	String model;
	String color ;
	int maxSpeed ;
	int speed;
	
	//생성자
	// 생성자 명은 무조건 클래스명과 동일하게
	Car(){
		
	}
	Car(String model) {
		//this.model = model;
		//this. ~>본인자신
		//this.(생성자)
		this(model, "은색",250);
			
	}
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드

}
