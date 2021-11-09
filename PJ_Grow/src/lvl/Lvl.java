package lvl;

public class Lvl {
	private int lvlFloor;
	private String lvlEvent;
	private int lvlHPBonus;
	private int lvlATKBonus;
	private int lvlDEFBonus;
	
	public int getLvlFloor() {
		return lvlFloor;
	}
	public void setLvlFloor(int lvlFloor) {
		this.lvlFloor = lvlFloor;
	}
	public String getLvlEvent() {
		return lvlEvent;
	}
	public void setLvlEvent(String lvlEvent) {
		this.lvlEvent = lvlEvent;
	}
	public int getLvlHPBonus() {
		return lvlHPBonus;
	}
	public void setLvlHPBonus(int lvlHPBonus) {
		this.lvlHPBonus = lvlHPBonus;
	}
	public int getLvlATKBonus() {
		return lvlATKBonus;
	}
	public void setLvlATKBonus(int lvlATKBonus) {
		this.lvlATKBonus = lvlATKBonus;
	}
	public int getLvlDEFBonus() {
		return lvlDEFBonus;
	}
	public void setLvlDEFBonus(int lvlDEFBonus) {
		this.lvlDEFBonus = lvlDEFBonus;
	}
	@Override
	public String toString() {
		return "현재 : " + lvlFloor + " 층" +", 이벤트 : " + lvlEvent 
				+ ", HPBonus : " + lvlHPBonus + ", ATKBonus : "+ lvlATKBonus
				+ ", DEFBonus : " + lvlDEFBonus;
	}
	
	

}
