package com.yedam.java.example1;

public class Main {

	public static void main(String[] args) {
/*		//일반고객 : 이순신, 10010, 1000점
		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		System.out.println();
		
		//VIP : 김유신, 10020, 10000점
		VIP customerKim = new VIP();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showVIPInfo());
		System.out.println();
*/
		
		Customer customerLee = new Customer("이순신",10010);
		customerLee.bonusPoint = 1000;
		
		VIP customerKim = new VIP("김유신",10020,12345);
		customerKim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName()
				+"님이 지불해야 하는 금액은 "+customerLee.calcPrice(price)+"원 입니다.");
		System.out.println(customerKim.getCustomerName()
				+"님이 지불해야 하는 금액은 "+customerKim.calcPrice(price)+"원 입니다.");
		
		//메소드 재정의 예시
		Customer vipCustomer = new VIP("김자바",10030,2000);
		System.out.println(vipCustomer.getCustomerName()
				+"님이 지불해야 하는 금액은 "+vipCustomer.calcPrice(price)+"원 입니다.");
		
		//상속 관계의 다형성을 이용
		System.out.println();
		Customer[] customerList = new Customer[5];
		
		customerList[0] = new Customer("이순신",10010);
		customerList[1] = new Customer("신사임당",10020);
		customerList[2] = new Gold("홍길동",10030);
		customerList[3] = new Gold("이율곡",10040);
		customerList[4] = new VIP("김유신",10050,12345);
		
	    System.out.println("=== 고객 정보 출력 ===");
	    for(Customer customer : customerList) {
	    	System.out.println(customer.showCustomerInfo());
	    }
	    
	    System.out.println("=== 할인율과 보너스 포인트 계산 ===");
	    price = 10000;
	    for(Customer customer : customerList) {
	    	int cost = customer.calcPrice(price);
	    	System.out.println(customer.getCustomerName()+"님이 "
	    			           + cost + "원 지불했습니다.");
	    	System.out.println("현재 보너스 포인트는 "+ customer.getbonusPoint()+"점 입니다.");
	    }
		
	}

}
