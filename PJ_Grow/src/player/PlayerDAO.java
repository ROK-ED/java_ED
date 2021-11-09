package player;

import java.util.List;

import oracle.sql.DATE;

public interface PlayerDAO {
	//전체플레이어확인
	public List<PlayerStatus> playerSelectAll();
	
	//단일플레이어조회
	public PlayerStatus playerSelect(int playerId);
	
	//등록
	public int playerInsert(PlayerStatus playerStatus);
	
	//수정 : HP
	public int playerHPUpdate(PlayerStatus playerStatus);
	
	//수정 : ATK
	public int playerATKUpdate(PlayerStatus playerStatus);
	
	//수정 : DEF
	public int playerDEFUpdate(PlayerStatus playerStatus);
	
	//수정 : floor
	public int playerNowFloorUpdate(PlayerStatus playerStatus);
	
//	//수정 : endData
//	public DATE endDataUpdate(PlayerStatus playerStatus);
	
	//삭제
	void playerDelete(int playerId);

}
