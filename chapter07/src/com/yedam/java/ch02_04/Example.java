package com.yedam.java.ch02_04;

public class Example {
	public 
           static//이게 없다면 1]이걸해야됨	
	              void method1(Parent parent) {
		Child child =(Child) parent;
		System.out.println("method1-Child 로 변환성공");
		
	}
	
	public
       	 static//이게 없다면 1]이걸해야됨
	            void method2(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method2-Child 로 변환성공");
		} else {
			System.out.println("method2-Child 로 변환되지 않음");
		}
	}
	

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		//자식 클래스엔 접근 불가
//		parent.fild2 = "data2";
//		parent.method3();
		
		//자식 클래스로 강제 타입변환해야 접근가능
		Child child = (Child) parent;      
		child.field2 = "data2";
		child.method3();
		
		System.out.println();
		
		
//1]	Example e = new Example();
//1]	e.
		  method1(parent);
//1]	e.
		  method2(parent);
		parent = new Children();
//1]	e.
		  method2(parent);
		

	}

}
