package com.yedam.java.exam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student[] studentList = null;
		int studentNum = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("=== 1.학생수 입력  2.학생정보 등록  3.학생정보 전체조회  4.학생정보 분석  5.종료 ===");
			System.out.println("선택 > ");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생 수 > ");
				studentNum = scanner.nextInt();
				studentList = new Student[studentNum];
				break;
			case 2:
				for(int i=0; i<studentList.length; i++) {
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
				for(Student student : studentList) {
					System.out.println(student.getId() + " 학번의 점수는 " + student.getScore() + "입니다.");
				}
				
				break;
			case 4:
				Student max = studentList[0];
				Student min = studentList[0];
				
				for(Student student : studentList) {
					if(max.getScore() < student.getScore()) {
						max = student;
					}
					if(min.getScore() > student.getScore()) {
						min = student;
					}
				}
				System.out.println("최고 점수 : " + max.getScore() + "점, 학번 : " + max.getId());
				System.out.println("최저 점수 : " + min.getScore() + "점, 학번 : " + min.getId());
				
				int sum = 0;
				int count = 0;
				
				for(Student student : studentList) {
					if( (student.getScore()!=max.getScore()) && (student.getScore() != min.getScore()) ) {
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
