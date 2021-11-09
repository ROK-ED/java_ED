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


public class MainFrame implements Frame {
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
		// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 생성 ~ 캐릭터 생성하면서 다른값들 자동생성
				insertAccount();
			} else if (menuNo == 2) { // 수정 ~ 플레이
				updatePlay();
			} else if (menuNo == 3) { // 삭제 ~ 캐릭터를 기반한 전부
				deleteAccount();
			} else if (menuNo == 4) { // 단건조회
				selectOne();
			} else if (menuNo == 5) { // 전체조회
				selectAll();
			} else if (menuNo == 9) { // 종료
				end();
				break;
			}
		}
	}
	// 메뉴를 출력하는 메소드
		void menuPrint() {
			System.out.println("");
			System.out.println("======================================================");
			System.out.println("==1.캐릭터 생성 2.PLAY 3.삭제 4.캐릭터조회 5.전체조회 9.종료==");
			System.out.println("======================================================");
			System.out.println("선택>>");
		}
	
		// 메뉴를 선택하는 메소드
		int menuSelect() {
			int menuNo = 0;
			try {
				menuNo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("없는 메뉴입니다.");
			}
			return menuNo;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}