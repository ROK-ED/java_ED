package com.yedam.java.ch0502_02;

public class referenceTypeExample {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);       //시스템 강제종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result );
		
		
		// 200p 4번 문제
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		    if(array[i]>max) {
		    	max = array[i];
		    }
		} System.out.println(max);
		
		//161p 3번
		// while문과 Math.rendom() 함수를 이용해서
		//2개의 주사위를 던졌을 때 나오는 숫자를 (숫자1, 숫자2) 형태로 출력하고,
		//숫자의 합의 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성
		//또한 주사위를 몇번 던졌는지 횟수를 출력하세요
		// 숫자의 합이 5가 되는 조합 (1,4), (4,1) , (2,3), (3,2)
		
		
		int count = 0;
		
		
		while(true) {
			
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			count++;
			
			int sum = dice1 + dice2;
			if(sum ==5) {
				System.out.println("("+dice1+", "+dice2+")");
				break;
				
			}
			
		}
		System.out.println("주사위를 던진 횟수는 총"+count+"번 입니다.");
		
		//다차원 배열
		int[][] scores = new int[2][3];
		
		int[] score1 = new int[3];
		int[] score2 = new int[3];
		// int[] ->타입
		
		//int[][] scoreArray = new int[][2];
		//scoreArray[0] = score1;
		
		int[][] mathScores = new int[2][3];
		System.out.println(mathScores);
		
		for(int x=0; x<mathScores.length; x++) {
		    System.out.println(mathScores[x]);
			int[] temp = mathScores[x];
			for(int y=0; y<temp.length; y++) {
				System.out.println(temp[y]);
			}
		}

		for(int x=0; x<mathScores.length; x++) {
		    System.out.println(mathScores[x]);
			//int[] temp = mathScores[x];
			for(int y=0; y<mathScores[x].length; y++) {
				System.out.println(mathScores[x][y]);
			}
		}
		
		System.out.println();
		
		int[][] englichScores = new int[2][];
		//englichScores[0] //null

		englichScores[0] = new int[5];
		englichScores[1] = new int[3];
		
		System.out.println(englichScores.length);
		for(int x=0; x<englichScores.length; x++) {
			System.out.println();
			System.out.println(englichScores[x].length);
			for(int y=0; y<englichScores[x].length; y++) {
				System.out.println(englichScores[x][y]);
				
			}
		}
		System.out.println("===============================");
		int [] temp = {89,90,93};
		int [][] javaScores = { {95,80}, {92,96,80} };
		// {1차원 배열, 1차원 배열}
		// { {95,80}, {92,96,80} }
		// -> {95,80} /  {92,96,80}
		for(int x=0; x<javaScores.length; x++) {
			int[] java = javaScores[x];
			for(int y=0; y<java.length; y++) {
				int ja = java[y];
				System.out.println(ja);
			}
		}
		
		System.out.println("===============================");

		// {1차원 배열, 1차원 배열}
		// { {95,80}, {92,96,80} }
		// -> {95,80} /  {92,96,80}
		for(int x=0; x<javaScores.length; x++) {
			//int[] java = javaScores[x];
			for(int y=0; y<javaScores[x].length; y++) {
				int ja = javaScores[x][y];
				System.out.println(ja);
			}
		}
		
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.println(newIntArray[i]);
		}
		
		// System.arraycopy();  ~배열 복사 시스템 언어
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
		
		
		//향상된 for문
		int[] scoresList = {95,71,84,93,87};
		
		
		int sum = 0;
		for(int score : scoresList) {
			System.out.println(score);
			sum += score;
		}
		System.out.println("총합: "+sum);
		
		double avg = (double) sum/ scoresList.length;
		System.out.println("평균: "+avg);
		
		
		
		
	}

}
