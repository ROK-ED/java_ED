package com.yedam.java.ch02;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		for (long i = 0; i < 2000000000L; i++) {

		}
		System.out.println(getName());
	}
}
