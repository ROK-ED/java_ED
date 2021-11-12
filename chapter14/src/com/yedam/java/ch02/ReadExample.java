package com.yedam.java.ch02;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("c:/Temp/test7.txt");
		
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.println((char)data);
		}
		
		reader.close();
		
		System.out.println();
		
		reader = new FileReader("c:/Temp/test8.txt");
		
		char[] buffer1 = new char[100];
		
		while(true) {
			int readCharNum = reader.read(buffer1);
			if(readCharNum == -1)
				break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer1[i]);
			}
		}
		
		reader.close();
		
		reader = new FileReader("c:/Temp/test9.txt");
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer, 2, 3);//()()BCD
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		reader.close();

	}

}
