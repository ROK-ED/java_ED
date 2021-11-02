package com.yedam.java.ch02_01;

public class Main {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체를 초기화한 필드 사용
		anony.field.wake();
		System.out.println();
		
		//익명 객체를 초기화한 로컬변수 사용
		anony.method1();
		System.out.println();
		
		//익명객체를 매개값으로 사용
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});

		System.out.println();
		
		RC rc = new RC();
		//익명 구현 객체로 초기화한 필드 사용
		rc.field.turnOn();
		//익명 구현 객체로 초기화한 로컬변수 사용
		rc.method1();
		//익명 구현 객체를 매개값으로 사용
		rc.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("SmartTV를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("SmartTV를 끕니다.");
			}

		});
		
		
		
	}

}
