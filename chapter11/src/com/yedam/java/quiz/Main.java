package com.yedam.java.quiz;

public class Main {

	public static void main(String[] args) {
		/*
		 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완
		 * 예를 들어 s가 a234이면 False를 리턴하고, 1234fkaus Ture를 리턴하면 됩니다.
		 */
		
		String val1 = "a234";
		String val2 = "1234";
		System.out.println(solution(val1));
		System.out.println(solution(val2));

	}
	
	public static boolean solution(String s) {
		boolean result =true;
		//문자열 s의 길이가 4 혹은 6
		if(s.length()==4|s.length()==6) {
			//숫자로만 구성
			for(int i=0; i<s.length(); i++) {
				char ch = s.charAt(i);
				// 0~9: 유니코드 48~57
				if(ch<48 || ch>57) {
					//숫자 0~9 무조건 아니다.
					return false;
				}
			}
		}
		return result;
		
	}

}
