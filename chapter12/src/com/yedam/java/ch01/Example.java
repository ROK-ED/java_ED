package com.yedam.java.ch01;

public class Example {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.println("소리");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		System.out.println("==============================");
		/*Runnable beeptask = new BeepTask();
		Thread thread1 = new Thread(beeptask);*/
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("소리");
					try { Thread.sleep(500); } catch(Exception e) {}
				}		
			}
		});
		thread1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		System.out.println("================================");
		//Thread thread2 = new BeepThread();
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println("소리");
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		};
		
		thread2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
		System.out.println();
		
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : "+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : "+threadB.getName());
		threadB.start();
		
		
		
	}

}
