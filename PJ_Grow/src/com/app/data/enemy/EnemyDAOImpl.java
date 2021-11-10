package com.app.data.enemy;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.common.DAO;
import com.app.data.player.Player;
import com.app.data.player.PlayerDAO;
import com.app.data.player.PlayerDAOImpl;

public class EnemyDAOImpl extends DAO implements EnemyDAO {
	// 사용할 SQL 정리
	private final String SELECT_ALL = "select * from enemy order by playerid";
	private final String SELECT_ONE = "select * from enemy where playerid = ?";
	private final String INSERT = "insert into enemy values(?,?,?,?,?,?,?)";
//	private final String HP_UPDATE = "update enemy set hp = ? where playerid = ?";
//	private final String ATK_UPDATE = "update enemy set atk = ? where playerid = ?";
//	private final String DEF_UPDATE = "update enemy set def = ? where playerid = ?";
//	private final String FLOOR_UPDATE = "update enemy set nowfloor = ? where playerid = ?";
	private final String DELETE = "delete from enemy where playerid = ?";

	// 싱글톤
	private static EnemyDAO instance = new EnemyDAOImpl();

	public static EnemyDAO getInstance() {
		return instance;
	}

	@Override
	public List<Enemy> enemySelectAll() {
		// 전체적확인
		List<Enemy> list = new ArrayList<>();
		try {
			connect();

			stmt = conn.createStatement();
			rs = stmt.executeQuery(SELECT_ALL);
			while (rs.next()) {
				Enemy enemy = new Enemy();
				enemy.setEnemyPlayerId(rs.getInt("playerid"));
				enemy.setEnemyId(rs.getInt("enemy_id"));
				enemy.setEnemyName(rs.getString("enemy_name"));
				enemy.setEnemyHP(rs.getInt("enemy_hp"));
				enemy.setEnemyATK(rs.getInt("enemy_atk"));
				enemy.setEnemyDEF(rs.getInt("enemy_def"));
				enemy.setEnemyFloor(rs.getInt("nowfloor"));

				list.add(enemy);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Enemy enemySelect(int enemyPlayerId) {
		// 단일적확인
		Enemy enemy = null;
		try {
			connect();

			pstmt = conn.prepareStatement(SELECT_ONE);
			pstmt.setInt(1, enemyPlayerId);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				enemy = new Enemy();
				enemy.setEnemyPlayerId(rs.getInt("playerid"));
				enemy.setEnemyId(rs.getInt("enemy_id"));
				enemy.setEnemyName(rs.getString("enemy_name"));
				enemy.setEnemyHP(rs.getInt("enemy_hp"));
				enemy.setEnemyATK(rs.getInt("enemy_atk"));
				enemy.setEnemyDEF(rs.getInt("enemy_def"));
				enemy.setEnemyFloor(rs.getInt("nowfloor"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return enemy;
	}

	@Override
	public int enemyInsert(Enemy enemy) {
		// 등록
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(INSERT);
			pstmt.setInt(1, enemy.getEnemyPlayerId());
			pstmt.setInt(2, enemy.getEnemyId());
			pstmt.setString(3, enemy.getEnemyName());
			pstmt.setInt(4, enemy.getEnemyHP());
			pstmt.setInt(5, enemy.getEnemyATK());
			pstmt.setInt(6, enemy.getEnemyDEF());
			pstmt.setInt(7, enemy.getEnemyFloor());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}

//	@Override
//	public int enemyHPUpdate(Enemy enemy) {
//		// 수정 : HP
//		int result = 0;
//		try {
//			connect();
//
//			pstmt = conn.prepareStatement(HP_UPDATE);
//			pstmt.setInt(1, enemy.getEnemyHP());
//			pstmt.setInt(2, enemy.getEnemyId());
//
//			result = pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return result;
//	}
//
//	@Override
//	public int enemyATKUpdate(Enemy enemy) {
//		// 수정 : ATK
//		int result = 0;
//		try {
//			connect();
//
//			pstmt = conn.prepareStatement(ATK_UPDATE);
//			pstmt.setInt(1, enemy.getEnemyATK());
//			pstmt.setInt(2, enemy.getEnemyId());
//
//			result = pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return result;
//	}
//
//	@Override
//	public int enemyDEFUpdate(Enemy enemy) {
//		// 수정 : DEF
//		int result = 0;
//		try {
//			connect();
//
//			pstmt = conn.prepareStatement(DEF_UPDATE);
//			pstmt.setInt(1, enemy.getEnemyDEF());
//			pstmt.setInt(2, enemy.getEnemyId());
//
//			result = pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return result;
//	}
//
//	@Override
//	public int enemyNowFloorUpdate(Enemy enemy) {
//		// 수정 : floor
//		int result = 0;
//		try {
//			connect();
//
//			pstmt = conn.prepareStatement(FLOOR_UPDATE);
//			pstmt.setInt(1, enemy.getEnemyFloor());
//			pstmt.setInt(2, enemy.getEnemyId());
//
//			result = pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return result;
//	}

	@Override
	public void enemyDelete(int enemyPlayerId) {
		// 삭제
		int result = 0;
		try {
			connect();

			pstmt = conn.prepareStatement(DELETE);
			pstmt.setInt(1, enemyPlayerId);

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
