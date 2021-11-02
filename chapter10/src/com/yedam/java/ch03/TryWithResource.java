package com.yedam.java.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		//try-with-resources 문
		
/*		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");              //파일 읽어오는 구문
		} catch (FileNotFoundException e) {
			System.out.println(e);
			return;
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
*/
		
		try(/*사용할 리소스*/AutoCloseObj obj = new AutoCloseObj()){
			//리소스를 사용하는 실행문
			
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
		
		try(FileInputStream is = new FileInputStream("a.txt")){
			
		}catch(IOException e) {
			e.printStackTrace();
			return;
		}finally {
			System.out.println("항상 수행됨니다.");
		}
		System.out.println("여기도 수행 됩니다.");
	}

}
