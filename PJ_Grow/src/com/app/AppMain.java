package com.app;

import java.util.Scanner;


import com.app.common.Frame;
import com.app.data.acct.Acct;
import com.app.data.acct.AcctDAO;
import com.app.data.acct.AcctDAOImpl;


public class AppMain {
	static Scanner scanner = new Scanner(System.in);
	static AcctDAO adao = AcctDAOImpl.getInstance();
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("=====================================================");
			System.out.println("== 1.시작 2.계정생성 3.계정확인 4.전체계정확인 5.계정삭제 9.종료 ==");
			System.out.println("=====================================================");
			System.out.println("선택 >>");
			int selected = scanner.nextInt();

			Frame frame = null;

			if (selected == 1) {
				frame = new MainFrame();
				frame.run();
			} else if (selected == 2) {
				acctInsert();
			} else if (selected == 3) {
				acctSelectOne();
			}else if (selected == 4) {
				acctSelectAll();
			}else if (selected == 5) {
				acctDelete();
			}else if (selected == 9) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}
	private static void acctDelete() {
		// TODO Auto-generated method stub
		System.out.println("구현 준비중");
		System.exit(0);		
	}
	private static void acctSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("구현 준비중");
		System.exit(0);	
	}
	private static void acctSelectOne() {
		// TODO Auto-generated method stub
		System.out.println("구현 준비중");
		System.exit(0);	
	}
	private static void acctInsert() {
		//계정 생성
		System.out.println("계정을 생성합니다.");
		Acct acct = new Acct();
		System.out.println("생성 ID>>");
		acct.setAcctId(scanner.next());
		System.out.println("생성 Password>>");
		acct.setAcctPw(scanner.next());
		
		adao.acctInsert(acct);
		System.out.println("아이디가 생성 되었습니다.");
		
	}
	
}
