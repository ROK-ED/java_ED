package com.yedam.java.ch01_01;

public class C {
	//멤버 클래스에서 사용제한
	
	//인스턴스 필드 및 메소드
	int field1;
	void method1() {};
	
	//정적 필드 및 메소드
	static int field2;
	static void method2() {};
	
	class X{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class Y {
		void method() {
			
			//field1 = 10;
			//method1();
			C c = new C();
			c.field1 = 10;
			c.method1();
			
			
			
			
			field2 = 10;
			method2();
		}
	}

}

