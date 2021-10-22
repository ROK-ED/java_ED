package com.java.yedam.ch0604;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {
//               ... 몇개인지는 모르겠지만 values 에 저장하겠다		
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
