package com.app.data.lvl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.common.DAO;

public class LvlDAOImpl extends DAO implements LvlDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from lvl order by playerid";
	private final String SELECT_ONE = "select * from lvl where playerid = ?";
	private final String INSERT = "insert into lvl values(?,?,?,?,?,?)";
	private final String FLOOR_UPDATE = "update lvl set floor = ? where playerid = ?";
	private final String EVENT_UPDATE = "update lvl set event = ? where playerid = ?";
	private final String HPBONUS_UPDATE = "update lvl set hpBonus = ? where playerid = ?";
	private final String ATKBONUS_UPDATE = "update lvl set atkBonus = ? where playerid = ?";
	private final String DEFBONUS_UPDATE = "update lvl set defBonus = ? where playerid = ?";
	private final String DELETE = "delete from lvl where playerid = ?";

	// 싱글톤
	private static LvlDAO instance = new LvlDAOImpl();

	public static LvlDAO getInstance() {
		return instance;
	}

	@Override
	public List<Lvl> lvlSelectAll() {
		//전체층확인
		List<Lvl> list = new ArrayList<>();
		try {
			connect();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Lvl lvl = new Lvl();
				lvl.setLvlPlayerId(rs.getInt("playerid"));
				lvl.setLvlFloor(rs.getInt("floor"));
				lvl.setLvlEvent(rs.getString("event"));
				lvl.setLvlHPBonus(rs.getInt("hpBonus"));
				lvl.setLvlATKBonus(rs.getInt("atkBonus"));
				lvl.setLvlDEFBonus(rs.getInt("defBonus"));
				
				list.add(lvl);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Lvl lvlSelect(int lvlPlayerId) {
		//현재층확인
		Lvl lvl = null;
		try {
			connect();
			
			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, lvlPlayerId);
			
			rs=pstmt.executeQuery();
			if (rs.next()) {
				lvl = new Lvl();
				lvl.setLvlPlayerId(rs.getInt("playerid"));
				lvl.setLvlFloor(rs.getInt("floor"));
				lvl.setLvlEvent(rs.getString("event"));
				lvl.setLvlHPBonus(rs.getInt("hpBonus"));
				lvl.setLvlATKBonus(rs.getInt("atkBonus"));
				lvl.setLvlDEFBonus(rs.getInt("defBonus"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return lvl;
	}

	@Override
	public int lvlInsert(Lvl lvl) {
		//등록
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, lvl.getLvlPlayerId());
			pstmt.setInt(2, lvl.getLvlFloor());
			pstmt.setString(3, lvl.getLvlEvent());
			pstmt.setInt(4, lvl.getLvlHPBonus());
			pstmt.setInt(5, lvl.getLvlATKBonus());
			pstmt.setInt(6, lvl.getLvlDEFBonus());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int lvlFloorUpdate(Lvl lvl) {
		//수정 : floor
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(FLOOR_UPDATE);
			pstmt.setInt(1, lvl.getLvlFloor());
			pstmt.setInt(2, lvl.getLvlPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public void lvlEventUpdate(Lvl lvl) {
		//수정 : event
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(EVENT_UPDATE);
			pstmt.setString(1, lvl.getLvlEvent());
			pstmt.setInt(2, lvl.getLvlPlayerId());
			
			result = pstmt.executeUpdate();
			
			//System.out.println(result + "건이 완료되었습니다."); //반환할 필요 없음
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public int lvlHPBonusUpdate(Lvl lvl) {
		//수정 : HPBonus
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(HPBONUS_UPDATE);
			pstmt.setInt(1, lvl.getLvlHPBonus());
			pstmt.setInt(2, lvl.getLvlPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int lvlATKBonusUpdate(Lvl lvl) {
		//수정 : ATKBonus
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(ATKBONUS_UPDATE);
			pstmt.setInt(1, lvl.getLvlATKBonus());
			pstmt.setInt(2, lvl.getLvlPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public int lvlDEFBonusUpdate(Lvl lvl) {
		//수정 : DEFBonus
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(DEFBONUS_UPDATE);
			pstmt.setInt(1, lvl.getLvlDEFBonus());
			pstmt.setInt(2, lvl.getLvlPlayerId());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public void lvlDelete(int lvlPlayerId) {
		//삭제
		int result = 0;
		try {
			connect();
			
			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, lvlPlayerId);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
