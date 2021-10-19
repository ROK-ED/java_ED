package com.yedam.java.homework;

public class Homework {

	public static void main(String[] args) {
		//1
		int x = 37;
		int y = 91;
		
		System.out.println("x : "+x+", y : "+y);
		//2
		System.out.println(y+x);
		System.out.println(y-x);
		System.out.println(y*x);
		System.out.println(y/x);
		
		//3
		//byte var = 128;
           int var1 = 128;
		   System.out.printf("%d, int\n",var1);
		   String var2 = "B";
		   System.out.printf("%s, String\n",var2);
		   char var3 = 44032;
		   System.out.printf("%c, char\n",var3);
		   long var4 = 100000000000L;
		   System.out.printf("%d, long\n",var4);
		   double var5 = 43.93106;
		   System.out.printf("%.5f, double\n",var5);
		   float var6 = 301.3f;
		   System.out.printf("%.1f, float\n",var6);
		   
		//5
		    int intValue1 = 24;
		    int intValue2 = 3;
		    int intValue3 = 8;
		    int intValue4 = 10;
		    char charValue = 'A';
		    String strValue = "번지";
		    
		   //A278번지10.0
		   // 278 => 24+3 / 8
		   
		   String strResult = String.valueOf(charValue) + (intValue1 + intValue2)
				             + intValue3 + strValue + (double)intValue4 ; 
		   System.out.println(strResult);
        //추가
		  int value = 485 ;
		  
		  int hundered = value / 100;
		  int ten = (value - (hundered*100))/10;
		  int one = value - (hundered*100) - (ten*10);
		  
		  int intResult = hundered + ten + one;
		  System.out.println(intResult);

	}

}
