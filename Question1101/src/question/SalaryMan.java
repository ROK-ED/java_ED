package question;

public class SalaryMan {
	// 필드
	private int salary = 1000000;
	// 생성자
	public SalaryMan() {
		this.salary= salary;
		
	}
	public SalaryMan(int salary) {
		this.salary= salary;
		
	}
	

	// 메소드
	public int getAnnualGross() {
		return salary = (salary*12) + (salary*5);
		

	}
	
	
	//메인
	public static void main(String[] args) {
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
