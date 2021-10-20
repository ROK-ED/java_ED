package com.yedam.java.ch0502;

public class referenceTypeExemple {

	public static void main(String[] args) {
		// int[]scores = new int[3]; // |0|0|0| 3개의 공간만이 생김 int 지정안해서
		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);

		int sum = 0;
		// for(int i=0; i<=3; i++) ~~오류코드 Index 3 out of bounds for length 3 인덱스보다 값이
		// 초과한다
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}

		System.out.println("총합 :" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :" + avg);

		int[] scores1;
		
		// 변수 선언후 추가 선언 방법
		scores1 = new int[] { 83, 90, 87 };

		for (int i = 0; i < 3; i++) {
			System.out.println("scores1[" + i + "]=" + scores[i]);
		}
		
		int resulrt = add(new int[] { 83, 90, 87 });
		//int resulrt = add({ 83, 90, 87 }); //new int[]로 추가되는 변수 타입 결정
		
		
		System.out.println("============================");
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		System.out.println("============================");
		String[] arr3 = new String[3]; //배열 생성
		//String str = new String();  //스트링 생성
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
		//String = "";
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
		System.out.println("============================");
		int[] scores3 = {83,90,87};
		
		int sum3 = 0;
		for(int i=0; i<scores3.length; i++)   //배열이 가진 길이
			sum3 += scores3[i];
		
		double avg3 = (double)sum3 / scores3.length;
		System.out.println("총합 :"+ sum3);
		System.out.println("평균 :"+ avg3);
					
		
		
		
		

	}

	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;

	}

}
