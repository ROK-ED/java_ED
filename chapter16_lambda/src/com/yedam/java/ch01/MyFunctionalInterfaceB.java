package com.yedam.java.ch01;

//@FunctionalInterface  생략해도 사용가능
public interface MyFunctionalInterfaceB {
	public void method(int x);
//	public void method2 (int x); //@FunctionalInterface이걸 생략하면 메소드를 두개이상 쓸수는 있지만 람다식에 오류남
}
