package com.yedam.java.ch0401;

import java.util.Scanner;

public class conditionalStatementExample {

	public static void main(String[] args) {
		System.out.println("Ctrl + Shift + F ~ 자동정렬");
		
		// 기본 IF문  ~ 조건에 부합하는 여러 IF 전부 실행
		int score = 90;

		if (score >= 90) {
			System.out.println("점수가 90보다 큼니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score <= 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}

		// IF~ELSE 문 ~조건에 부합하는 IF 또는 ELSE실행
		if (score >= 90) {
			System.out.println("점수가 90보다 큼니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		
		System.out.println("=============================");
		// IF ~ ELSE IF ~ ELSE 구문           //ELSE 는 필수X, 필요에따라
		score = 75;
		
		if (score >= 90) {
			System.out.println("점수가 100~90입니다..");
			System.out.println("등급은 A입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 89~80니다.");
			System.out.println("등급은 B입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 79~70니다.");
			System.out.println("등급은 C입니다.");
		} else {
			System.out.println("점수가 70미만니다.");
			System.out.println("등급은 D입니다.");
		}
		
		System.out.println("=============================");
		
		int num = (int) (Math.random()*6)+1;    
		          //랜덤하게 6개의 정수가 주어진다
	    // 0.0 <= Math.ramdom() < 1.0 사이의 값이 주어진다.
		// 0.0 * 10 <= Math.random() * 10 < 1.0 * 10
		// (int) 0 <= (int) Math.random() * 10 < (int) 10
		// (int) 0 + 1 <= (int) Math.random() * 10 + 1 < (int) 10 + 1
		
		// (int)Math.random() * 갯수 + 시작숫자;
		
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else if(num == 6) {
			System.out.println("6번이 나왔습니다.");
		}

		System.out.println("=======Quiz");
/*		Scanner scanner = new Scanner(System.in);
		
		//문제1) 두개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'를 출력하도록 구현하세요
		int a = scanner.nextInt();
		       //엔터를 치는 순간까지 숫자를 입력 받겠다.
		int b = scanner.nextInt();
		
		if (a+b > 0) {
			System.out.println("Natural Number");
		}
		//문제2) 두개의 정수가 주어졌을 때
		//    두 수의 대소관계에 따라 부등호(> , = , <)를 출력하도록 구현하세요.
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		if (c>d) {
			System.out.println(c+">"+d);
		} else if (c == d) {
			System.out.println(c+"="+d);
		} else if (c<d) {
			System.out.println(c+"<"+d);
		}
		
		//문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과박을 출력하도록 구현하세요.
		// BMI = 체중 / ( 키 * 키 )
		// 저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
		
		double w = scanner.nextDouble();
		double h = scanner.nextDouble();
	    double B = w/(h*h);
	    System.out.println(B);
		
		if ( B < 18.5) {
			System.out.println("저체중");
		} else if ( B < 25) {
			System.out.println("정상");
		} else if ( B < 30) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
		if ( B >= 30) {
			System.out.println("비만");
		} else if ( B >= 25) {
			System.out.println("과제중");
		} else if ( B >= 18.5) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}
*/		
		
		System.out.println("=============================");
		//switch ~if else보다 가독성이 뛰어남  
		
		int random = (int) (Math.random()*6)+1;
		
		switch(random) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;     //특별한 경우가 아닌이상 꼭 필요, 없다면 다음 케이스도 필요없이 실행함
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:   //case 외, 생략가능
			System.out.println("6번이 나왔습니다.");
			break;  //default에는 break 필요없음 ~어차피 마지막까지 가서 실행되는 문구라 멈출 필요없음 
		}
		
		//break 응용
		//누적출력
		int time =(int)(Math.random()*4) + 8;
		System.out.println("현재시각 : " +time+"시");
		
		switch(time) {
		case 8 :
			System.out.println("출근합니다.");
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		} 
		
		//다중 조건
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");	
		} 
		
		String position = "과장";
		
		switch(position) {
		case "부장" :
			System.out.println("700만원");
			break;
		case "과장" :
			System.out.println("500만원");
			break;
		default :
			System.out.println("300만원");
		}
		
		System.out.println("=============================");
//		Scanner scanner = new Scanner(System.in);
		//문제4) 구구단을 출력하되 입력받는 단의 6번째 값을 출력하도록 구현하세요
		// 예를 들어, 2단 일 경우엔 2 * 6 = 12
		// 출력문에는 변수를 사용하지 않습니다.
//		int q4 = scanner.nextInt();
		int q4 = 2;
		
		switch (q4*6) {
		case 6 :
			System.out.println("1단 6");
			break;
		case 12 :
			System.out.println("2단 12");
			break;
		case 18 :
			System.out.println("3단 18");
			break;
		case 24 :
			System.out.println("4단 24");
			break;
		case 30 :
			System.out.println("5단 30");
			break;
		case 36 :
			System.out.println("6단 36");
			break;
		case 42 :
			System.out.println("7단 42");
			break;
		case 48 :
			System.out.println("8단 48");
			break;
		case 54 :
			System.out.println("9단 54");
			break;
		}
		
		switch(q4) {
		case 1:
			System.out.printf("%d * 6 = %d\n",1,1*6);
			
			
			
		}
		
		//문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 입력받은 점수에 대한 등급을 출력하라
		//점수 범위는 0 ~ 100점이고
		// 90점 이상 100점 이하 : A 등급
		// 80점 이상 90점 미만 : B 등급
		// 70점 이상 80점 미만 : C 등급
		// 60점 이상 70점 미만 : D 등급
		// 60점 미만 : E 등급
//		int q5 = scanner.nextInt();
		int q5 = 95;
		
		
		switch (q5/10) {
		case 10 :
		case 9 :
			System.out.println("A등급");
		    break;
		case 8 :
			System.out.println("B등급");
			break;
		case 7 :
			System.out.println("C등급");
			break;
		case 6 :
			System.out.println("D등급");
			break;
		default :
			System.out.println("E등급");
       	}
		
	}

}
