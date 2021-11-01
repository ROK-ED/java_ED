package question;

public class Main {
	public static void main(String[] args) {
		Account account = new Account("a", 100);
		System.out.println("잔액 : "+account.getBalance());
		System.out.println("저축 : "+account.deposit(10));
		System.out.println("잔액 : "+account.getBalance());
		System.out.println("======================");
		System.out.println("인출 : "+account.withdraw(50));
		System.out.println("잔액 : "+account.getBalance());
		System.out.println("======================");
		System.out.println("인출 : "+account.withdraw(80));
		
	
		
		
		
	}

}
