package com.yedam.java.ch04;

public class Example {
	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기
		account.deposit(10000);
		System.out.println("예금액 : "+account.getBalance());
		
		//출금하기
		
		try {
			account.withDraw(30000);
		} catch (BalanceException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
