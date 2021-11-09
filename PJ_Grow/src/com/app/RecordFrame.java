package com.app;

import java.util.Scanner;

import com.app.common.Frame;
import com.app.data.enemy.EnemyDAO;
import com.app.data.enemy.EnemyDAOImpl;
import com.app.data.lvl.LvlDAO;
import com.app.data.lvl.LvlDAOImpl;
import com.app.data.player.PlayerDAO;
import com.app.data.player.PlayerDAOImpl;
import com.app.data.record.RecordDAO;
import com.app.data.record.RecordDAOImpl;

public class RecordFrame implements Frame {
	//필드
	Scanner scanner = new Scanner(System.in);
	LvlDAO ldao = LvlDAOImpl.getInstance();
	PlayerDAO pdao = PlayerDAOImpl.getInstance();
	EnemyDAO edao = EnemyDAOImpl.getInstance();
	RecordDAO rdao = RecordDAOImpl.getInstance();
	
	// 메소드
	// 프로그램 실행 메소드
	@Override
	public void run() {
		//대기 시간나면 할것

	}

}
