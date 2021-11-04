package com.yedam.java.ch10.format;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date now = new Date(); //현재 시점의 날짜와 시간 
		                      //import 할때 util 과 sql중 util사용할것임
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd"); //mm은 시간의 분
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); //MM 날짜
		System.out.println(sdf.format(now));
		System.out.println(now.toString());
		
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		System.out.println();
		
		//printf 와 비슷하지만 특정 문자열을 계속 사용할때는 이게 편함
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		// 회원 ID : java \n 회원 이름 : 신용권 \n 회원 전화 : 010-123-5678
		String text = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		String sql = "insert into member values({0},{1},{2})";
		String result2 = MessageFormat.format(sql, id,name,tel);
		System.out.println(result2);
		System.out.println();

		
		
	}

}
