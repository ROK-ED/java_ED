package com.yedam.java.ch0402_02;

public class conditionalStatementExample {

	public static void main(String[] args) {
		// 중첩 for문
		// 2 X 1 = 2
		// 2 X 2 = 4
		// ....
		// 2 X 9 = 18
		// 단이 없지만 단이 있다고 생각
		// -> 2 X n = 2 * n
		// --> for문
		// 3 X 1 = 3
		// 3 X 2 = 6
		// ---> 2 ~ 9단 까지 for문
		// ----> for문

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}
		
		// 1 부터 10까지 출력
		
		int m=1;
		while(m<=10) {
//			System.out.println(m);
			m++;
		}
		
		// 1부터 100까지 합
		
		int sum = 0;
		int i = 0;
		while (i<=100) {
			sum +=i;
			i++;
			//sum = sum + i++; 이것도 가능
		}
//		System.out.println(sum);
System.out.println("================================================================");		
		// do -while문
		int index = 1;
		
		while( index!=1 ) {
			System.out.println("while 반복문이 "+ index + "번 실행됩니다.");
		}
		do {
			System.out.println("do~while 반복문이"+ index + "번 실행됩니다.");
		} while(index != 1);
		
		// 무한루프의 이용 ~ 조건을 줄때 몇번줄지 모를경우 사용
		
		// 주사위를 던지다 6이 나오면 종료하는 조건식
		while(true) {
			int num = (int)(Math.random()*6)+1;
//			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		
		for(char upper = 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
//				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break;
				}
			}
		}

		// 157p
		Outter:for(char upper = 'A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
//				System.out.println(upper+"-"+lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		
		// continue문 [158p]
		
		// 10보다 작은 홀수 출력
		for(int I=1; I<=10; I++) {
			if(I%2==0) {    //짝수인경우

				continue;
				
			}
			System.out.println(I);
		}
		
		
	}

}
