 package com.yedam.java.example;

public class VIPCard implements Payment {
	private final String name = "VIPCard";	//카드명
	private String grade;					//적용 등급
	private double saleRatio;				//할인율
	private int point;						//적립 포인트
	private double pointRatio;				//포인트 적립율

	public VIPCard() {
		this.grade = "GOLD";
		this.saleRatio = 0.1;
		this.point = 0;
		this.pointRatio = 0.03;
	}

	@Override
	public int offline(int price) {
		point += price*pointRatio;
		return (int) (price-price*(disOffline+saleRatio));
	}

	@Override
	public int online(int price) {
		point += price*pointRatio;
		return (int) (price-price*(disOnline+saleRatio));
	}

	@Override
	public int simple(int price) {
		point += price*pointRatio;
		return (int) (price-price*(disSimple+saleRatio));
	}

	@Override
	public void showCardInfo() {

		System.out.println("====== 카드정보 ======");
		System.out.println("카드명 : "+this.name);
		System.out.println("적용 등급 : "+this.grade);
		System.out.println("할인율 : "+this.saleRatio);
		System.out.println("포인트 적립율 : "+this.pointRatio);
		System.out.println("적립 포인트 : "+this.point);
	
	
	}
	
	

}
