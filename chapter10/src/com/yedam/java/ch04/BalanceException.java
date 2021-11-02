package com.yedam.java.ch04;

public class BalanceException extends Exception {
	//사용자 정의 예외 클래스 선언
	
	//생성자
	public BalanceException() {}
	public BalanceException(String message) {
		super(message);
	}
}
