package com.yedam.app;

public class Question {
/*	
	- 주제 : 베스킨라빈스 재고관리(관리단위 : g)
	- 기능
	      => 입고기능 : insert
	      		1) 전제조건 - 보유하고 있는 수량이 0g일 경우에 입고된다고 가정
	      		2) 예외조건 - 등록되어 있는 제품일 경우 등록불가
	      => 출고기능 : update
	      		1) 한번 출고할 때 등록된 수량만 출고가능
	      		2) 출고 후 현재 수량을 안내메세지로 출력
	      => 반품기능 : delete
	      => 전체조회 : selectAll
	      => 제품조회 : selectOne
	      => 구매임박제품조회 : selectAll
	      		1) 현재수량이 기준 수량보다 작을 경우
	      		2) 입고일로부터 15일이 지났을 경우 
	 - DB 테이블
	 	  => 제품번호, 제품명, 입고수량, 현재수량, 입고일
*/
	
	/*create table baskinrobbins(
product_id NUMBER primary key,
product_name VARCHAR2(20),
input_value  NUMBER,
now_value NUMBER,
input_date DATE default sysdate);*/  //DB에 입력할것
}
