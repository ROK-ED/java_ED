package com.yedam.java.example;


public abstract class Member {
	//필드
	static int GRADE_STANDARD = 1000000;
	
	int record;	
	String grade;
	
	//생성자
	public Member(int record) {
		this.record = record;
	}
	
	//메소드	
	void showMemberInfo() {
		System.out.println("현재 실적은 " + this.record + "이며, 회원등급은 " + this.grade + "입니다.");

	}
	
	static Member getMemberShip(int record) {
		if(record >= Member.GRADE_STANDARD) {
			return new Gold(record);
		}else {
			return new Silver(record);
		}
	}
}
