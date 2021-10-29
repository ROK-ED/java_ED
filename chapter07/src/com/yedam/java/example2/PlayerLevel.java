package com.yedam.java.example2;

public abstract class PlayerLevel {
	//run
	public abstract void run();    //추상 클래스라 실행문에 {} 가없음
	//jump
	public abstract void jump();
	//turn
	public abstract void turn();
	//레벨 메세지
	public abstract void showLevelMessage();
	
	//필살기 ~필살기 문구는 동일해야해서 수정을 못하게 final이 필요
	final public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		} 
		turn();
	}

	
		
		
	
	
	

}
