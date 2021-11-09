package com.app.data.enemy;

public class Enemy {
	private int enemyId;
	private String enemyName;
	private int enemyHP;
	private int enemyATK;
	private int enemyDEF;
	private int enemyFloor;
	
	public int getEnemyId() {
		return enemyId;
	}
	public void setEnemyId(int enemyId) {
		this.enemyId = enemyId;
	}
	public String getEnemyName() {
		return enemyName;
	}
	public void setEnemyName(String enemyName) {
		this.enemyName = enemyName;
	}
	public int getEnemyHP() {
		return enemyHP;
	}
	public void setEnemyHP(int enemyHP) {
		this.enemyHP = enemyHP;
	}
	public int getEnemyATK() {
		return enemyATK;
	}
	public void setEnemyATK(int enemyATK) {
		this.enemyATK = enemyATK;
	}
	public int getEnemyDEF() {
		return enemyDEF;
	}
	public void setEnemyDEF(int enemyDEF) {
		this.enemyDEF = enemyDEF;
	}
	public int getEnemyFloor() {
		return enemyFloor;
	}
	public void setEnemyFloor(int enemyFloor) {
		this.enemyFloor = enemyFloor;
	}
	@Override
	public String toString() {
		return "Enemy ID : " + enemyId + ", Name : " + enemyName + ", HP : " + enemyHP 
				+ ", ATK : " + enemyATK + ", DEF : " + enemyDEF 
				+ ", 현재 : " + enemyFloor + " 층";
	}
	
	

}
