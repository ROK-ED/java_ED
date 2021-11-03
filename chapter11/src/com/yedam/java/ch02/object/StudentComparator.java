package com.yedam.java.ch02.object;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>/*제너릭 타입, <>~타입 파라미터(아직 뭘쓸지 모를때)유동적으로 씀 나중에 배움*/ {

	@Override
	public int compare(Student a, Student b) {
		//일반적으로 a가 b보다 작으면 음수, 같으면 0 크면 양수를 리턴하록 클래스를 구현한다.
/*
		if(a.sno < b.sno) return -1;
		else if(a.sno == b.sno)return 0;
		else return 1;
*/		
		return Integer.compare(a.sno, b.sno); //위에 주석과 사용은 동일
	}
	

}
