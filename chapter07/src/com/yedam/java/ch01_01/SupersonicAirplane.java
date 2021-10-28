package com.yedam.java.ch01_01;

public class SupersonicAirplane extends Airplane {

	//숫자 표기보다 final을 사용하여 호칭을 표기
	public static final int NORMAL =1;
	public static final int SUPERSONIC =2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
		
	}
	
	

}
