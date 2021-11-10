package com.app;

import java.util.Scanner;

import com.app.common.Frame;
import com.app.data.acct.AcctDAO;
import com.app.data.acct.AcctDAOImpl;
import com.app.data.enemy.Enemy;
import com.app.data.enemy.EnemyDAO;
import com.app.data.enemy.EnemyDAOImpl;
import com.app.data.lvl.Lvl;
import com.app.data.lvl.LvlDAO;
import com.app.data.lvl.LvlDAOImpl;
import com.app.data.player.Player;
import com.app.data.player.PlayerDAO;
import com.app.data.player.PlayerDAOImpl;
import com.app.data.record.Record;
import com.app.data.record.RecordDAO;
import com.app.data.record.RecordDAOImpl;

public class MainFrame implements Frame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	LvlDAO ldao = LvlDAOImpl.getInstance();
	PlayerDAO pdao = PlayerDAOImpl.getInstance();
	EnemyDAO edao = EnemyDAOImpl.getInstance();
	RecordDAO rdao = RecordDAOImpl.getInstance();
	AcctDAO adao = AcctDAOImpl.getInstance();
	// 메소드
	// 프로그램 실행 메소드
	@Override
	public void run() {
		/***************************** 로그인 *****************************/
		
		
		
		
		
		
		
		/***************************** 메뉴호출 *****************************/
		// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록 및 수정 ~ 플레이
				play();
			} else if (menuNo == 2) { // 삭제 ~ 캐릭터를 기반한 전부
				deleteData();
			} else if (menuNo == 3) { // 단건조회
				selectOne();
			} else if (menuNo == 4) { // 전체조회
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
		System.out.println("================================================");
		System.out.println("== 1.PLAY 2.데이터삭제 3.캐릭터히스토리 4.전체조회 9.종료 ==");
		System.out.println("================================================");
		System.out.println("선택>>");
	}

	// 메뉴를 선택하는 메소드
	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(scanner.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	// - 종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	// - PLAY
	void play() {
		/***************************** 게임초기생성 *****************************/
		Player fPlayer = new Player();
		Lvl fLvl = new Lvl();
		Enemy fEnemy = new Enemy();
		Record fRecord = new Record();
		int difficulty = 0;
		int code = 0;
		int age = 0;
		int dice = 0; // 주사위 하나 (int) (Math.random() * 6) + 1;
		int playerDoubleDice = 0; // 주사위 둘 (int) (Math.random() * 12) + 1;
		int enemyDoubleDice = 0;
		
		String name = null;
		System.out.println("게임을 시작합니다.");
		System.out.println("데이터 수집을 위해 원하시는 코드와 나이를 입력해주시길 바랍니다.");
		System.out.println("코드(숫자만가능)>>"); // 나중에 중복안되게 수정해야됨
		code = Integer.parseInt(scanner.nextLine());
		System.out.println("나이>>");
		age = Integer.parseInt(scanner.nextLine());
		System.out.println("나이는 캐릭터 능력치로 사용됩니다.");

		System.out.println("난이도를 선택해 주세요");
		System.out.println("선택(권장 1)>>");
		difficulty = Integer.parseInt(scanner.nextLine());

		// 캐릭터 생성
		System.out.println("캐릭터를 생성합니다.");
		System.out.println("캐릭터 이름을 입력하세요");
		System.out.println("이름>>");
		name = scanner.nextLine();
		fPlayer.setPlayerId(code);
		fPlayer.setPlayerHP(age + (int) (difficulty / 1.5));
		fPlayer.setPlayerFloor(difficulty);
		System.out.println("주사위를 굴려 공격력과 방어력에 보너스 수치를 드리겠습니다.");
		System.out.println("우선 공격력을 정해볼까요.");
		System.out.println("주사위를 굴려주세요");
		System.out.println("Enter를 눌러주세요");
		System.out.println(scanner.nextLine());
		dice = (int) (Math.random() * 6) + 1;
		System.out.println("공격력 보정결과 : " + dice);
		fPlayer.setPlayerATK(1 + dice + (int) (difficulty / 1.5));
		System.out.println();
		System.out.println("다음은 방어력을 정해볼까요.");
		System.out.println("주사위를 굴려주세요");
		System.out.println("Enter를 눌러주세요");
		System.out.println(scanner.nextLine());
		dice = (int) (Math.random() * 6) + 1;
		System.out.println("방어력 보정결과 : " + dice);
		fPlayer.setPlayerDEF(1 + dice + (int) (difficulty / 1.5));

		pdao.playerInsert(fPlayer);
		System.out.println("캐릭터 생성이 완료되었습니다.");

		// 필드생성
		System.out.println();
		System.out.println("게임 환경을 생성합니다.");
		fLvl.setLvlPlayerId(code);
		fLvl.setLvlFloor(difficulty);
		fLvl.setLvlEvent("전투");
		fLvl.setLvlHPBonus(0);
		fLvl.setLvlATKBonus(0);
		fLvl.setLvlDEFBonus(0);
		ldao.lvlInsert(fLvl);

		System.out.println("lvl 생성 완료");

		// 적생성
		fEnemy.setEnemyPlayerId(code);
		fEnemy.setEnemyId(1);
		fEnemy.setEnemyName("Inside (" + difficulty + ")");
		fEnemy.setEnemyHP(difficulty);
		fEnemy.setEnemyATK(difficulty);
		fEnemy.setEnemyDEF(difficulty);
		fEnemy.setEnemyFloor(difficulty);
		edao.enemyInsert(fEnemy);
		System.out.println("enemy 생성 완료");
		System.out.println("난이도에 따른 게임 환경을 생성했습니다.");

		// 레코드생성
		fRecord.setRecordPlayerId(fPlayer.getPlayerId());

		fRecord.setRecordPlayerName(name);
		fRecord.setRecordLvlFloor(fLvl.getLvlFloor());
		fRecord.setRecordEvent(fLvl.getLvlEvent());
//디폴트	fRecord.setRecordStartDate();
//디폴트	fRecord.setRecordEndDate();	
		fRecord.setRecordEnemyId(fEnemy.getEnemyId());

		rdao.recordInsert(fRecord);
		System.out.println("초기값이 기록되었습니다.");
		// 초기값들 조회
		System.out.println();
		System.out.println("====================================================================");
		System.out.println("===============================PLAYER===============================");
		System.out.println(pdao.playerSelect(code));
		System.out.println("===============================PLAYER===============================");
		System.out.println("====================================================================");
		System.out.println();
		System.out.println("로 생성되었습니다.");
		System.out.println("앞으로 Enter 가 보이면 Enter를 쳐주시길 바랍니다.");
		System.out.println("Enter");
		System.out.println(scanner.nextLine());

		System.out.println("게임을 시작하기에 앞서 간단한 설명을 읽어주세요");
		System.out.println("게임을 시작하면 전투 혹은 이벤트를 고를수 있습니다.");
		System.out.println("기본적인 전투는 주사위 두개를 굴린 값의 합으로 상대방과 싸우게 됩니다.");
		System.out.println("Player값이 크면 데미지를 주며, Player이 작으면 방어를");
		System.out.println("값이 낮은 2,4는 특별하게 회피를 하게 해드리죠");
		System.out.println("그리고 적과 나의 주사위 값이 두배 이상으로 차이나면 두배의 데미지가 들어갑니다.");
		System.out.println("이벤트는 전투,수련,함정,휴식 중에 랜덤하게 걸리며");
		System.out.println("자세한 효과는 직접 체험해 보시기 바랍니다.");
		System.out.println("그럼 행운을 빕니다.");
		System.out.println("Enter");
		System.out.println(scanner.nextLine());
		System.out.println("======================게임에 입장합니다.======================");
		/***************************** n층(이곳부터 이벤트 및 분기) *****************************/
		
		int life = fPlayer.getPlayerHP();
		int i=0;
		while(life > 0) {
				int floor = 0;
				floor = fLvl.getLvlFloor()+i;
				int floorselect = 0;
				System.out.println("=========================================");
				System.out.println("======="+ floor +" 층에 입장하였습니다.=======");
				System.out.println("==========  1.전투  2.이벤트 9.DIE ==========");
				System.out.println("=========================================");
				System.out.println("선택>>");
				floorselect = Integer.parseInt(scanner.nextLine());
				if(floorselect == 1) {
					// 전투
				} else if (floorselect == 2){
					// 이벤트
				} else if (floorselect == 9) {
					// DIE
					//강제로 라이프 0
				}
				i++;

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/***************************** n층(이곳부터 이벤트 및 분기) *****************************/

		System.out.println("YOU DIE");

	}

	// 삭제 ~ 캐릭터를 기반한 전부
	void deleteData() {
		System.out.println("구현 준비중");
		System.exit(0);	
	}

	// - 전체조회
	void selectAll() {
		System.out.println("구현 준비중");
		System.exit(0);	
	}

	// - 단건조회
	void selectOne() {
		System.out.println("구현 준비중");
		System.exit(0);	
	}

}