package com.yedam.java.example2;

public class ThreadExample {

	public static void main(String[] args) {
		//552p 문제3
//		Thread thread = new MovieThread();
//		thread.start();
//		
//		try {Thread .sleep(1000);}catch(InterruptedException e) {}
//		
//		thread.interrupt();
		
		
		//552p 문제4
		Thread thread = new MovieThread();
		thread.setDaemon(true);
		thread.start();
		try {Thread .sleep(3000);}catch(InterruptedException e) {}
		

		
		
		
	}
}
