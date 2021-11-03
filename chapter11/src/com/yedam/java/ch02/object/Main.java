package com.yedam.java.ch02.object;

import java.util.Objects;

public class Main {

	public static void main(String[] args) {
		//Objects.compare(객체1, 객체2, interface Comparator); 객체를 비교
		Student s1 = new Student(1);
		Student s2 = new Student(2);
		Student s3 = new Student(3);
		
		int result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println();
		
		//Objects.equals(객체1,객체2); 동등비교  //주의 두객체가 둘다 같아도 true 지만 둘다null 이여도 true
		
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(o1 == o2);
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.deepEquals(o1, o2));
		
		System.out.println();
		
		Integer[] arr1 = {1, 2};
		Integer[] arr2 = {1, 2};
		System.out.println(arr1 == arr2);
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, arr2));
		System.out.println(Objects.deepEquals(null, null));
		
		System.out.println();
		
		//해시코드 생성 : hash(), hashCode()
		//- Objects.hashCode(객체) : 객체.hashCode()  객체의 고유값 호출
		//- Objects.hash(필드1, 필드2, ...) : 주어진 매개값들로 배열을 생성하고
		//                                 Arrays.hashCode(Object[])로 호출해서 코드생성
		
		Student s4 = new Student(1, "홍길동");
		Student s5 = new Student(1, "홍길동");
		System.out.println(s4 == s5);
		System.out.println(s4.hashCode());
		System.out.println(Objects.hashCode(s5)); //s5.hashCode(); 랑 같은상황

		System.out.println();
		
		//객체의 Null 여부조사 : isNull, nonNull, requireNonNull
		
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.isNull(str1));
		System.out.println(Objects.nonNull(str2));
		System.out.println(Objects.requireNonNull(str1)); //널이 아니면 그값을 반환
		
		//출력값이 널일때 try catch 써야함
		try {
		String strResult = Objects.requireNonNull(str2, "이름이 없습니다.");  //널일때 원하는 문구를 저장
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());  //널일때 저장한 문구를 출력
		}
		System.out.println();
		
		//Objects.toString(객체) 출력
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"이름이 없습니다."));
		
				
	}

}
