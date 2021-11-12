package com.yedam.java.ch03;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 100000000; i++) {
		}

		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for (long i = 0; i < 100000000; i++) {
		}
	}

}
