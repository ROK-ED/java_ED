package com.yedam.java.example1;

public class VIP extends Customer {
	//필드
	//VIP 고객 담당 상담원아이디
	private int agentId;
	//할인율
	private double saleRatio;
	
	//생성자
	public VIP() {
		this.customerGrade = "VIP";	//고객 등급 VIP
		this.bonusRatio = 0.05; //보너스 적립 5%
		this.saleRatio = 0.1; //할인율 10%
		System.out.println("VIP() 생성자 호출");
	}
	public VIP(String customerName, int customerId, int agentId) {
		super(customerName, customerId);
		
		this.customerGrade = "VIP";	//고객 등급 VIP
		this.bonusRatio = 0.05; //보너스 적립 5%
		this.saleRatio = 0.1; //할인율 10%
		System.out.println("VIP(String, int) 생성자 호출");
	}


	//메소드
	public int getAgentId() {
		return agentId;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo()+"담당 상담원의 아이디는"+ agentId + " 할인율 은 "+ saleRatio + "입니다.";
	}

}
