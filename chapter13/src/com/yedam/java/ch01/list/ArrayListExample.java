package com.yedam.java.ch01.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database"); //(0,1,2)3번째 위치 지정
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : "+size);
		System.out.println();
		
		String skill =list.get(0);
		System.out.println("0번째 "+skill);
		System.out.println();
		
		for(String str : list) { //향상된 for문 사용
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2); //Database 삭제
		list.remove(2); //Servlet/JSP 삭제
		list.remove("iBATIS"); //iBATIS 삭제
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
	}

}
