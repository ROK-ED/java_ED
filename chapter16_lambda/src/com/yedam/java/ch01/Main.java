package com.yedam.java.ch01;

public class Main {

	public static void main(String[] args) {
		// 람다식 : (매개변수, ...) -> {실행문} 
		// @FunctionalInterface 
		
		MyFunctionalInterfaceA fa;
		
		fa = new MyFunctionalInterfaceA() {
			
			@Override
			public void method() {
				System.out.println("익면구현객체입니다.");
				
			}
		};
		fa.method();
		
		fa = (/*인터페이스가 가진 매개변수를 넣어야함*/) -> {/*실행문*/
			String str = "method call1";
			System.out.println(str);
		};
		fa.method();
		
		fa = () -> System.out.println("람다식 표현법"); //실행구문은 중괄호{} 필요없음
		fa.method();
		System.out.println();
		
		//매개변수가 있는 람다식
		
		MyFunctionalInterfaceB fb;
		
		fb = new MyFunctionalInterfaceB() {
			private int result = 1;
			@Override
			public void method(int x) {
				System.out.println(x+result);
				
			}
		};
		
		fb.method(2);
		
		fb = (x) -> {
			int result = x * 5;          //람다식 안에 선언된건 필드가 아닌 로컬변수
			System.out.println(result);
		};
		
		fb.method(10);
		
		fb = x -> System.out.println(x * 5);  //매개변수가 하나일때 ()괄호도 삭제가능
		                                      //단 매개변수가 없을땐 ()괄호 무조건 필요
		
		//리턴값이 있는 람다식
		MyFunctionalInterfaceC fc;
		
		fc = new MyFunctionalInterfaceC() {
			
			@Override
			public int method(int x, int y) {
				return x+y;
			}
		};
		System.out.println(fc.method(1, 2));
		
		fc = (x,y) -> {
			int result = x + y ;
			return result;
		};
		System.out.println(fc.method(1, 2));
		
		fc = (x,y) -> {return x+y;};
		System.out.println(fc.method(1, 2));
		
		fc = (x,y) -> x + y;          //이건 비추
		System.out.println(fc.method(1, 2));
		
		fc = (x,y) -> sum( x , y );         
		System.out.println(fc.method(1, 2));
		
		//MyNumber max = (x,y) -> {return (x>=y)? x :y;};
		MyNumber max = (x,y) -> (x>=y)? x :y;
		System.out.println(max.getMax(10, 20));

	}
	
	public static int sum(int x, int y ) {
		return (x+y);
	}
	
	

}
