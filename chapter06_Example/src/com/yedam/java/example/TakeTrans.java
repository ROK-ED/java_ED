package com.yedam.java.example;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생이 버스하고 지하철을 타는 프로그램
		Student student1 = new Student("james",5000);
		Student student2 = new Student("Tomas",10000);
		
		Bus bus100 = new Bus(100);
		student1.takeBus(bus100);

		student1.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		student2.takeSubway(subwayGreen);
		
		student2.showInfo();
		subwayGreen.showInfo();

	}

}
