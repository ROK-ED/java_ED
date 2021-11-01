package question;

public class Account {
	// 필드
	private String owner; // 소유자
	private long balance; // 나머지
	// 생성자

	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	// 메소드owner
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long deposit(long amount) { 
		balance = balance + amount;
		return amount;
	}

	public long withdraw(long amount) {
		if (balance >= amount) {
			balance = balance - amount;
			return amount;

		} else {
			System.out.println("잔액이 부족합니다.\n출금 가능한 금액");
			return balance;
			
		}
		
		
	}

}
