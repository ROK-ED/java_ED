package com.yedam.java.ch01;

public interface RemoteControl {
	//필드 -> 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//메소드 -> 추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//메소드 -> 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	//메소드 -> 정적 메소드
	static void chargeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
