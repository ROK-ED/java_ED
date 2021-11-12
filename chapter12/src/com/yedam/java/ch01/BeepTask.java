package com.yedam.java.ch01;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		// 스레드 내에서 실행하는 명령어의 집합
		for(int i=0; i<5; i++) {
			System.out.println("소리");
			try { Thread.sleep(500); } catch(Exception e) {}
		}

	}

}
