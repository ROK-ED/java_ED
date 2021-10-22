package com.java.yedam.ch0604;

public class Car {
	// 필드
	int gas;

	// 생성자

	// 메소드
	void setGas(int gas) {
//       필드Gas
//       set 쓰면 무조건 void
		if (gas >= 0) {
			this.gas = gas;
		} else {
			this.gas = 0;
		}
	}
	int getGas() {
//      get은 매개변수x		
		return this.gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
//		if는 조건을 2개다 주어야 된다
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다. (gas잔량 : "+gas+")");
				gas -=1;
			} else {
				System.out.println("멈춥니다. (gas잔량 : "+gas+")");
				return;
//              void지만 메소드를 종료하기 위해 return을 씀				
			}
		}
	}

}
