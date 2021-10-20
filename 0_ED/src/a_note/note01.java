package a_note;

import java.util.Scanner;

public class note01 {

	public static void main(String[] args) {
//02 변수와 타입
  //02-01 변수
		//변수선언
		// a와 b의 변수를 서로 바꾸는법
  //02-02 기본 타입
		//정수
		  //byte,char,short,기본-int,long(L)
		  int var1 = 365;    //10진수 일반적으로 사용
		  int var2 = 0b1011; //이진수  0b ~이진수라는걸 인지시키는문자
		  int var3 = 0206;   //8진수   0 ~8진수라는걸 인지시키는문자
		  int var4 = 0xB3;   //16진수  0x ~16진수라는걸 인지시키는문자
		  //String
		  String str = "나는 \"자바\"를 좋아합니다.";
		  System.out.println(str+"\"출력하는법 이스케이프 문자 \\ 중요" );
		  //그외 이스케이프 문자 66p
//		  \t 탭만큼 띄움
//		  \n 줄바꿈
//		  \r 캐리지리턴
		//실수
		  //float(F),기본-double
		//논리
		  //boolean
	        boolean stop = true;
	        if(stop) {
	        	System.out.println("중지합니다");
	        }
	       
	        boolean stop2 = false;
	        if(stop2) {
	        	System.out.println("중지합니다");
	        } else {
	        	System.out.println("시작합니다");
	        }
	       
	    
		

	}

}
