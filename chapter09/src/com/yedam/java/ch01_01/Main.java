package com.yedam.java.ch01_01;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		OutClassA outClassA = new OutClassA();
		System.out.println("외부 클래스 이용하여 내부클래스 기능 호출");
		outClassA.usingClass();
		
		System.out.println();
		
		A.C c = new A.C();
		//정적 멤버 클래스 내부 인스턴스 멤버 접근
		c.field1 = 3;
		c.method1();
		
		//정적 멤커 클래스 내부 정적 멤버 접근
		A.C.field2 = 3;
		A.C.method2();
		
		//정적 내부 클래스 예제
		OutClassB.InStaticClass sInClass = new OutClassB.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClassB.InStaticClass.sTest();
		
		System.out.println();
		a.method();
		System.out.println();
		
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
		System.out.println();
		
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
		

	}

}
