package com.yedam.java.home;

public class Subject {
	private String name;	//과목 이름
	private int scorePoint;	//과목 점수

	//각 필드의 getter, setter 메소드 구현
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		if (scorePoint < 0) {
			this.scorePoint = 0;
			return;
		} else {
			this.scorePoint = scorePoint;
			return;
		}
		
		
	}
	

}
