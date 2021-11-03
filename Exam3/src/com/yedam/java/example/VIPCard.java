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
	
	

}
