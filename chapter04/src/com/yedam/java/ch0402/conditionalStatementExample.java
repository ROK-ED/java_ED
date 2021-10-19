package com.yedam.java.ch0402;

public class conditionalStatementExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) { //for 문 안에 i선언
			                      //int i=0; i<0; i++
			                      //    초기화,조건,증감식
			//실행문
			System.out.println(i);
		}
		
		//
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
/*		int i = 0;
		for ( ; i<=100;) {
			sum += 1;
			i++;
			System.out.println(sum);
		}
*/

		for(int i = 0, j = 100; i<=50 && j>=50; i++,j--) {}
		
		for(int x=2; x<=9; x++) {
			System.out.println("***"+ x + "단 ***");
			for(int y=1; y<=9; y++) {
				System.out.println(x+"X"+y+"="+ x*y);
			}
		}
		
		String tree = "";
		for (int i=1; i<=5; i++) {
			
			tree += "*";
			System.out.println(tree);
			// i = 1;
			// 실행문 실행
			// 증감연산식 i++ -> i=2
			// i<=5 ->조건확인 -> 2<=5 -> TRUE
			// 실행문 실행
			// 증감연산식 i++ -> i=3
			// i<=5 ->조건확인 -> 3<=5 -> TRUE
			// 실행문 실행
			// 증감연산식 i++ -> i=4
			// i<=5 ->조건확인 -> 4<=5 -> TRUE
			// 실행문 실행
		    // 증감연산식 i++ -> i=5
			// i<=5 ->조건확인 -> 5<=5 -> TRUE
			// 실행문 실행
			// 증감연산식 i++ -> i=6
			// i<=5 ->조건확인 -> 3<=5 -> FALSE
			// for문이 종료
		}
		
	}

}
