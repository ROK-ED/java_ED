package record;

import java.sql.Date;

import oracle.sql.DATE;

public class Record {
	private int recordPlayerId;
	private String recordPlayerName;
	private int recordLvlFloor;
	private String recordEvent;
	private Date recordStartDate;
	private Date recordEndDate;
	private int recordEnemyId;
	
	
	public int getRecordPlayerId() {
		return recordPlayerId;
	}



	public void setRecordPlayerId(int recordPlayerId) {
		this.recordPlayerId = recordPlayerId;
	}



	public String getRecordPlayerName() {
		return recordPlayerName;
	}



	public void setRecordPlayerName(String recordPlayerName) {
		this.recordPlayerName = recordPlayerName;
	}



	public int getRecordLvlFloor() {
		return recordLvlFloor;
	}



	public void setRecordLvlFloor(int recordLvlFloor) {
		this.recordLvlFloor = recordLvlFloor;
	}



	public String getRecordEvent() {
		return recordEvent;
	}



	public void setRecordEvent(String recordEvent) {
		this.recordEvent = recordEvent;
	}



	public Date getRecordStartDate() {
		return recordStartDate;
	}



	public void setRecordStartDate(Date recordStartDate) {
		this.recordStartDate = recordStartDate;
	}



	public Date getRecordEndDate() {
		return recordEndDate;
	}



	public void setRecordEndDate(Date recordEndDate) {
		this.recordEndDate = recordEndDate;
	}



	public int getRecordEnemyId() {
		return recordEnemyId;
	}



	public void setRecordEnemyId(int recordEnemyId) {
		this.recordEnemyId = recordEnemyId;
	}



	@Override
	public String toString() {
		return "Player ID : " + recordPlayerId + ", NAME : " + recordPlayerName
				+ ", 층수 : " + recordLvlFloor + ", 이벤트 : " + recordEvent 
				+ ", 시작 : " + recordStartDate + ", 끝 : " + recordEndDate 
				+ ", 처치수 : " + recordEnemyId;
	}
	
	
	

}
