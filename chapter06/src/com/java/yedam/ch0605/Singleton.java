package com.java.yedam.ch0605;

public class Singleton {
	//필드
	private static Singleton Singleton = new Singleton();
	//생성자
	private Singleton() {
		
	}
	//메소드
	static Singleton getInstance() {
		return Singleton;
	}

}
