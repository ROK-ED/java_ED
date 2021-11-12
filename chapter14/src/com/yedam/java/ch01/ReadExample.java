package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("c:/Temp/test1.db");
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
		}
		is.close();

		System.out.println();

		is = new FileInputStream("c:/Temp/test2.db");
		byte[] buffer1 = new byte[100];
		while (true) {
			int readByteNum = is.read(buffer1);
			if (readByteNum == -1)
				break;
			for (int i = 0; i < readByteNum; i++) { // 향상된 for 안쓰는 이유는 배열안에 값이 얼만큼 있는지 알수없기 때문
				System.out.println(buffer1[i]);
			}
		}
		is.close();

		System.out.println();

		is = new FileInputStream("c:/Temp/test3.db");

		byte[] buffer = new byte[5];

		int readByteNum = is.read(buffer, 2, 3);
		if (readByteNum != -1) {
			for (int i = 0; i < buffer.length/* 별로 안커 랭스로함 readByteNum */; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
	}

}
