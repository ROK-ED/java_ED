package com.yedam.java.feedback;

public class Ch02 {
	
	public static void main(String[] args) 
	{
		int a;
		int b;
		
		a = b = 10; // b = 10 담고, a = b   ~java 는 변수 를 오른쪽부터 진행
		System.out.println("a:"+a+", b:"+b);
		
		int result = a + b; // a: 10 , b: 10 = 20 -> result 에 담는다
	    System.out.println("result: "+result);
		
		
	    if(result > 5) {
	    	int c = 100;
	    	result = a + b + c;
	    	System.out.println("a: "+a+", b: "+b+", c:"+c );
	    	System.out.println("result: "+result);
	    		    	
	    }
//	    System.out.println("a: "+a+", b: "+b+", c:"+c );    //c는 if문 안에 저장되어 있어서 못 읽어냄
    	System.out.println("result: "+result);
	    
    	
    	System.out.println("==========================================");
    	byte byteValue1 = 127;
//    	byte byteValue2 = 128;      //용량초과
    	short shortValue1 = 128;
    	short shortValue2 = 32767;
//    	short shortValue3 = 32768;  //용량초과
    	int intValue1 = 32768;
    	long longValue = 324896513216L; // long 을 입력해도 기본 int로 인식하기때문에 값뒤에 L(long) 적어줘야됨
    	
    	System.out.println(byteValue1);
    	System.out.println(shortValue1);
    	System.out.println(shortValue2);
    	System.out.println(intValue1);
    	System.out.println(longValue);
    	
    	char charValue1 = 'A'; //65; ~유니코드값
    	System.out.println("charValue1: "+charValue1);
    	System.out.println("charValue1의 유니코드 값: "+(int)charValue1);  //()로 강제로 숫자변환
    	
    	//char charValue2 = "A";
    	String str1 = "A";                         ///////String 은 클래스라서 대문자로시작
    	String str2 = "홍길동, 문장!";
    	System.out.println(str1);
    	System.out.println(str2);
    	
    	float floatValue1 = 3.14F;   // float을 써도 기본인 double로 인식값뒤에 F(float) 명시
    	double doubleValue1 = 3.14;
    	System.out.println(floatValue1);
    	System.out.println(doubleValue1);
    	
    	float floatValue2 = 0.123456789123456789F;             
    	double doubleValue2 = 0.123456789123456789;
    	System.out.println(floatValue2);
    	System.out.println(doubleValue2);
    	
    	boolean stop = true;
    	stop = false;
    	
    	
    	System.out.println("==========================================");    	
    	
    	byte bValue = 100;
    	int iValue = bValue;
    	System.out.println(iValue);           //실수형에서 정수형으로 갈때 문제가 자주발생
    	
    	double dbValue = 198.87632;
    	long lnValue = (long)dbValue;       //강제로 변환할려면 캐스팅 해야됨 
    	System.out.println(lnValue);
        //int~char변환을 제외한 강제타입변환은 추천하지 않음 ~ 값손실    	
    	
	    
	    
	}

}
