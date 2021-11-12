package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadTryWithResource {

	public static void main(String[] args) {
		try(/*OutputStream os = new FileOutputStream("data01.txt", true); 이렇게 다중선언 가능*/
				InputStream fis = new FileInputStream("data01.txt");){
			int i;
			while((i=fis.read()) != -1) {
				System.out.println((char)i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
