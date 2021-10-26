package tset;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] students = null;
		int studentNum = 0;

		boolean run = true;

		while (run) {
			System.out.println("=== 1.학생수 입력 2.학생정보 등록 3.학생정보 전체조회 4.학생정보 분석 5.종료 ===");
			System.out.println("선택 >");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("학생 수 >");
				studentNum = scanner.nextInt();
				students = new Student[studentNum];
				break;
			case 2:
				for (int i = 0; i < students.length; i++) {
					System.out.println("학번 >");
					int no = scanner.nextInt();
					System.out.println("이름 >");
					String name = scanner.next();
					System.out.println("점수 >");
					int score = scanner.nextInt();
					Student student = new Student(no, name, score);
					students[i] = student;
				}
				break;
			case 3:
				for (int i = 0; i < students.length; i++) {
					Student student = students[i];
					System.out.printf("%d 학번의 점수는 %d입니다.\n", student.getNo(), student.getScore());
				}
				break;
			case 4:
				// 최고 가격을 가지는 제품
				int max = 0;
				int min = 2147483647;
				int index = 0;
				int index2 = 0;
				for(int i=0; i<students.length; i++) {
					Student student = students[i];
					if(student.getScore() > max) {
						max = student.getScore();
						index = i;
					}
				}
				
				for(int i=0; i<students.length; i++) {
					Student student = students[i];
					if(student.getScore() < min) {
						min = student.getScore();
						index2 = i;
					}
				}


				int sum = 0;
				for(Student student : students) {
					if(student.getScore() == max) {
						continue;
					} else if(student.getScore() == min) {
						continue;
					}
					sum += student.getScore();
				}
				System.out.printf("최고 점수 : %d점, 학번 : %d \n",students[index].getScore(),students[index].getNo());
				System.out.printf("최저 점수 : %d점, 학번 : %d \n",students[index2].getScore(),students[index2].getNo());
				System.out.printf("최고점, 최저점을 제외한 평균 점수는 %.2f점 입니다.\n",(double) sum/(students.length-2));
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
