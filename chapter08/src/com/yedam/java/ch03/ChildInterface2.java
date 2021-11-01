package com.yedam.java.ch03;

public interface ChildInterface2 extends ParentInterface {
	@Override
	public default void method2() {
		System.out.println("parentInterface-method2() 재정의 후 실행");
	}
	
	public void method3();

}
