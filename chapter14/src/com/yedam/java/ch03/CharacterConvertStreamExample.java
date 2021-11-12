package com.yedam.java.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception {
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		
	}

	// 출력스트림
	public static void write(String str) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/test1.txt",true/*true : 파일을 생성하거나, 생성된파일 뒤에 문구를 추가한다*/);
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		writer.flush();
		writer.close();
	}

	// 입력스트림
	public static String read() throws Exception{
		FileInputStream fis = new FileInputStream("C:/Temp/test1.txt");
		Reader reader = new InputStreamReader(fis);
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
		
		
	}
}
