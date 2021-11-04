package com.yedam.java.ch08.wrapper;

public class Main {

	public static void main(String[] args) {
		// - 박싱 : 기본 타입의 값을 포장 객체로 만드는 과정
		// - 언박싱 : 포장 객체에서 기본 타입의 값을 얻어내는 과정
		
		//박식 언박싱 쓰는 이유는 나중에 LIST 쓸때 사용( 배열과 비슷하나 기본 타입은 사용할수 없음 ) 
		//박싱
//		Integer obj1 = new Integer(100);   //가로선~ 취소선 : 사용을 할수있지만 사용을 권장하진 않음
//		Integer obj2 = new Integer("200"); //            자바 9버전 이후론 사용권장 안함
		Integer obj4 = Integer.valueOf("200"); //문자를 int타입으로 추출할수도 있음
		
		//자동 박싱 ~new 연산자나 별도의 쿼리 없이 값을 저장하는것
		Integer obj3 = 100;
		//Integer obj5 = 100; //같은 값을 넣어도 기본적으로 다른 객체로 본다 그래서 new를 사용할 필요가 없음
		
		
		//언박싱
		int value3 = obj3.intValue(); //내부의 값을 가져옴
		
		//자동 언박싱 ~Integer로 자동 박싱한걸 int 값에 넣으면 자동으로 언박싱된다.
		int value4 = obj4;
		
		int result = obj3 + 100; //연산할때도 자동 언박싱과 같이 사용가능
		System.out.println(result);
		
		//문자열을 기본 타입 값으로 변환
		int val1 = Integer.parseInt("10");
		double val2 = Double.parseDouble("3.14");
		boolean val3 = Boolean.parseBoolean("true");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		//포장 객체 비교
		Integer obj7 = 300;
		Integer obj8 = 300;
		System.out.println(obj7==obj8); //위에 설명했듯 같은 값이라도 다른 객체에 저장됨
		System.out.println("언박싱 후 ==결과 : "+ (obj7.intValue()==obj8.intValue()));
		System.out.println("equals() 결과 : " + obj7.equals(obj8));
		
		System.out.println();
		
		//예외 p.503
		Integer obj9 = 10;
		Integer obj10 = 10;
		System.out.println(obj9==obj10); //이값이 예외로 적용되기 때문에 비교는 아래둘을 선호함
		System.out.println("언박싱 후 ==결과 : "+ (obj9.intValue()==obj10.intValue()));
		System.out.println("equals() 결과 : " + obj9.equals(obj10));
		
		
		
		
		

	}

}
