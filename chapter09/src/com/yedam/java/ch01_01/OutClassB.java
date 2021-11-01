package com.yedam.java.ch01_01;

public class OutClassB {
	private int num = 10;
	private static int sNum=20;
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		//정적 내부 클래스의 일반 메서드
		void inTest() {
			System.out.println("InStaticClass inNum = "+ inNum+"(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = "+ sInNum+"(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
//			num +=10;  

		}
		//정적 내부 클래스의 정적 메서드
		static void sTest() {
			System.out.println("InStaticClass sInNum = "+ sInNum+"(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 정적 변수 사용)");
			//inNum += 10;
			
		}
	}

}
