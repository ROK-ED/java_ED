package com.yedam.java.ch01;

import javax.naming.directory.SearchControls;

public class Main {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new Audio();
		rc1 = new Television();
		
		RemoteControl rc2 = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				System.out.println("현재 볼륨은 : " + volume + "입니다.");
				
			}
			boolean mute;  //익면구현객체는 외부에서 접근불가
			@Override
			public void setMute(boolean mute) {
				this.mute = mute;
				if(mute) {
					System.out.println("기기를 무음 처리합니다.");
				} else {
					System.out.println("기기를 무음 해제합니다.");
				}
			}
			
		};
		
		rc2.turnOn();
		rc2.setVolume(3);
		System.out.println();
		
		rc2.setMute(true);
		
		RemoteControl.chargeBattery();
		System.out.println();
		
		SmartTelevision tv= new SmartTelevision();
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		System.out.println("1)----------------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		MyClass myClass2 = new MyClass(new Audio());
		
		
		System.out.println("3)----------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());

	}

}
