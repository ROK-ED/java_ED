package Review;

import java.util.Scanner;

public class ch02 {

	public static void main(String[] args) {
		// 문제2) 두 수를 입력받아 두수의 대소관계 및 사칙연산을 수행하는 프로그램을 구현하세요.

		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;

		boolean run = true;
		while (run) {
			System.out.println("input.숫자입력 | +.더하기 | -.빼기 | *.곱하기 | /.나누기 | ?.대소관계 | exit.종료 ");
			System.out.println("수행해야할 명령을 입력하세요. ");
			String menu = scanner.next();
		}
	}

}
