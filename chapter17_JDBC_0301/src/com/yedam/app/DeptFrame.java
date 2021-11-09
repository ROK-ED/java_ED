package com.yedam.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.app.common.Frame;
import com.yedam.app.dept.Departments;
import com.yedam.app.dept.DeptDAO;
import com.yedam.app.dept.DeptDAOImpl;

public class DeptFrame implements Frame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	DeptDAO dao = DeptDAOImpl.getInstance();
	/*
	// 생성자
	public DeptFrame() {
		// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록
				insertDept();
			} else if (menuNo == 2) { // 수정
				updateDept();
			} else if (menuNo == 3) { // 삭제
				deleteDept();
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
	*/
	
	// 메소드
	// 프로그램 실행 메소드
	public void run() {
		// 메뉴를 출력하고 메뉴를 선택해서 해당 기능을 호출
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) { // 등록
				insertDept();
			} else if (menuNo == 2) { // 수정
				updateDept();
			} else if (menuNo == 3) { // 삭제
				deleteDept();
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
		System.out.println("================================================");
		System.out.println("==1.등록 2.수정 3.삭제 4.부서조회 5.부서전체조회 9.종료==");
		System.out.println("================================================");
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

	// 공통된 기능 - 입력
	Departments inputAll() {
		Departments dept = new Departments();
		System.out.println("부서번호>>");
		dept.setDepartmentId(scanner.nextInt());
		System.out.println("부서명>>");
		dept.setDepartmentName(scanner.next());
		System.out.println("매니저>>");
		dept.setManagerId(scanner.nextInt());
		System.out.println("지역>>");
		dept.setLocationId(scanner.nextInt());

		return dept;
	}

	int inputDeptNo() {
		int deptNo = 0;
		System.out.println("부서번호>>");
		deptNo = scanner.nextInt();
		return deptNo;
	}

	// 각 기능마다 메소드
	// - 종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	// - 전체조회
	void selectAll() {
		List<Departments> list = dao.selectAll();
		for (Departments dept : list) {
			System.out.println(dept);
		}
	}

	// - 단건조회
	void selectOne() {
		int deptNo = inputDeptNo();
		Departments dept = dao.selectOne(deptNo);
		System.out.println(dept);
	}
	
	// - 입력
	void insertDept() {
		Departments dept = inputAll();
		dao.insert(dept);
	}
	
	// - 수정
	void updateDept() {
		Departments dept = inputAll();
		dao.update(dept);
	}
	
	// - 삭제
	void deleteDept() {
		int deptNo = inputDeptNo();
		dao.delete(deptNo);
	}

}
