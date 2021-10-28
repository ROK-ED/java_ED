package com.yedam.java.ch03_02;

public class Dog extends Animal {
	public Dog(){
		this.kind = "포유류";
	}

	@Override        //추상메소드의 강제성
	public void sound() {
		System.out.println("멍멍");
		
	}

}
