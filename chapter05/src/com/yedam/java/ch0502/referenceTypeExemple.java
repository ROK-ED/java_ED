package com.yedam.java.ch0502;

public class referenceTypeExemple {

	public static void main(String[] args) {
		//int[]scores = new int[3]; // |0|0|0| 3개의 공간만이 생김 int 지정안해서
		int[] scores = { 83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		
		System.out.println("총합 :"+sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :"+avg);
		

	}

}
