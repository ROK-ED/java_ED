package player;

import java.util.List;

import oracle.sql.DATE;

public interface PlayerDAO {
	//전체플레이어확인
	public List<PlayerStatus> selectAll();
	
	//단일플레이어조회
	public PlayerStatus selectOne(int playerId);
	
	//등록
	public int insert(PlayerStatus playerStatus);
	
	//수정 : HP
	public int HPUpdate(PlayerStatus playerStatus);
	
	//수정 : ATK
	public int ATKUpdate(PlayerStatus playerStatus);
	
	//수정 : DEF
	public int DEFUpdate(PlayerStatus playerStatus);
	
	//수정 : floor
	public int floorUpdate(PlayerStatus playerStatus);
	
	//수정 : endData
	public DATE endDataUpdate(PlayerStatus playerStatus);
	
	//삭제
	void Playerdelete(int playerId);

}
