package player;

import java.sql.Date;

public class PlayerStatus {
	private int playerId;
	private String playerName;
	private int playerHP;
	private int playerATK;
	private int PlayerDEF;
	private int playerFloor;
	//private Date PlayerCreDate;
	//private Date PlayerEndDate;
	
	public int getPlayerId() {
		return playerId;
	}



	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}



	public int getPlayerHP() {
		return playerHP;
	}



	public void setPlayerHP(int playerHP) {
		this.playerHP = playerHP;
	}



	public int getPlayerATK() {
		return playerATK;
	}



	public void setPlayerATK(int playerATK) {
		this.playerATK = playerATK;
	}



	public int getPlayerDEF() {
		return PlayerDEF;
	}



	public void setPlayerDEF(int playerDEF) {
		PlayerDEF = playerDEF;
	}



	public int getPlayerFloor() {
		return playerFloor;
	}



	public void setPlayerFloor(int playerFloor) {
		this.playerFloor = playerFloor;
	}



//	public Date getPlayerCreDate() {
//		return PlayerCreDate;
//	}
//
//
//
//	public void setPlayerCreDate(Date playerCreDate) {
//		PlayerCreDate = playerCreDate;
//	}
//
//
//
//	public Date getPlayerEndDate() {
//		return PlayerEndDate;
//	}
//
//
//
//	public void setPlayerEndDate(Date playerEndDate) {
//		PlayerEndDate = playerEndDate;
//	}



	@Override
	public String toString() {
		return "ID : " + playerId + ", Name : " + playerName + ", HP : " + playerHP 
				+ ", ATK : "+ playerATK + ", DEF : " + PlayerDEF 
				+ ", 현재 : " + playerFloor + " 층" /*+ ", 플레이 : " + PlayerCreDate
				+ "~" + PlayerEndDate*/;
	}
	
	

}
