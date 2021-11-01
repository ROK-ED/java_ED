package com.yedam.java.example;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		
		String ch =scanner.next();
		
		Scheduler scheduler = null;
		
		if ("R".equals(ch)|"r".equals(ch))
			scheduler = new RoundRobin();
		else if ("L".equals(ch)|"l".equals(ch))
			scheduler = new LeastJob();
		else if ("P".equals(ch)|"p".equals(ch))
			scheduler = new PriorityAllocation();
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCal();
		scheduler.sendCallToAgent();
			

	}

}
