package player;

import java.util.List;

import oracle.sql.DATE;

public interface PlayerDAO {
	//전체플레이어확인
	public List<Player> playerSelectAll();
	
	//단일플레이어확인
	public Player playerSelect(int playerId);
	
	//등록
	public int playerInsert(Player player);
	
	//수정 : HP
	public int playerHPUpdate(Player player);
	
	//수정 : ATK
	public int playerATKUpdate(Player player);
	
	//수정 : DEF
	public int playerDEFUpdate(Player player);
	
	//수정 : floor
	public int playerNowFloorUpdate(Player player);
	
//	//수정 : endData
//	public DATE endDataUpdate(PlayerStatus playerStatus);
	
	//삭제
	void playerDelete(int playerId);

}
