package com.yedam.java.ch01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteTryWithResource {

	public static void main(String[] args) throws FileNotFoundException {
/*		
		OutputStream os = null;
		try {
			os = new FileOutputStream("dataTest.txt", true);

			byte[] array = { 10, 20, 30, 40, 50 };

			os.write(array);
			os.flush();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
*/
		OutputStream os = new FileOutputStream("data01.txt", true/*해당 파일이없다면 생성함*/);
		try(os/*알아서 flush,close 다함*/){
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			os.write(bs);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

		
		
		
}
