package com.yedam.java.package1;

public class B {
	//필드
	//A a;
	
	A a1 = new A(true);
	A a2 = new A(1);
//	A a3 = new A("문자열");
	
	public B() {
		A a = new A();
		a.field1 = 5;
		a.field2 = 5;
//		a.field3 = 5;
		
		a.method1();
		a.method2();
//		a.method3();
		
	}
	

}
