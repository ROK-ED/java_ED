package com.yedam.java.example;

public class GreenCard implements Payment {
	private final String name = "GreenCard";	//카드명
	private String grade;						//적립 등급
	private int point;							//적립 포인트
	private double pointRatio;					//포인트 적립율

	public GreenCard() {
		this.grade = "SILVER";
		this.point = 0;
		this.pointRatio = 0.05;
	}
	//가격을 넘겨받아 포인트 적립율에 따른 포인트를 적립하고  
	//각 결제방식별 추가할인율을 적용한 가격을 반환하는 메소드
	@Override
	public int offline(int price) {
		point += price*pointRatio;
		return (int) (price-price*disOffline);
	}

	@Override
	public int online(int price) {
		point += price*pointRatio;
		return (int) (price-price*disOnline);
	}

	@Override
	public int simple(int price) {
		point += price*pointRatio;
		return (int) (price-price*disSimple);
	}

	@Override
	public void showCardInfo() {

	System.out.println("====== 카드정보 ======");
	System.out.println("카드명 : "+this.name);
	System.out.println("적용 등급 : "+this.grade);
	System.out.println("할인율 : "+"없음");
	System.out.println("포인트 적립율 : "+this.pointRatio);
	System.out.println("적립 포인트 : "+this.point);
		
	}

}
