package player;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.app.product.Product;

import common.DAO;
import oracle.sql.DATE;

public class PlayerDAOImpl extends DAO implements PlayerDAO {
	//사용할 SQL 정리
	private final String SELECT_ALL = "select * from palyerstatus order by id";
	private final String SELECT_ONE = "select * from palyerstatus where id = ?";
	private final String INSERT = "insert into palyerstatus values(?,?,?,?,?,?)";//?두개 삭제함
    private final String HP_UPDATE = "update palyerstatus set hp = ? where id = ?";
    private final String ATK_UPDATE = "update palyerstatus set atk = ? where id = ?";
    private final String DEF_UPDATE = "update palyerstatus set def = ? where id = ?";
    private final String FLOOR_UPDATE = "update palyerstatus set nowfloor = ? where id = ?";
//    private final String ENDDATE_UPDATE = "update palyerstatus set endDate = ? where id = ?";
    private final String DELETE = "delete from palyerstatus where id = ?";
	
    //싱글톤
	private static PlayerDAO instance = new PlayerDAOImpl();
	
	public static PlayerDAO getInstance() {
		return instance;
	}

	@Override
	public List<PlayerStatus> playerSelectAll() {
		//전체플레이어확인
		List<PlayerStatus> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				PlayerStatus playerStatus = new PlayerStatus();
				playerStatus.setPlayerId(rs.getInt("id"));
				playerStatus.setPlayerName(rs.getString("name"));
				playerStatus.setPlayerHP(rs.getInt("hp"));
				playerStatus.setPlayerATK(rs.getInt("ATK"));
				playerStatus.setPlayerDEF(rs.getInt("def"));
				playerStatus.setPlayerFloor(rs.getInt("floor"));
//				playerStatus.setPlayerCreDate(rs.getDate("creationDate"));
//				playerStatus.setPlayerEndDate(rs.getDate("endDate"));
				
				list.add(playerStatus);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public PlayerStatus playerSelect(int playerId) {
		//단일플레이어조회
		PlayerStatus playerStatus = null;
		try {
			connect();
			
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, playerId);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				playerStatus = new PlayerStatus();
				playerStatus.setPlayerId(rs.getInt("id"));
				playerStatus.setPlayerName(rs.getString("name"));
				playerStatus.setPlayerHP(rs.getInt("hp"));
				playerStatus.setPlayerATK(rs.getInt("ATK"));
				playerStatus.setPlayerDEF(rs.getInt("def"));
				playerStatus.setPlayerFloor(rs.getInt("floor"));
//				playerStatus.setPlayerCreDate(rs.getDate("creationDate"));
//				playerStatus.setPlayerEndDate(rs.getDate("endDate"));
	    		}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	@Override
	public int playerInsert(PlayerStatus playerStatus) {
		//등록
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, playerStatus.getPlayerId());
			pstmt.setString(2, playerStatus.getPlayerName());
			pstmt.setInt(3, playerStatus.getPlayerHP());
			pstmt.setInt(4, playerStatus.getPlayerATK());
			pstmt.setInt(5, playerStatus.getPlayerDEF());
			pstmt.setInt(6, playerStatus.getPlayerFloor());
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
	public int playerHPUpdate(PlayerStatus playerStatus) {
		//수정 : HP
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(HP_UPDATE);
			pstmt.setInt(1, playerStatus.getPlayerHP());
			pstmt.setInt(2, playerStatus.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int playerATKUpdate(PlayerStatus playerStatus) {
		//수정 : ATK
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(ATK_UPDATE);
			pstmt.setInt(1, playerStatus.getPlayerATK());
			pstmt.setInt(2, playerStatus.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int playerDEFUpdate(PlayerStatus playerStatus) {
		//수정 : DEF
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(DEF_UPDATE);
			pstmt.setInt(1, playerStatus.getPlayerDEF());
			pstmt.setInt(2, playerStatus.getPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int playerNowFloorUpdate(PlayerStatus playerStatus) {
		//수정 : floor
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(FLOOR_UPDATE);
			pstmt.setInt(1, playerStatus.getPlayerFloor());
			pstmt.setInt(2, playerStatus.getPlayerId());
			
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
