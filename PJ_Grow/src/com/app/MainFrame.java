package com.app;

import java.util.List;
import java.util.Scanner;

import com.app.common.Frame;
import com.app.data.acct.Acct;
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
		System.out.println("로그인을 시작합니다.");
		Acct acct = new Acct();
		System.out.println("ID>>");
		String acctId = scanner.nextLine();

		if ((acct = adao.acctSelect(acctId)) == null) {
			System.out.println("ID가 없습니다.");
			return;
		} else {
			acct = adao.acctSelect(acctId);
			System.out.println("PASSWORD>>");
			String acctPw = scanner.nextLine();
			if (acctPw.equals(acct.getAcctPw())) {
				System.out.println("접속되었습니다.");

				/***************************** 메뉴호출 *****************************/
				// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
				while (true) {
					menuPrint();// 이메소드 왜 두번 출력되는지 확인 해야됨
					int menuNo = menuSelect();

					if (menuNo == 2) { // 등록 및 수정 ~ 플레이
						create();
					} else if (menuNo == 1) { // 불러오기
						cont();
					} else if (menuNo == 3) { // 삭제 ~ 캐릭터를 기반한 전부
						deleteData();
					} else if (menuNo == 4) { // 단건조회
						selectAllCode();
					} else if (menuNo == 5) { // 전체조회
						selectAll();
					} else if (menuNo == 9) { // 종료
						end();
						break;
					}
				}
			} else {
				System.out.println("PASSWORD가 일치하지 않습니다.");
				return;
			}

		}
	}

	// 메뉴를 출력하는 메소드
	void menuPrint() {
		System.out.println("");
		System.out.println("==================================================================");
		System.out.println("== 1.이어하기 2.새로시작 3.코드삭제 4.전체캐릭터조회 5.전체플레이로그조회 9.종료 ==");
		System.out.println("==================================================================");
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
		System.exit(0);
	}

	// - 등록 및 실행
	void create() {
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
		System.out.println();
		System.out.println();
		System.out.println("데이터 수집을 위해 좋아하는 숫자와 나이를 입력해주시길 바랍니다.");
		System.out.println("이 숫자로 데이터를 불러올수 있습니다.");
		System.out.println("숫자(가능한 길게해주세요)>>"); // 나중에 중복안되게 수정해야됨
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
		fPlayer.setPlayerHP(age + (int) (difficulty / 1.2));
		fPlayer.setPlayerFloor(difficulty);
		System.out.println("주사위를 굴려 공격력과 방어력에 보너스 수치를 드리겠습니다.");
		System.out.println("우선 공격력을 정해볼까요.");
		System.out.println("주사위를 굴려주세요");
		System.out.println("Enter를 눌러주세요");
		System.out.println(scanner.nextLine());
		dice = (int) (Math.random() * 6) + 1;
		System.out.println("공격력 보정결과 : " + dice);
		fPlayer.setPlayerATK(1 + dice + (int) (difficulty / 1.2));
		System.out.println();
		System.out.println("다음은 방어력을 정해볼까요.");
		System.out.println("주사위를 굴려주세요");
		System.out.println("Enter를 눌러주세요");
		System.out.println(scanner.nextLine());
		dice = (int) (Math.random() * 6) + 1;
		System.out.println("방어력 보정결과 : " + dice);
		fPlayer.setPlayerDEF(1 + dice + (int) (difficulty / 1.2));

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

//		// 적생성
//		fEnemy.setEnemyPlayerId(code);
//		fEnemy.setEnemyId(1);
//		fEnemy.setEnemyName("Inside (" + difficulty + ")");
//		fEnemy.setEnemyHP(difficulty);
//		fEnemy.setEnemyATK(difficulty);
//		fEnemy.setEnemyDEF(difficulty);
//		fEnemy.setEnemyFloor(difficulty);
//		edao.enemyInsert(fEnemy);
//		System.out.println("enemy 생성 완료");
//		System.out.println("난이도에 따른 게임 환경을 생성했습니다.");

//		// 레코드생성
//		fRecord.setRecordPlayerId(code);
//		fRecord.setRecordPlayerName(name);
//		fRecord.setRecordLvlFloor(difficulty);
//		fRecord.setRecordEvent(fLvl.getLvlEvent());
////디폴트	fRecord.setRecordStartDate();
////디폴트	fRecord.setRecordEndDate();	
//		fRecord.setRecordEnemyId(fEnemy.getEnemyId());
//
//		rdao.recordInsert(fRecord);
		System.out.println("초기값이 기록되었습니다.");
		System.out.println("Enter를 눌러주세요");
		System.out.println(scanner.nextLine());
		// 초기값들 조회
		System.out.println();
		System.out.println("====================================================================");
		System.out.println("===============================STATUS===============================");
		System.out.println(pdao.playerSelect(code));
		System.out.println("===============================STATUS===============================");
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
		play(code);
	}

	// 계속하기
	void cont() {
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

		System.out.println("이어할 캐릭터 CODE를 입력해주세요");
		System.out.println("CODE>>");
		code = Integer.parseInt(scanner.nextLine());

		if ((fPlayer = pdao.playerSelect(code)) == null) {
			System.out.println("CODE가 없습니다.");
			return;
		} else {
			System.out.println("이전 데이터를 불러옵니다.");
			fPlayer = pdao.playerSelect(code);
			fLvl = ldao.lvlSelect(code);
//			fEnemy = edao.enemySelect(code);
			fRecord = rdao.recordSelect(code);
			System.out.println(fPlayer);
			System.out.println(fLvl);
//			System.out.println(fEnemy);

			System.out.println("만약 체력이 0인걸 불러오면 바로 죽으니 기대는 말아주시길 바랍니다.");
			System.out.println("Enter");
			System.out.println(scanner.nextLine());
			play(code);

		}

	}

	// 마이너스값은 제로로
	int mZ(int a) {

		if (a < 0) {
			return 0;
		} else {
			return a;
		}

	}

	// - PLAY
	void play(int code) {

		Player fPlayer = new Player();
		Lvl fLvl = new Lvl();
		Enemy fEnemy = new Enemy();
		Record fRecord = new Record();
		int difficulty = 0;
		int age = 0;
		int dice = 0; // 주사위 하나 (int) (Math.random() * 6) + 1;
		int adice = 0;
		int ddice = 0;
		int playerDoubleDice = 0; // 주사위 둘 (int) (Math.random() * 12) + 1;
		int enemyDoubleDice = 0;
		int dmg = mZ(0);
		int php = 0;
		int patk = 0;
		int pdef = 0;
		String name = null;
		int pid = 0;
		pid = code;

		fPlayer = pdao.playerSelect(code);
		fLvl = ldao.lvlSelect(code);
//		fEnemy = edao.enemySelect(code);
		fRecord = rdao.recordSelect(code);
//		System.out.println(fPlayer);
//		System.out.println(fLvl);

		/************************** PLAY n층(이곳부터 이벤트 및 분기) *************************/
		System.out.println("======================게임에 입장합니다.======================");
		System.out.println("Enter");
		System.out.println(scanner.nextLine());

		//int i = 0;
		int e = 1;
		while (fPlayer.getPlayerHP() > 0) {
			int floor = 0;
			int floorselect = 0;
			fLvl = ldao.lvlSelect(code);
			floor = fLvl.getLvlFloor();  //+ i
			System.out.println("==============================================");
			System.out.println("=============" + floor + " 층에 입장하였습니다.=============");
			System.out.println("==============================================");
			System.out.println(fLvl);
			System.out.println("===============================STATUS===============================");
			System.out.println(pdao.playerSelect(code));
			System.out.println("===============================STATUS===============================");
			System.out.println("Enter");
			System.out.println(scanner.nextLine());
			System.out.println();
			System.out.println();
			System.out.println("==============================================");
			System.out.println("===========  1.전투  2.이벤트 9.이전단계  ===========");
			System.out.println("==============================================");
			System.out.println("선택>>");
			floorselect = menuSelect();
			if (floorselect == 1) {
				// 전투
				// 적생성 ~위에껀 나중에 삭제해야됨
				
				fEnemy.setEnemyPlayerId(code);
				fEnemy.setEnemyId(e);
				fEnemy.setEnemyName("Inside (" + floor + ")");
				fEnemy.setEnemyHP(floor - mZ(fLvl.getLvlHPBonus()));
				fEnemy.setEnemyATK(floor - mZ(fLvl.getLvlATKBonus()));

				fEnemy.setEnemyDEF(floor - mZ(fLvl.getLvlDEFBonus()));
				fEnemy.setEnemyFloor(floor);
				edao.enemyInsert(fEnemy);
				System.out.println("enemy 생성 완료");
				System.out.println(fEnemy.getEnemyName() + "과 전투를 시작합니다.");
				while (fEnemy.getEnemyHP() > 0) {

					System.out.println("주사위를 굴려주세요");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					playerDoubleDice = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
					enemyDoubleDice = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
					System.out.println("내 주사위 : " + playerDoubleDice);
					System.out.println("적 주사위 : " + enemyDoubleDice);
					if (playerDoubleDice == enemyDoubleDice) {
						System.out.println("동시에 맞았습니다.");
						fPlayer.setPlayerHP(fPlayer.getPlayerHP() - enemyDoubleDice);
						fEnemy.setEnemyHP(fEnemy.getEnemyHP() - playerDoubleDice);
					} else if (playerDoubleDice == 2) {
						System.out.println("회피하였습니다.");
					} else if (playerDoubleDice == 4) {
						System.out.println("회피하였습니다.");
					} else if (playerDoubleDice / 2 > enemyDoubleDice) {
						System.out.println("크리티컬 공격합니다.");
						fEnemy.setEnemyHP(fEnemy.getEnemyHP() - mZ((2 * playerDoubleDice + fPlayer.getPlayerATK())
								- (enemyDoubleDice + fEnemy.getEnemyDEF())));
					} else if (playerDoubleDice < enemyDoubleDice/2) {
						System.out.println("크리티컬 공격을 방어합니다.");
						fPlayer.setPlayerHP(fPlayer.getPlayerHP() - mZ((2*enemyDoubleDice + fEnemy.getEnemyATK())
								- (playerDoubleDice + fPlayer.getPlayerDEF())));
					} else if (playerDoubleDice > enemyDoubleDice) {
						System.out.println("공격합니다.");
						fEnemy.setEnemyHP(fEnemy.getEnemyHP()-(playerDoubleDice-enemyDoubleDice) - mZ((playerDoubleDice + fPlayer.getPlayerATK())
								- (enemyDoubleDice + fEnemy.getEnemyDEF())));
					} else if (playerDoubleDice < enemyDoubleDice) {
						System.out.println("방어합니다.");
						fPlayer.setPlayerHP(fPlayer.getPlayerHP()-(enemyDoubleDice-playerDoubleDice) - mZ((enemyDoubleDice + fEnemy.getEnemyATK())
								- (playerDoubleDice + fPlayer.getPlayerDEF())));
					}
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					System.out.println("PLAYER HP : " + fPlayer.getPlayerHP());
					System.out.println("ENEMY HP : " + fEnemy.getEnemyHP());
					System.out.println(fPlayer);
					System.out.println(fEnemy);

					if (fPlayer.getPlayerHP() <= 0) {
						pdao.playerHPUpdate(fPlayer);
						System.out.println("YOU DIE");
						return;
					}
				}
				System.out.println("적을 처치하였습니다.");
				System.out.println("능력치 보상이 주어집니다.");
				System.out.println("ATK 보너스");
				System.out.println("주사위를 굴려주세요>>");
				System.out.println("Enter");
				System.out.println(scanner.nextLine());
				adice =(int) (Math.random() * 6) + 1;
				System.out.println("공격력이 " +adice + "상승되었습니다.");
				fLvl.setLvlATKBonus(adice);
				ldao.lvlATKBonusUpdate(fLvl);
				System.out.println();
				System.out.println();
				System.out.println("DEF 보너스");
				System.out.println("주사위를 굴려주세요>>");
				System.out.println("Enter");
				System.out.println(scanner.nextLine());
				ddice =(int) (Math.random() * 6) + 1;
				System.out.println("방어력이 " +adice + "상승되었습니다.");
				fLvl.setLvlDEFBonus(ddice);
				ldao.lvlDEFBonusUpdate(fLvl);
				System.out.println();
				System.out.println();
				fLvl.setLvlFloor(floor+1);
				ldao.lvlFloorUpdate(fLvl);
				fLvl.setLvlEvent("전투");
				ldao.lvlEventUpdate(fLvl);
				System.out.println("전투가 종료되었습니다.");
				fPlayer.setPlayerFloor(floor+1);
				pdao.playerNowFloorUpdate(fPlayer);
				php = fPlayer.getPlayerHP();
				fPlayer.setPlayerHP(php+1);
				pdao.playerHPUpdate(fPlayer);
				patk = fPlayer.getPlayerATK();
				fPlayer.setPlayerATK(patk+fLvl.getLvlATKBonus());
				pdao.playerATKUpdate(fPlayer);
				pdef = fPlayer.getPlayerDEF();
				fPlayer.setPlayerDEF(pdef+fLvl.getLvlDEFBonus());
				pdao.playerDEFUpdate(fPlayer);
				System.out.println("캐릭터가 성장하였습니다.");
				fRecord.setRecordPlayerId(pid);
				name = fRecord.getRecordPlayerName();
				fRecord.setRecordPlayerName(name);
				fRecord.setRecordLvlFloor(floor);
				fRecord.setRecordEvent("전투");
				fRecord.setRecordEnemyId(e);
				rdao.recordInsert(fRecord);
				System.out.println("기록이 완료되었습니다.");
				e++;
				System.out.println(fLvl.getLvlFloor()+"층으로 올라갑니다.");
				System.out.println("Enter");
				System.out.println(scanner.nextLine());
			} else if (floorselect == 2) {
				// 이벤트
				int room = 0; 
				room =(int) (Math.random() * 4) + 1;
				
				if(room == 1 ) {
					//휴식 ~주사위 체력up
					floor = fLvl.getLvlFloor();
					System.out.println(floor+"층 에서 휴식을 취합니다.");
					System.out.println("두개의 주사위를 돌린 값만큼 체력을 회복합니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					playerDoubleDice = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
					System.out.println(playerDoubleDice + "만큼 체력을 회복합니다.");
					php = fPlayer.getPlayerHP();
					fPlayer.setPlayerHP(php+playerDoubleDice);
					pdao.playerHPUpdate(fPlayer);      
					fPlayer.setPlayerFloor(floor+1);
					pdao.playerNowFloorUpdate(fPlayer);
					System.out.println("체력을 회복했습니다.");
					fRecord.setRecordPlayerId(pid);
					name = fRecord.getRecordPlayerName();
					fRecord.setRecordPlayerName(name);
					fRecord.setRecordLvlFloor(floor);
					fRecord.setRecordEvent("휴식");
					e=fEnemy.getEnemyId();
					fRecord.setRecordEnemyId(e);
					rdao.recordInsert(fRecord);
					System.out.println("기록이 완료되었습니다.");
					fLvl.setLvlFloor(floor+1);
					ldao.lvlFloorUpdate(fLvl);
					System.out.println(fLvl.getLvlFloor()+"층으로 올라갑니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					
				}else if(room ==2) {
					//수련 ~ 체력, 공격력, 방어력 UP / 내면은 오른 수치만큼 dewn 성장
					floor = fLvl.getLvlFloor();
					System.out.println(floor+"층 에서 수련을 합니다.");
					System.out.println("주사위를 돌려 각 능력치를 상승시킵니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					System.out.println("능력치 보상이 주어집니다.");
					System.out.println("ATK 보너스");
					System.out.println("주사위를 굴려주세요>>");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					adice =(int) (Math.random() * 6) + 1;
					System.out.println("공격력이 " +adice + "상승되었습니다.");
					fLvl.setLvlATKBonus(adice);
					ldao.lvlATKBonusUpdate(fLvl);
					System.out.println();
					System.out.println();
					System.out.println("DEF 보너스");
					System.out.println("주사위를 굴려주세요>>");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					ddice =(int) (Math.random() * 6) + 1;
					System.out.println("방어력이 " +adice + "상승되었습니다.");
					fLvl.setLvlDEFBonus(ddice);
					ldao.lvlDEFBonusUpdate(fLvl);
					System.out.println();
					System.out.println();
					fLvl.setLvlFloor(floor+1);
					ldao.lvlFloorUpdate(fLvl);
					fLvl.setLvlEvent("수련");
					ldao.lvlEventUpdate(fLvl);
					System.out.println("수련이 종료되었습니다.");
					fPlayer.setPlayerFloor(floor+1);
					pdao.playerNowFloorUpdate(fPlayer);
					php = fPlayer.getPlayerHP();
					fPlayer.setPlayerHP(php+1);
					pdao.playerHPUpdate(fPlayer);
					patk = fPlayer.getPlayerATK();
					fPlayer.setPlayerATK(patk+fLvl.getLvlATKBonus());
					pdao.playerATKUpdate(fPlayer);
					pdef = fPlayer.getPlayerDEF();
					fPlayer.setPlayerDEF(pdef+fLvl.getLvlDEFBonus());
					pdao.playerDEFUpdate(fPlayer);
					System.out.println("캐릭터가 성장하였습니다.");
					fRecord.setRecordPlayerId(pid);
					name = fRecord.getRecordPlayerName();
					fRecord.setRecordPlayerName(name);
					fRecord.setRecordLvlFloor(floor);
					fRecord.setRecordEvent("수련");
					e=fEnemy.getEnemyId();
					fRecord.setRecordEnemyId(e);
					rdao.recordInsert(fRecord);
					System.out.println("기록이 완료되었습니다.");
					System.out.println(fLvl.getLvlFloor()+"층으로 올라갑니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					
				}else if(room ==3) {
					//함정 ~주사위 자신 체력, 공격력, 방어력 DOWN, 내면 UP 
					floor = fLvl.getLvlFloor();
					System.out.println(floor+"층 에서 함정에 걸렸습니다.");
					System.out.println("주사위를 돌려 각 능력치를 하락시킵니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					System.out.println("능력치 보상이 주어집니다.");
					System.out.println("ATK 보너스");
					System.out.println("주사위를 굴려주세요>>");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					adice =-((int) (Math.random() * 6) + 1);
					System.out.println("공격력이 " +adice + "하락되었습니다.");
					fLvl.setLvlATKBonus(adice);
					ldao.lvlATKBonusUpdate(fLvl);
					System.out.println();
					System.out.println();
					System.out.println("DEF 보너스");
					System.out.println("주사위를 굴려주세요>>");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					ddice =-((int) (Math.random() * 6) + 1);
					System.out.println("방어력이 " +adice + "하락되었습니다.");
					fLvl.setLvlDEFBonus(ddice);
					ldao.lvlDEFBonusUpdate(fLvl);
					System.out.println();
					System.out.println();
					fLvl.setLvlFloor(floor+1);
					ldao.lvlFloorUpdate(fLvl);
					fLvl.setLvlEvent("함정");
					ldao.lvlEventUpdate(fLvl);
					System.out.println("함정에 탈출하였습니다.");
					fPlayer.setPlayerFloor(floor+1);
					pdao.playerNowFloorUpdate(fPlayer);
					php = fPlayer.getPlayerHP();
					fPlayer.setPlayerHP(php+1);
					pdao.playerHPUpdate(fPlayer);
					patk = fPlayer.getPlayerATK();
					fPlayer.setPlayerATK(patk+fLvl.getLvlATKBonus());
					pdao.playerATKUpdate(fPlayer);
					pdef = fPlayer.getPlayerDEF();
					fPlayer.setPlayerDEF(pdef+fLvl.getLvlDEFBonus());
					pdao.playerDEFUpdate(fPlayer);
					System.out.println("캐릭터가 능력치가 하락하였습니다.");
					fRecord.setRecordPlayerId(pid);
					name = fRecord.getRecordPlayerName();
					fRecord.setRecordPlayerName(name);
					fRecord.setRecordLvlFloor(floor);
					fRecord.setRecordEvent("함정");
					e=fEnemy.getEnemyId();
					fRecord.setRecordEnemyId(e);
					rdao.recordInsert(fRecord);
					System.out.println("기록이 완료되었습니다.");
					System.out.println(fLvl.getLvlFloor()+"층으로 올라갑니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					System.out.println();
				}else if(room ==4) {
					//전투
					// 전투
					// 적생성 ~위에껀 나중에 삭제해야됨
					
					fEnemy.setEnemyPlayerId(code);
					fEnemy.setEnemyId(e);
					fEnemy.setEnemyName("Inside (" + floor + ")");
					fEnemy.setEnemyHP(floor - mZ(fLvl.getLvlHPBonus()));
					fEnemy.setEnemyATK(floor - mZ(fLvl.getLvlATKBonus()));

					fEnemy.setEnemyDEF(floor - mZ(fLvl.getLvlDEFBonus()));
					fEnemy.setEnemyFloor(floor);
					edao.enemyInsert(fEnemy);
					System.out.println("enemy 생성 완료");
					System.out.println(fEnemy.getEnemyName() + "과 전투를 시작합니다.");
					while (fEnemy.getEnemyHP() > 0) {

						System.out.println("주사위를 굴려주세요");
						System.out.println("Enter");
						System.out.println(scanner.nextLine());
						playerDoubleDice = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
						enemyDoubleDice = ((int) (Math.random() * 6) + 1) + ((int) (Math.random() * 6) + 1);
						System.out.println("내 주사위 : " + playerDoubleDice);
						System.out.println("적 주사위 : " + enemyDoubleDice);
						if (playerDoubleDice == enemyDoubleDice) {
							System.out.println("동시에 맞았습니다.");
							fPlayer.setPlayerHP(fPlayer.getPlayerHP() - enemyDoubleDice);
							fEnemy.setEnemyHP(fEnemy.getEnemyHP() - playerDoubleDice);
						} else if (playerDoubleDice == 2) {
							System.out.println("회피하였습니다.");
						} else if (playerDoubleDice == 4) {
							System.out.println("회피하였습니다.");
						} else if (playerDoubleDice / 2 > enemyDoubleDice) {
							System.out.println("크리티컬 공격합니다.");
							fEnemy.setEnemyHP(fEnemy.getEnemyHP() - mZ((2 * playerDoubleDice + fPlayer.getPlayerATK())
									- (enemyDoubleDice + fEnemy.getEnemyDEF())));
						} else if (playerDoubleDice < enemyDoubleDice/2) {
							System.out.println("크리티컬 공격을 방어합니다.");
							fPlayer.setPlayerHP(fPlayer.getPlayerHP() - mZ((2*enemyDoubleDice + fEnemy.getEnemyATK())
									- (playerDoubleDice + fPlayer.getPlayerDEF())));
						} else if (playerDoubleDice > enemyDoubleDice) {
							System.out.println("공격합니다.");
							fEnemy.setEnemyHP(fEnemy.getEnemyHP()-(playerDoubleDice-enemyDoubleDice) - mZ((playerDoubleDice + fPlayer.getPlayerATK())
									- (enemyDoubleDice + fEnemy.getEnemyDEF())));
						} else if (playerDoubleDice < enemyDoubleDice) {
							System.out.println("방어합니다.");
							fPlayer.setPlayerHP(fPlayer.getPlayerHP()-(enemyDoubleDice-playerDoubleDice) - mZ((enemyDoubleDice + fEnemy.getEnemyATK())
									- (playerDoubleDice + fPlayer.getPlayerDEF())));
						}
						System.out.println("Enter");
						System.out.println(scanner.nextLine());
						System.out.println("PLAYER HP : " + fPlayer.getPlayerHP());
						System.out.println("ENEMY HP : " + fEnemy.getEnemyHP());
						System.out.println(fPlayer);
						System.out.println(fEnemy);

						if (fPlayer.getPlayerHP() <= 0) {
							pdao.playerHPUpdate(fPlayer);
							System.out.println("YOU DIE");
							return;
						}
					}
					System.out.println("적을 처치하였습니다.");
					System.out.println("능력치 보상이 주어집니다.");
					System.out.println("ATK 보너스");
					System.out.println("주사위를 굴려주세요>>");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					adice =(int) (Math.random() * 6) + 1;
					System.out.println("공격력이 " +adice + "상승되었습니다.");
					fLvl.setLvlATKBonus(adice);
					ldao.lvlATKBonusUpdate(fLvl);
					System.out.println();
					System.out.println();
					System.out.println("DEF 보너스");
					System.out.println("주사위를 굴려주세요>>");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
					ddice =(int) (Math.random() * 6) + 1;
					System.out.println("방어력이 " +adice + "상승되었습니다.");
					fLvl.setLvlDEFBonus(ddice);
					ldao.lvlDEFBonusUpdate(fLvl);
					System.out.println();
					System.out.println();
					fLvl.setLvlFloor(floor+1);
					ldao.lvlFloorUpdate(fLvl);
					fLvl.setLvlEvent("전투");
					ldao.lvlEventUpdate(fLvl);
					System.out.println("전투가 종료되었습니다.");
					fPlayer.setPlayerFloor(floor+1);
					pdao.playerNowFloorUpdate(fPlayer);
					php = fPlayer.getPlayerHP();
					fPlayer.setPlayerHP(php+1);
					pdao.playerHPUpdate(fPlayer);
					patk = fPlayer.getPlayerATK();
					fPlayer.setPlayerATK(patk+fLvl.getLvlATKBonus());
					pdao.playerATKUpdate(fPlayer);
					pdef = fPlayer.getPlayerDEF();
					fPlayer.setPlayerDEF(pdef+fLvl.getLvlDEFBonus());
					pdao.playerDEFUpdate(fPlayer);
					System.out.println("캐릭터가 성장하였습니다.");
					fRecord.setRecordPlayerId(pid);
					name = fRecord.getRecordPlayerName();
					fRecord.setRecordPlayerName(name);
					fRecord.setRecordLvlFloor(floor);
					fRecord.setRecordEvent("전투");
					fRecord.setRecordEnemyId(e);
					rdao.recordInsert(fRecord);
					System.out.println("기록이 완료되었습니다.");
					e++;
					System.out.println(fLvl.getLvlFloor()+"층으로 올라갑니다.");
					System.out.println("Enter");
					System.out.println(scanner.nextLine());
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
			} else if (floorselect == 9) {
				// 종료 
				return;
			}
			//i++;

		}

		System.out.println("YOU DIE");

	}

	/*********************************************************************************/
	// 삭제 ~ 캐릭터를 기반한 전부 레코드 제외
	void deleteData() {
		Player fPlayer = new Player();
		Lvl fLvl = new Lvl();
		Enemy fEnemy = new Enemy();
		
		int code = 0;
		System.out.println("삭제할 코드를 입력해 주세요");
		System.out.println("CODE>>");
		code = Integer.parseInt(scanner.nextLine());
		edao.enemyDelete(code);
		ldao.lvlDelete(code);
		pdao.playerDelete(code);
		System.out.println("CODE : " + code + " 가 삭제되었습니다.");

	}

	// - 전체조회
	void selectAll() {
		System.out.println("전체플레이 확인");
		List<Record> list = rdao.recordSelectAll();
		for(Record record : list) {
			System.out.println(record);
		}
	}

	// - 단건조회
	void selectAllCode() {
		System.out.println("전체 캐릭터를 확인합니다.");
		List<Player> list = pdao.playerSelectAll();
		for(Player player : list) {
			System.out.println(player);
		}
		
	}

}








