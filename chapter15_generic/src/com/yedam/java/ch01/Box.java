package com.yedam.java.ch01;

public class Box<T>/*제너릭 타입 ~ 타입을 파라미터로 변환*/ {
	private T object;
	
	public void set(T object) {
		this.object = object;
	}
	
	public T get() {
		return object;
	}

}
