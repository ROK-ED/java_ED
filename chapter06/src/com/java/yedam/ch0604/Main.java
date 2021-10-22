package com.java.yedam.ch0604;

public class Main {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 :"+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		
		System.out.println("result2 :"+result2);
		
		System.out.println();
		
		Computer myCom = new Computer();
		int[] values1 = {1,2,3};
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1 :"+intResult1);
		
		int intResult2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("intResult2 :"+intResult2);
		
		int intResult3 = myCom.sum2(1,2,3);
		System.out.println("intResult3 :"+intResult3);
		
		int intResult4 = myCom.sum2(1,2,3,4,5);
		System.out.println("intResult4 :"+intResult4);
		
		System.out.println();
		Car myCar = new Car();
		
		myCar.setGas(5);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
		Calculator myCalc1 = new Calculator();
		myCalc1.execute();
		
		
		
		//메소드의 오버로딩 메소드명이 동일해도 변수값으로 알아서 처리함
		double dbResult1 = myCalc1.areaRectangel(10);
		System.out.println("정사각형의 넓이 :"+dbResult1);
		
		double dbResult2 = myCalc1.areaRectangel(10,20);
		System.out.println("직사각형의 넓이 :"+dbResult2);
	}

}
