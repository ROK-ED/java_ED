package com.yedam.java.ch04;

public class Account {
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money) throws BalanceException {
		if(balance < money) {
			throw new BalanceException("잔고부족 : " +(money - balance)+"모자랍니다.");
		}
		balance -= money;
	}

}
