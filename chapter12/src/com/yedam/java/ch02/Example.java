package com.yedam.java.ch02;

public class Example {

	public static void main(String[] args) {
		// 스레드 우선순위 (1~10)
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread"+i);
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
		
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}

}
