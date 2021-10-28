package com.yedam.java.example1;

public class Customer {
	//필드
	//고객 아이디
	private int customerId;
	//고객 이름
	private String customerName;
	//고객 등급 (
	private String customerGrade;
	//보너스 포인트
	private int bonusPoint;
	//보너스 적립 비율
	private double bonusRatio;
	
	//생성자
	public Customer() {
		this.customerGrade = "SILVER"; //기본 등급
	    this.bonusRatio = 0.01;       //기본 등급일 경우 보너스 적립비용은 1%
	}

	//메소드
	//calcPrice -> 물건을 구입했을 때 1) 보너스 포인트 적립 2) 할인율을 적용한 가격을 반환
	  public int calcPrice(int price) {
		  bonusPoint += price * bonusRatio;
		  return price;
	  }
	//showCustomerInfo -> 고객이름과 등급, 보너스포인트를 출력하는 메소드
	  public String showCustomerInfo() {
		  return customerName + "님의 등급은 " + customerGrade 
				  + "이며, 보너스 포인트는 "+ bonusPoint + "입니다.";
	  }
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getbonusPoint() {
		return bonusPoint;
	}

	public void setbonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getbonusRatio() {
		return bonusRatio;
	}

	public void setbonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	

	

}
