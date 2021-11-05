package com.yedam.java.ch02;

public class UsingThis {//람다식 중첩 할려다가 어려울것 같아서 안함 따로 공부할것
	public int outterField = 10;
	
	class Innter{
		int innerField = 20;
		
		void method() {              /*() -> {}; 람다식 기본골격*/
			MyFunctioanlInterface fi = () -> {
				System.out.println("outterField : "+ outterField);
				System.out.println("outterField : "+UsingThis.this.outterField);
			
				System.out.println("innerField : "+ innerField);
				System.out.println("innerField : "+ this.innerField);
			};
			fi.method();
			
		}
	}

}
