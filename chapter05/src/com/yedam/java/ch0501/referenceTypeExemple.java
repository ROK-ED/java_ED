package com.yedam.java.ch0501;

public class referenceTypeExemple {

	public static void main(String[] args) {
		String strValue1 = "신미철";
		String strValue2 = "신미철";
		
		if(strValue1 == strValue2) {
			System.out.println("strValue1 과 strValue2는 참조가 같음");
		} else {
			System.out.println("strValue1 과 strValue2는 참조가 다름");
		}
	    
		String strValue3 = new String("신미철");
		String strValue4 = new String("신미철");
		
		if(strValue3 == strValue4) {
			System.out.println("strValue3 과 strValue4는 참조가 같음");
		} else {
			System.out.println("strValue3 과 strValue4는 참조가 다름");
		}
		if(strValue3.equals(strValue4)) {                                      //값이 같은지 확인하는 함수
			System.out.println("strValue3 과 strValue4는 문자열이 같음");
		}

	}

}
