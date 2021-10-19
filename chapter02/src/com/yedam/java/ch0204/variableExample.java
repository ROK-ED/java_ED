package com.yedam.java.ch0204;

import java.io.IOException;
import java.util.Scanner;


public class variableExample {
	public static void main(String[] args) throws IOException  {
		System.out.println("Hello World!");
		System.out.println("Today : 2021.10.15");
	
		System.out.print("Hello World!");
		System.out.print("Today : 2021.10.15");
		
		System.out.print("Hello World!\n");    // \n : 줄바꿈 ~ 이스케이프문자 중하나 
		System.out.print("Today : 2021.10.15\n");
		
		int x = 1;
		int y = 2;
		System.out.println("x: "+x+", y: "+y);
		System.out.println("====================");
		System.out.printf("x: %d, y: %d",x,y);     // %d변수값 순서대로 입력된다
		
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value); 
		System.out.printf("상품의 가격:%6d원\n", value);    //6자리 지정, 앞에 공간
		System.out.printf("상품의 가격:%-6d원\n", value);   //6자리 지정, 뒤에 공간
		System.out.printf("상품의 가격:%06d원\n", value);   //6자리 지정, 앞에 0으로

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n",10,area);
/*				
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println(keyCode);

		keyCode = System.in.read();
		System.out.println(keyCode);

		keyCode = System.in.read();
		System.out.println(keyCode);
		
		while(true) {
		keyCode = System.in.read();
		System.out.println(keyCode);
		}
*/		
	
		Scanner scanner = new Scanner(System.in);     // 컨트롤 쉬프트 o 로 import 선언
		
		String inputData = scanner.nextLine();
		System.out.println(inputData);
		
		
		
	}

}
