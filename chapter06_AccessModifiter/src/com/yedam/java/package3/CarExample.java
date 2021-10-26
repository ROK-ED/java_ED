package com.yedam.java.package3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		
		System.out.println("현재속도 :"+myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) { //if 안은 ture 여야 진행하니 논리 부정을 써서 fulse로 만듬
			myCar.setStop(true);
		}
		
		System.out.println("현재속도 :"+myCar.getSpeed());

	}

}
