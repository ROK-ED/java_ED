package com.yedam.java.ch0201;

public class variableExample {
	public static void main(String[] args) {
		
		int hour =3;
		int minute =5;
		System.out.println(hour+"시간"+minute+"분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		
		int x, y, z;
		
		x = 1;
		y = 2;
		z = x + y;
		
		System.out.println(x + "+" + y + "=" + z); 
		
		
		/*
		int a, b, c, d, e, f;
		
		a = 54;
		b = 36;
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		
		System.out.println(a + "+" + b + "=" + c);
		System.out.println(a + "-" + b + "=" + d);
		System.out.println(a + "*" + b + "=" + e);
		System.out.println(a + "/" + b + "=" + f);
		*/
		
		System.out.println("정수형 변수 3개를 이용하여 54와 36의 사칙연산 결과값을 출력하시오");
		int a, b, c;
		
		a = 54;
		b = 36;
		
		c = a + b;
		System.out.println(a + "+" + b + "=" + c);
        c = a - b;
		System.out.println(a + "-" + b + "=" + c);
		c = a * b;
		System.out.println(a + "*" + b + "=" + c);
		c = a / b;
		System.out.println(a + "/" + b + "=" + c);
		
		// a와 b의 변수를 서로 바꾸는법
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		//System.out.println(a);
		//System.out.println(b);
		System.out.println("a:"+ a + ", b:" + b);
		//System.out.println(a + "," + b);
		
			
		int v1 = 0;
		int v2 = 2;
		int v3 = v1 + v2;
		if(v1 >= 0) {
			v1 = 1;
			if(v2 == 0) {
				v2 =2;
			System.out.println("v1: " + v1 + ", v2: " + v2 + ", v3: " + v3);
			}
			System.out.println("v1: " + v1 + ", v2: " + v2 + ", v3: " + v3);	
		}
		
		System.out.println("v1: " + v1 + ", v2: " + v2 + ", v3: " + v3);
	

	/*
	for(int i = 0; i< 10; i++) {
		int sum = 0;
		sum = sum + 1;
		*/
	   int m = 10;
       int n = 21;
	   int sum = m+n ;
	   if(m>=10) {

			}
	System.out.println("sum :" + sum);	
	}
}
