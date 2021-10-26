package exam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제1) Student 클래스를 선언하시오.
				//		 - 학번(int), 이름(String), 점수(int)를 속성으로 가진다.
				//		 - 인스턴스를 생성 시 값을 초기화할 수 있도록 생성자를 가진다.
				//		 - 각 필드별로 Getter 함수를 가진다.
				
				
				// 문제2) 등록기능 구현
				//		- "1.학생수 입력 2.학생정보 등록 3.학생정보 전체조회 4.학생정보 분석 5.종료" 메뉴를 구성
				//		- 입력받은 학생 수에 등록할 수 있는 학생정보 수가 정해지도록 구현하세요.
				//		- 아래를 참조해서 각 학생의 정보를 입력하세요.
				//			1) 학번: 1001, 이름: 홍길동, 점수 : 100점
				//			2) 학번: 1002, 이름: 김유지, 점수 : 73점
				//			3) 학번: 1003, 이름: 이한대, 점수 : 92점
				//			4) 학번: 1004, 이름: 박순제, 점수 : 65점
				//			5) 학번: 1005, 이름: 한나라, 점수 : 86점
				
				// 문제3) 전체조회 구현
				//		- 전체 학생 정보에서 학번과 점수를 입력순으로 출력하세요.
				
				
				// 문제4) 분석기능 구현
				//		- 학생 정보 중 각 최고점과 최저점에 도달하는 학생의 학번과 점수를 출력하세요.
				//		- 학생 정보 중 최고점과 최저점을 제외한 점수에 해당하는 학번과 해당 점수들에 대한 평균점수(소수점 이하 두자리)를 구해 출력하세요.
				

		

		Scanner scanner = new Scanner(System.in);
		Student[] studentList = null;
		int studentNum = 0;
		boolean run = true;

		while (run) {
			System.out.println("=== 1.학생수 입력  2.학생정보 등록  3.학생정보 전체조회  4.학생정보 분석  5.종료 ===");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("학생 수 > ");
				studentNum = scanner.nextInt();
				studentList = new Student[studentNum];
				break;
			case 2:
				for (int i = 0; i < studentList.length; i++) {
					System.out.println("학번 > ");
					int id = scanner.nextInt();
					System.out.println("이름 > ");
					String name = scanner.next();
					System.out.println("점수 > ");
					int score = scanner.nextInt();

					Student student = new Student(id, name, score);
					studentList[i] = student;
				}
				break;
			case 3:
				for (Student student : studentList) {
					System.out.println(student.getId() + " 학번의 점수는 " + student.getScore() + "입니다.");
				}

				break;
			case 4:
				Student max = studentList[0];
				Student min = studentList[0];

				for (Student student : studentList) {
					if (max.getScore() < student.getScore()) {
						max = student;
					}
					if (min.getScore() > student.getScore()) {
						min = student;
					}
				}
				System.out.println("최고 점수 : " + max.getScore() + "점, 학번 : " + max.getId());
				System.out.println("최저 점수 : " + min.getScore() + "점, 학번 : " + min.getId());

				int sum = 0;
				int count = 0;

				for (Student student : studentList) {
					if ((student.getScore() != max.getScore()) && (student.getScore() != min.getScore())) {
						sum += student.getScore();
						count++;
					}
				}

				double avg = (double) sum / count;
				System.out.printf("최고점, 최저점을 제외한 평균 점수는 %.2f점 입니다.\n", avg);

				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}
