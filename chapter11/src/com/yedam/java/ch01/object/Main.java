package com.yedam.java.ch01.object;

import java.util.Date;
import java.util.HashMap;

public class Main /*extends Object 생략되어있음*/ {

	public static void main(String[] args) {
		//객체 동등 비교(equals 메소드)
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 논리적으로 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 논리적으로 동등하지 않습니다.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 논리적으로 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 논리적으로 동등하지 않습니다.");
		}
		
		System.out.println();
		
		//객체 해시코드 : hashCode()
		
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 new Key(1)로 "홍길동"을 저장함.
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 new Key(1)로 "홍길동"을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
		System.out.println();
		//객체의 문자정보 : toString()
		Object obj4 = new Object();
		System.out.println(obj4.toString());
		
		Date obj5 = new Date();
		System.out.println(obj5.toString());
		
		System.out.println();
		
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		//객체를 매개변수로 넘길 경우 toString()메소드가 자동으로 호출되며 리턴값을 던져줌.
		System.out.println(myPhone);
		
		System.out.println();
		
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("=== 복제 객체의 필드 값 ===");
		System.out.println("id : "+cloned.id);
		System.out.println("name : "+cloned.name);
		System.out.println("password : "+cloned.password);
		System.out.println("age : "+cloned.age);
		System.out.println("adult : "+cloned.adult);
		
		System.out.println();
		
		System.out.println("=== 원본 객체의 필드 값 ===");
		System.out.println("id : "+original.id);
		System.out.println("name : "+original.name);
		System.out.println("password : "+original.password);
		System.out.println("age : "+original.age);
		System.out.println("adult : "+original.adult);
		
		System.out.println();
		
		Person originalPerson = new Person("홍길동", 25, new int[] {90,90}, new Car("소나타"));
		
		
		Person clonedPerson = originalPerson.getPerson();
		clonedPerson.scores[0] = 100;
		clonedPerson.car.model = "그랜저";
		
		System.out.println("=== 복제 객체의 필드 값 ===");
		System.out.println("name : " + clonedPerson.name);
		System.out.println("age : " + clonedPerson.age);
		System.out.println("scores : "+clonedPerson.scores[0]
										+", "+clonedPerson.scores[1]);
		System.out.println("car : "+clonedPerson.car.model);
		System.out.println();

		System.out.println("=== 원본 객체의 필드 값 ===");
		System.out.println("name : " + originalPerson.name);
		System.out.println("age : " + originalPerson.age);
		System.out.println("scores : "+originalPerson.scores[0]
										+", "+originalPerson.scores[1]);
		System.out.println("car : "+originalPerson.car.model);
		System.out.println();
		
		
		

	}

}
