package com.yedam.java.ch03;

public interface ParentInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("ParedntInterface-method2() 실행");
	}

}
