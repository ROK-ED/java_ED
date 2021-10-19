package com.yedam.java.ch0203;

public class variableExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue =charValue;
		System.out.println("가의 유니코드 값: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
		
		System.out.println("======= 강제 타입 변환 =========");
		
		int intValue1 = 44032;
		char charValue1 = (char)intValue1;
		System.out.println("charValue1: " + charValue1);
		
		long longValue1 = 500;
		intValue1 = (int)longValue1;
		System.out.println("intValue1: " + intValue);
		
		double doubleValue1 = 3.14;
		intValue1 = (int)doubleValue1;
		System.out.println("intValue1: " + intValue1);
		
		System.out.println("==========Quiz");
/*		
		byte byteValue2 = 65;
		char Q1 = (   )byteValue2;
		System.out.println(Q1);
		
		char charValue2 = 'B';
		short Q2 = (    )charValue2;
		System.out.println(Q2);
		
		float floatValue2 = 3.14f;
		int Q3 = (   )floatValue2;
		System.out.println(Q3);
*/		
		byte byteValue2 = 65;
		char Q1 = (char)byteValue2;
		System.out.println(Q1);
		
		char charValue2 = 'B';
		short Q2 = (short)charValue2;
		System.out.println(Q2);
		
		float floatValue2 = 3.14f;
		int Q3 = (int)floatValue2;
		System.out.println(Q3);
		
	}

}
