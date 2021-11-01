package com.yedam.java.ch03;

public class Example {

	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
		System.out.println();
		
		
		ChildInterface1 ci1 = new ChildInterface1() {

			@Override
			public void method1() {
				System.out.println("ChildInterface1 -method1() 실행");
				
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface1 -method3() 실행");
				
			}
			
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
		System.out.println();
		
		ChildInterface2 ci2 = new ChildInterface2 () {

			@Override
			public void method1() {
				System.out.println("ChildInterface2 -method1() 실행");
				
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface2 -method3() 실행");
				
			}
			
		};
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		System.out.println();
		
		ChildInterface3 ci3 = new ChildInterface3() {

			@Override
			public void method1() {
				System.out.println("ChildInterface3 -method1() 실행");
				
			}

			@Override
			public void method2() {
				System.out.println("ChildInterface3 -method2() 실행");
				
			}

			@Override
			public void method3() {
				System.out.println("ChildInterface3 -method3() 실행");
				
			}
			
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();
		System.out.println();
		
		

	}

}
