package player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import common.DAO;
import oracle.sql.DATE;

public class PlayerDAOImpl extends DAO implements PlayerDAO {
	//사용할 SQL 정리
	private final String SELECT_ALL = "select * from palyer order by id";
	private final String SELECT_ONE = "select * from palyer where id = ?";
	private final String INSERT = "insert into palyer values(?,?,?,?,?,?)";//?두개 삭제함
    private final String HP_UPDATE = "update palyer set hp = ? where id = ?";
    private final String ATK_UPDATE = "update palyer set atk = ? where id = ?";
    private final String DEF_UPDATE = "update palyer set def = ? where id = ?";
    private final String FLOOR_UPDATE = "update palyer set nowfloor = ? where id = ?";
//    private final String ENDDATE_UPDATE = "update palyerstatus set endDate = ? where id = ?";
    private final String DELETE = "delete from palyer where id = ?";
	
    //싱글톤
	private static PlayerDAO instance = new PlayerDAOImpl();
	
	public static PlayerDAO getInstance() {
		return instance;
	}

	@Override
	public List<Player> playerSelectAll() {
		//전체플레이어확인
		List<Player> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Player player = new Player();
				player.setPlayerId(rs.getInt("id"));
				player.setPlayerName(rs.getString("name"));
				player.setPlayerHP(rs.getInt("hp"));
				player.setPlayerATK(rs.getInt("atk"));
				player.setPlayerDEF(rs.getInt("def"));
				player.setPlayerFloor(rs.getInt("nowfloor"));
//				playerStatus.setPlayerCreDate(rs.getDate("creationDate"));
//				playerStatus.setPlayerEndDate(rs.getDate("endDate"));
				
				list.add(player);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Player playerSelect(int playerId) {
		//단일플레이어확인
		Player player = null;
		try {
			connect();
			
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, playerId);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				player = new Player();
				player.setPlayerId(rs.getInt("id"));
				player.setPlayerName(rs.getString("name"));
				player.setPlayerHP(rs.getInt("hp"));
				player.setPlayerATK(rs.getInt("atk"));
				player.setPlayerDEF(rs.getInt("def"));
				player.setPlayerFloor(rs.getInt("floor"));
//				playerStatus.setPlayerCreDate(rs.getDate("creationDate"));
//				playerStatus.setPlayerEndDate(rs.getDate("endDate"));
	    		}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return player;
	}

	@Override
	public int playerInsert(Player player) {
		//등록
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, player.getPlayerId());
			pstmt.setString(2, player.getPlayerName());
			pstmt.setInt(3, player.getPlayerHP());
			pstmt.setInt(4, player.getPlayerATK());
			pstmt.setInt(5, player.getPlayerDEF());
			pstmt.setInt(6, player.getPlayerFloor());
//			pstmt.setDate(7, playerStatus.getPlayerCreDate());
//			pstmt.setDate(8, playerStatus.getPlayerEndDate());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}



	@Override
	public int playerHPUpdate(Player player) {
		//수정 : HP
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(HP_UPDATE);
			pstmt.setInt(1, player.getPlayerHP());
			pstmt.setInt(2, player.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int playerATKUpdate(Player player) {
		//수정 : ATK
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(ATK_UPDATE);
			pstmt.setInt(1, player.getPlayerATK());
			pstmt.setInt(2, player.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int playerDEFUpdate(Player player) {
		//수정 : DEF
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(DEF_UPDATE);
			pstmt.setInt(1, player.getPlayerDEF());
			pstmt.setInt(2, player.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int playerNowFloorUpdate(Player player) {
		//수정 : floor
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(FLOOR_UPDATE);
			pstmt.setInt(1, player.getPlayerFloor());
			pstmt.setInt(2, player.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

//	@Override
//	public DATE endDataUpdate(PlayerStatus playerStatus) {
//		//수정 : endData
//		DATE result = new DATE();
//		try {
//			connect();
//			
//			pstmt = conn.prepareStatement(ENDDATE_UPDATE);
//			pstmt.setDate(1, playerStatus.getPlayerEndDate());
//			pstmt.setInt(2, playerStatus.getPlayerId());
//			
//			//result = pstmt.executeUpdate();/////////////////////////////
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return result;
//	}
	

	@Override
	public void playerDelete(int playerId) {
		//삭제
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, playerId);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}


}
