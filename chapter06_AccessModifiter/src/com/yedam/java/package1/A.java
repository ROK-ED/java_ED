package com.yedam.java.package1;

//접근 제한자 public삭제하면 기본은 defult 가 생략되어있다
public class A {
	//필드 ~싱글톤으로 확인
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	//생성자
	public A(boolean b){}
	A(int b){} // 기본은 defult 가 생략되어있다
	private A(String b){}
	
	
	
	
	
	//필드
	public int field1;
	int field2;
	private int field3;
	
	//생성자
	public A() {
		field1 =1;
		field2 =2;
		field3 =3;
		
		method1();
		method2();
		method3();
	}
	//메소드
	public void method1() {};
	void method2() {};
	private void method3() {};

}
