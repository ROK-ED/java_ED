package com.yedam.java.ch0203_02;

public class variableExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
//		byte result = byteValue1 + byteValue2;
		// int + int 로 인식
		int byteResult = byteValue1 + byteValue2;
		
		char charValue1 = 'A';
		char charvalue2 = 1;
//		char charResult = charValue1 + charvalue2;
		//위와 동일한 문제
		int charResult = charValue1 + charvalue2;
		
		int intValue1 = 10;
		int intValue2 = intValue1/4;  //결과값 2 ~int는 정수 타입이라 소수점단위 생략
		
		System.out.println("byteResult: "+byteResult);
		System.out.println("charResult, 유니코드 값: "+charResult);
		System.out.println("charResult, 출력문자: "+(char)charResult);
		System.out.println("intValue2: "+intValue2);

		double doubleValue = intValue1/4;  
		/// int계산후  double로 담겨서 소수점 아래데이터가 없다
		/// 순서
		/// intValue1 -> 10
		/// 4
		/// 10/4
		/// 2.5 -> 2
		/// double 타입 doubleValue = 2;
		/// 2.0;
		System.out.println(doubleValue);
		
		double doubleValue1 = intValue1/4.0;
		System.out.println(doubleValue1);
		
		System.out.println("======= Quiz");
/*
		byte x = 10;
		byte y = 20;
		int m = 30;
		long n =70L;
		
		result1 = x + y + m ;
		System.out.println(result1);
		result2 = x + y + n ;
		System.out.println(result2);
		
		int x1 = 100;
		long y1 = 140L;
		float f1 = 3.14F;
		double d1 = 10.15;
		
		result3 = x1 + y1 + f1;
		System.out.println(result3);
		result4 = y1 + f1  + d1;
		System.out.println(result4);
*/
		byte x = 10;
		byte y = 20;
		int m = 30;
		long n =70L;
		
		int result1 = x + y + m ;
		//           int+int+int
		//결과값 int 필요
		System.out.println(result1);
		long result2 = x + y + n ;
		//            int+int+long
		//범위가 큰 long의 결과값 필요
		System.out.println(result2);
		
		int x1 = 100;
		long y1 = 140L;
		float f1 = 3.14F;
		double d1 = 10.15;
		
		float result3 = x1 + y1 + f1;
		//             int+long+float
		//             int+long 먼저 -> long
		//                long+float
		//범위가 큰 float
		System.out.println(result3);
		double result4 = y1 + f1  + d1;
		//              long+float+double
		//범위가큰 double
		System.out.println(result4);
		
		int value = 10 + 2 + 8; // 10 + 2 -> 12 + 8 -> 20;
		String str1 = 10 + 2 + "8"; // 12 + "8" -> "12" + "8" -> 128;
	    String str2 = 10 + "2" + 8; // "10" + "2" -> "102" + "8" -> 1028;
	    String str3 = "10" + 2 + 8; // "10" + "2" -> "102" + "8" -> 1028;
	    String str4 = "10" + (2 + 8); // 2 + 8 -> "10" + 10 -> 1010;
	    
	    System.out.println(value);
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	    System.out.println(str4);
	    
	    int value1 = Integer.parseInt("10") + 2 + 8;
	    // Integer.parseInt() 안에 들어가는 문장을 숫자로 .pares
	    System.out.println(value1);
	    
	    double value2 = Double.parseDouble("3.14");
	    System.out.println(value2);
	    boolean value3 = Boolean.parseBoolean("true");
	    		
	    if(value3) {
	    	double result = value2 + 1;
	    	System.out.println(result);
	    }
	    
	    String str5 = String.valueOf(10);
	    String str6 = String.valueOf(10.5);	
	    String str7 = String.valueOf(true);
	    
	    String strResult = str5 + str6 + str7 ;
	    System.out.println(strResult);
	    
	   
	    
	    System.out.println("======= Quiz2");
	    
	    int a = 10;
	    int b = 2;
	    double c = 4.75;
	    String str = "숫자결합";
	    
	    // 10숫자결합6.75
	    // 10 + 숫자결합 + 6.75
	    // 10 + 숫자결합 + 2 + 4.75
	    // a + str     + b + c
	    
	    String strResult1 = a + str + b + c ; //계산 순서때문에 답이 다름
	    System.out.println(strResult1); 
	    
	    String qResert = a + str + (b + c);
	    System.out.println(qResert);
	    
	    ///////
	    double qStr = b + c;
	    String qStr1= String.valueOf(qStr);  
	    
	    String qResert2 = a + str + qStr1;
	    System.out.println(qResert2); 
		
		
		
		
	}

}
