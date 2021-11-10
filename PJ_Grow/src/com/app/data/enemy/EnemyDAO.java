package com.app.data.enemy;

import java.util.List;

public interface EnemyDAO {
	// 전체적확인
	public List<Enemy> enemySelectAll();

	// 단일적확인
	public Enemy enemySelect(int enemyPlayerId);

	// 등록
	public int enemyInsert(Enemy enemy);

//	// 수정 : HP
//	public int enemyHPUpdate(Enemy enemy);
//
//	// 수정 : ATK
//	public int enemyATKUpdate(Enemy enemy);
//
//	// 수정 : DEF
//	public int enemyDEFUpdate(Enemy enemy);
//
//	// 수정 : floor
//	public int enemyNowFloorUpdate(Enemy enemy);

	// 삭제
	void enemyDelete(int enemyPlayerId);

}
