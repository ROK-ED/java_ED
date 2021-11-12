package com.yedam.java.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {

	   public static void main(String[] args) throws Exception {

		      String originalFilePath1 = 
		            NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		      String targetFileParth2 = "C:/Temp/targetFile.jpg";
		      
		      FileInputStream fis = new FileInputStream(originalFilePath1);
		      FileOutputStream fos = new FileOutputStream(targetFileParth2);
		      
		      long nonBufferTime = copy(fis, fos);
		      System.out.println("버퍼를 사용하지 않았을 때 " + nonBufferTime + "ns");
		      
		      
		      
		      String originalFilePath3 = 
		            NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		      String targetFileParth4 = "C:/Temp/targetFile.jpg";
		      
		      FileInputStream fis3 = new FileInputStream(originalFilePath3);
		      FileOutputStream fos4 = new FileOutputStream(targetFileParth4);
		      
		      BufferedInputStream bis = new BufferedInputStream(fis3);
		      BufferedOutputStream bos = new BufferedOutputStream(fos4);
		      
		      long bufferTime = copy(bis, bos);
		      System.out.println("버퍼를 사용하였을 때 " + bufferTime + "ns");
		      
		      fis.close();
		      fos.close();
		      bis.close();
		      bos.close();
		      
		   }

		   
		   
		   static int data = -1;
		   public static long copy(InputStream is, OutputStream os) throws Exception{
		      long start = System.nanoTime();
		      while(true) {
		         data = is.read();
		         if(data == -1) break;
		         os.write(data);
		      }
		      long end = System.nanoTime();
		      
		      return (end-start);
		   }
		}
