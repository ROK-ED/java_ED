package com.yedam.java.example2;

public class MovieThread extends Thread {
	// 552p 문제3
//	@Override
//	public void run() {
//		while (true) {
//			System.out.println("동영상을 재생합니다.");
//			if (Thread.interrupted())
//				break;
//		}
//	}
	
	
	// 552p 문제4
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			while (true) {
				System.out.println("동영상을 재생합니다.");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}

	
	
}