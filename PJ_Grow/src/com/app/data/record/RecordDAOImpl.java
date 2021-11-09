package com.app.data.record;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.common.DAO;
import com.app.data.lvl.Lvl;
import com.app.data.lvl.LvlDAO;
import com.app.data.lvl.LvlDAOImpl;
import com.app.data.player.Player;

public class RecordDAOImpl extends DAO implements RecordDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from playrecord order by playerid";
	private final String SELECT_ONE = "select * from playrecord where playerid = ?";
	private final String INSERT = "insert into playrecord values(?,?,?,?,?,?,?)";
	private final String DELETE = "delete from playrecord where playerid = ?";

	// 싱글톤
	private static RecordDAO instance = new RecordDAOImpl();

	public static RecordDAO getInstance() {
		return instance;
	}

	@Override
	public List<Record> recordSelectAll() {
		// 전체기록확인
		List<Record> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Record record = new Record();
				record.setRecordPlayerId(rs.getInt("playerid"));
				record.setRecordPlayerName(rs.getString("playername"));
				record.setRecordLvlFloor(rs.getInt("lvlfloor"));
				record.setRecordEvent(rs.getString("event"));
				record.setRecordStartDate(rs.getDate("startDate"));
				record.setRecordEndDate(rs.getDate("endDate"));
				record.setRecordEnemyId(rs.getInt("enemyid"));

				list.add(record);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Record recordSelect(int recordPlayerId) {
		// 단일플레이어확인
		Record record = null;
		try {
			connect();

			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, recordPlayerId);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				record = new Record();
				record.setRecordPlayerId(rs.getInt("playerid"));
				record.setRecordPlayerName(rs.getString("playername"));
				record.setRecordLvlFloor(rs.getInt("lvlfloor"));
				record.setRecordEvent(rs.getString("event"));
				record.setRecordStartDate(rs.getDate("startDate"));
				record.setRecordEndDate(rs.getDate("endDate"));
				record.setRecordEnemyId(rs.getInt("enemyid"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return record;
	}

	@Override
	public int recordInsert(Record record) {
		// 등록
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, record.getRecordPlayerId());
			pstmt.setString(2, record.getRecordPlayerName());
			pstmt.setInt(3, record.getRecordLvlFloor());
			pstmt.setString(4, record.getRecordEvent());
			pstmt.setDate(5, record.getRecordStartDate());
			pstmt.setDate(6, record.getRecordEndDate());
			pstmt.setInt(7, record.getRecordEnemyId());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

	@Override
	public void recordDelete(int recordPlayerId) {
		// 삭제
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, recordPlayerId);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
