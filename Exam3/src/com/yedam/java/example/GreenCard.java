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

}
