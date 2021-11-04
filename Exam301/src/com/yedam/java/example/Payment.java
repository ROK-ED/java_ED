package com.yedam.java.example;

public interface Payment {
	//상수 필드
	final double OFFLINE_PAYMENT_RATIO = 0.01;
	final double ONLINE_PAYMENT_RATIO = 0.03;
	final double SIMPLE_PAYMENT_RATIO = 0.05;
	
	//추상 메소드
	public int offline(int price);
	public int online(int price);
	public int simple(int price);
	public void showCardInfo();

}
