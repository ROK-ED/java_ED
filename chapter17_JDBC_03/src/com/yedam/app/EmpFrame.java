package com.yedam.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.yedam.app.dept.Departments;
import com.yedam.app.emp.Emp;
import com.yedam.app.emp.EmpDAO;
import com.yedam.app.emp.EmpDAOImpl;

public class EmpFrame {
	// 필드
	Scanner scanner = new Scanner(System.in);
	EmpDAO dao = EmpDAOImpl.getInstance();

	// 생성자
	public EmpFrame() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) {// 등록
				insertDept();
			} else if (menuNo == 2) {// 수정
				updateDept();
			} else if (menuNo == 3) {// 삭제
				deleteDept();
			} else if (menuNo == 4) {// 단건조회
				selectOne();
			} else if (menuNo == 5) {// 전체조회
				selectAll();
			} else if (menuNo == 9) {// 종료
				end();
				break;
			}
			
		}
	}

	// 메소드
	// 메뉴를 출력하는 메소드
	void menuPrint() {
		System.out.println();
		System.out.println("===============================================");
		System.out.println("1.등록  2.수정  3.삭제  4.사원조회  5.전체사원조회  9.종료");
		System.out.println("===============================================");
		System.out.println("선택 >>");
	}

	// 메뉴를 선택하는 메소드
	int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("없는 메뉴 입니다.");
		}
		return menuNo;
	}

	// 공통된 기능 - 입력
	Emp inputAll() {
		Emp emp = new Emp();

		System.out.println("사번>>");
		emp.setEmployeeId(scanner.nextInt());
		System.out.println("이름>>");
		emp.setFirstName(scanner.next());
		System.out.println("성>>");
		emp.setLastName(scanner.next());
		System.out.println("이메일>>");
		emp.setEmail(scanner.next());
		System.out.println("전화번호>>");
		emp.setPhoneNumber(scanner.next());
		System.out.println("입사일>>");
		// yyyy-MM-dd 일때만 자동으로 변경가능
		emp.setHireDate(Date.valueOf(scanner.next()));// 타입 변경필요
		System.out.println("직급>>");
		emp.setJobId(scanner.next());
		System.out.println("연봉>>");
		emp.setSalary(scanner.nextInt());
		System.out.println("상여>>");
		emp.setCommissionPct(scanner.nextDouble());
		System.out.println("상사>>");
		emp.setManagerId(scanner.nextInt());
		System.out.println("부서>>");
		emp.setDepartmentId(scanner.nextInt());

		return emp;

	}

	int inputEmployeeId() {
		int employeeId = 0;
		System.out.println("사번>>");
		employeeId = scanner.nextInt();
		return employeeId;
	}

	// 각 기능마다 메소드
	// -종료
	void end() {
		System.out.println("프로그램을 종료합니다.");
	}

	// -전체조회
	void selectAll() {
		List<Emp> list = dao.selectAll();
		for (Emp emp : list) {
			System.out.println(emp);
		}
	}

	// -단건조회
	void selectOne() {
		int employeeId = inputEmployeeId();
		Emp emp = dao.selectOne(employeeId);
		System.out.println(emp);

	}

	// -입력
	void insertDept() {
		Emp emp = inputAll();
		dao.insert(emp);
	}

	// -수정
	void updateDept() {
		Emp emp = new Emp();
		System.out.println("사번>>");
		emp.setEmployeeId(scanner.nextInt());

		System.out.println("성>>");
		emp.setLastName(scanner.next());

		dao.update(emp);

	}

	// -삭제
	void deleteDept() {
		int employeeId = inputEmployeeId();
		dao.delete(employeeId);
	}

}
