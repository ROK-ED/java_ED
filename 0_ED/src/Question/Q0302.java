package Question;

import java.util.Scanner;

public class Q0302 {
	public static void main(String[] args) {
		// 문제 2
		System.out.println("문제2");
		int x2 = 10;
		int y2 = 20;
		int z2 = (++x2) + (y2--); // 증감은 괄호 유무 상관x===============================================
		System.out.println(z2);

		// 문제 3
		System.out.println("문제3");
		
//		boolean stop = ...;////////////////////////////////////////////////

		// 문제 5
		System.out.println("문제5");	
		int var1 = 5;
		int var2 = 2;
		double var3 = (double)var1 / var2;
		System.out.println(var3);
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
		// 문제 7
		System.out.println("문제7");	
		
		float var6 = 10f;
		float var7 = var6 / 100;
		System.out.println((double)var7);  //////////////////////////////////////
		if(var7 == 0.1) {
			System.out.println("10% 입니다."); 
		} else {
			System.out.println("10%가 아닙니다.");
		}
		
		// 문제 9
		System.out.println("문제9");	
/*		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 수: ");
		double a = scanner.nextDouble();
	    System.out.println("두번째 수: ");
		double b = scanner.nextDouble();
		double result;
		if( b != 0.0 ) { 
			result =  a / b ;
			System.out.println("결과: "+result);
		} else {
			System.out.println("결과: 무한대");
		}
*/		
		// 문제 12
		System.out.println("문제12");
		int x12 = 10;
		int y12 = 5;
		System.out.println( (x12>7) && (y12<=5));
		
		
		

	}

}
