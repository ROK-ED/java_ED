package com.yedam.java.ch02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("c:/Temp/test7.txt");

		char a = 'A';
		char b = 'B';
		char c = 'C';

		writer.write(a);
		writer.write(b);
		writer.write(c);

		writer.flush();//주석처리 하던안하던 실행됨 주석처리 티가 안나는건 다시 덮어 씌우기때문
		writer.close();//그래서 남아있는걸 전부 밀어내는거라 close전에 거의 무조건 flush를 사용

		System.out.println();

		writer = new FileWriter("c:/Temp/test8.txt");
		char[] array1 = {'A','B','C'};
		
		writer.write(array1);
		
		writer.flush();
		writer.close();
		
		System.out.println();
		
		writer = new FileWriter("c:/Temp/test9.txt");
		
		char[] array2 = {'A','B','C','D','E'};
		
		writer.write(array2,1,3);// B,C,D
		
		writer.flush();
		writer.close();
	
		writer = new FileWriter("c:/Temp/test10.txt");
		
		String str = "WYZ";
		
		writer.write(str);
		writer.flush();
		writer.close();
		
		
		
	
	
	}

}
