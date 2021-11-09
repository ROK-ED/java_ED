package com.yedam.app;

import java.util.Scanner;

import com.yedam.app.common.Frame;

public class AppMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("=============================");
			System.out.println("==1.사원정보  2.부서정보  9.종료==");
			System.out.println("=============================");
			System.out.println("선택 >>");
			int selected = scanner.nextInt();
			
			Frame frame = null;
			
			if (selected == 1) {
				frame = new EmpFrame();
			} else if (selected == 2) {
				frame = new DeptFrame();
			} else if (selected == 9) {
				System.out.println("종료");
				break;
			}
			frame.run();
		}
	}

}
