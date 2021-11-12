package com.yedam.java.ch03;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함");
	}

	@Override
	public void run() {
		while (true) {
			if (Thread.interrupted())
				break;
			save();

		}
	}
}
