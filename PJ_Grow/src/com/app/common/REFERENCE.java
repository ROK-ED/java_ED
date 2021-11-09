package com.app.common;

public class REFERENCE {
	
	private final String SELECT_ALL = "select * from lvl order by floor";
	private final String SELECT_ONE = "select * from lvl where floor = ?";
	private final String INSERT = "insert into lvl values(?,?,?,?,?)";
	private final String FLOOR_UPDATE = "update lvl set floor = ?";
	private final String EVENT_UPDATE = "update lvl set event = ? where floor = ?";
	private final String HPBONUS_UPDATE = "update lvl set hpBonus = ? where floor = ?";
	private final String ATKBONUS_UPDATE = "update lvl set atkBonus = ? where floor = ?";
	private final String DEFBONUS_UPDATE = "update lvl set defBonus = ? where floor = ?";
	private final String DELETE = "delete from lvl where floor = ?";
    
}    

/*	
- 주제 : 층 오르는 텍스트 게임
- 기능 : 최종으로 몇층까지 올라갔는지 확인, 선택하면 층마다 어떤 이벤트를 했는지도 확인가능 (sql read(selectAll))
	   초기 캐릭터 설정 ~체력(나이), 공격력, 방어력 세가지 주사위 한번씩 랜덤으로 기본설정
	   -레벨업x 적을 잡은 전리품과 아이템으로만 스펙변경
	   -체력이 0이 되면 종료//(체력을 sql update, delete로 더이상 delete 할것이 없으면 죽음)이건 무리
	   기본적인 층 구조 (sql 틀만 create, 자료 update)
	   -랜덤으로 이벤트 결정
	   x-적 ~ 랜덤으로 적을 만나서 전투 후 전리품으로 스펙 UP  
	   x-엘리트 적 ~ 기본 적 보다 스펙 2배, 조우 확률은 낮음
	   -적~내면 시작치 전부 내면의 체력은 층수로 고정 공1,방0 층수올라가면서 층수 스텟 기반 랜덤으로 능력시 변경
	      ~적 처치시 주사위 수치로 능력치 랜덤 성장
	   x-아이템 획득 ~ 체력, 공격력, 방어력 UP
	   -수련 ~ 체력, 공격력, 방어력 UP / 내면은 오른 수치의 반만 성장
	   -함정 ~주사위 자신 체력, 공격력, 방어력 DOWN, 내면 UP
	   -휴식 ~주사위 체력up, 내면 스텟 DOWN 
	   x적,아이템 데이터 
	   x-이름 (층수)층의 적,아이템 or sql 기록 데이터로 (sql read)
	   x-체력, 공격력, 방어력 전부 올라가는 층수 기반
	   전투
	   주사위를 굴려 스펙에 보정치로 싸움 or 가위 바위 보(이걸로) 
	   
	   시작화면
	   시작
	   랭킹조회 가능
	   
	   
try {
	connect();
	
	
} catch (SQLException e) {
	e.printStackTrace();
} finally {
	disconnect();
}	   




create table lvl(
floor NUMBER primary key,
event VARCHAR2(20),
hpBonus NUMBER,
atkBonus NUMBER,
defBonus NUMBER);

create table player(
id NUMBER primary key,
name VARCHAR2(20),
hp NUMBER,
atk NUMBER,
def NUMBER,
nowfloor NUMBER CONSTRAINT FLR REFERENCES lvl(floor));

create table enemy(
enemy_id NUMBER primary key,
enemy_name VARCHAR2(20),
enemy_hp NUMBER,
enemy_atk NUMBER,
enemy_def NUMBER,
nowfloor NUMBER CONSTRAINT FLR2 REFERENCES lvl(floor));

create table playrecord(
playerid NUMBER CONSTRAINT PID REFERENCES player(id),
playername VARCHAR2(20),
lvlfloor NUMBER CONSTRAINT FLR3 REFERENCES lvl(floor),
event VARCHAR2(20),
startDate DATE default sysdate,
endDate DATE default sysdate,
enemyid NUMBER CONSTRAINT EID REFERENCES enemy(enemy_id));

drop table playrecord;
drop table enemy;
drop table playerstatus;
drop table lvl;













질문 PlayerDAOImpl

@Override
public DATE endDataUpdate(PlayerStatus playerStatus) {
	//수정 : endData
	DATE result = new DATE();
	try {
		connect();
		
		pstmt = conn.prepareStatement(ENDDATE_UPDATE);
		pstmt.setDate(1, playerStatus.getPlayerEndDate());
		pstmt.setInt(2, playerStatus.getPlayerId());
		
		//result = pstmt.executeUpdate();/////////////////////////////
		
	} catch (SQLException e) {
		e.printStackTrace();
	} finally {
		disconnect();
	}
	return result;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 create table playerstatus(
id NUMBER primary key,
name VARCHAR2(20),
hp NUMBER,
atk NUMBER,
def NUMBER,
nowfloor NUMBER
--,creationDate DATE default sysdate,
--endDate DATE default sysdate
);

--create table life(
--life_player_hp NUMBER(1));




create table playrecord(
playerid NUMBER
--CONSTRAINT PID REFERENCES playerstatus(id)
,levelfloor NUMBER,
event VARCHAR2(20),
startDate DATE default sysdate,
endDate DATE default sysdate
);

create table enemy(
enemy_id NUMBER primary key,
enemy_name VARCHAR2(20),
enemy_life NUMBER,
enemy_atk NUMBER,
enemy_def NUMBER);

--create table item(
--item_id NUMBER primary key,
--item_name VARCHAR2(20),
--item_life NUMBER,
--item_atk NUMBER,
--item_def NUMBER);

create table lvl(
floor NUMBER
--primary key
,event VARCHAR2(20),
hpBonus NUMBER,
atkBonus NUMBER,
defBonus NUMBER);

drop table playrecord;
drop table enemy;
--drop table item;
--drop table life;
drop table lvl;
drop table playerstatus;   
    
    
    
    
    */