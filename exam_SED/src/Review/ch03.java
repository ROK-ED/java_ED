package Review;

import java.util.Scanner;

public class ch03 {
	public static void main(String[] args) {
		// 문제 3) 입력한 수만큼 주사위(1~6)를 굴려서 나온 수들 중 최고 수와 최저 수, 수들의 합을 구하는 프로그램을 구현하세요.

		Scanner scanner = new Scanner(System.in);

		int[] numList = null;
		int size = 0;

		boolean run = true;

		while (run) {
			System.out.println("1.숫자입력 | 2.주사위 굴리기 | 3.최고 수 | 4.최저 수 | 5.총합 | 6.종료");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();
		}

	}

}
