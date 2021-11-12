package com.yedam.java.ch01;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("c:/Temp/test1.db");

		byte a = 10;
		byte b = 20;
		byte c = 30;

		os.write(a);
		os.write(b);
		os.write(c);

		// os.flush();
		os.close();

		System.out.println();

		os = new FileOutputStream("c:/Temp/test2.db");

		byte[] array1 = { 10, 20, 30 };

		os.write(array1);

		// os.flush();
		os.close();

		os = new FileOutputStream("c:/Temp/test3.db");
		byte[] array2 = { 10, 20, 30, 40, 50 };

		os.write(array2, 1, 3); //20, 30, 40

		os.flush();
		os.close();

	}

}
