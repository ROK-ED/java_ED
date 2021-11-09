package com.app.data.lvl;

import java.util.List;

public interface LvlDAO {
	//전체층확인
	public List<Lvl> lvlSelectAll();
	
	//현재층확인
	public Lvl lvlSelect(int floor);
	
	//등록
	public int lvlInsert(Lvl lvl);
	
//	//수정 : floor
//	public int lvlFloorUpdate(Lvl lvl);
//	
//	//수정 : event
//	public void lvlEventUpdate(Lvl lvl);
//	
//	//수정 : HPBonus
//	public int lvlHPBonusUpdate(Lvl lvl);
//	
//	//수정 : ATKBonus
//	public int lvlATKBonusUpdate(Lvl lvl);
//	
//	//수정 : DEFBonus
//	public int lvlDEFBonusUpdate(Lvl lvl);
	
	//삭제
	void lvlDelete(int floor);

}
