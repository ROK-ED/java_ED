package com.yedam.java.ch01_01;

public class OutClassA {
	private int num = 10;
	private static int sNum = 20;
	
	private InClassA inClassA;
	
	public OutClassA() {
		inClassA = new InClassA();
		
	}
	
	public void usingClass() {
		inClassA.inTest();
		
	}
	
	class InClassA{
		int inNum = 100;
		
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수)");
		}
	}

}
