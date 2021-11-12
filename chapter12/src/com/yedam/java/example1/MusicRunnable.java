package com.yedam.java.example1;

public class MusicRunnable extends MovieThread/*extends Thread , implements Runnable 셋다 가능*/ {
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}
