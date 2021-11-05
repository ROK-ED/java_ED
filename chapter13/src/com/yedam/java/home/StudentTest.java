package com.yedam.java.home;

public class StudentTest {

	public static void main(String[] args) {
		// 1001학번 Lee와 1002학번 kim, 두 학생이 있습니다.
		// Lee학생은 2과목을 수강합니다. 국어 점수가 100점, 수학 점수가 50점입니다.
		// Kim학생은 3과목을 수강합니다. 국어 점수가 70점, 수학 점수가 85점, 영어점수가 100점입니다.
		// Student클래스와 Subject클래스를 생성한 후 두 학생의 과목성적과 총점을 각각 출력해 봅시다.
		
		Student s1 = new Student(1001, "Lee");
		s1.addSubject("국어", 100);
		s1.addSubject("수학", 50);
		
		Student s2 = new Student(1002,"Kim");
		s2.addSubject("국어", 70);
		s2.addSubject("수학", 85);
		s2.addSubject("영어", 100);
		
		s1.showStudentInfo();
		System.out.println();
		s2.showStudentInfo();
		
		
	}

}
